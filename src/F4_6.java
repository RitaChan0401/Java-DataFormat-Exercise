import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class F4_6 {
    public static void main(String[] args) {
        List<Enrollee> list = Arrays.asList(
                new Enrollee("00AJ00", "小濱", 80),
                new Enrollee("))AJ99", "高野", 90)
        );
        System.out.println(toHeader(list.get(0)));
        for (Enrollee e : list) {
            System.out.println(toCsv(e));
        }
    }

    public static final String DELIMITER = ",";

    public static String toHeader(Object object) {
        Field[] fields = object.getClass().getDeclaredFields();
        if (fields == null || fields.length == 0) {
            return "";
        }
        List<String> list = new ArrayList<String>(fields.length);
        for (Field field : fields) {
            list.add(field.getName());
        }
        return String.join(DELIMITER, list);
    }

    public static String toCsv(Object object) {
        Class<?> clazz = object.getClass();
        Field[] fields = clazz.getDeclaredFields();
        List<String> list = new ArrayList<>(fields.length);
        for (Field field : fields) {
            try {
                PropertyDescriptor pd = new PropertyDescriptor(field.getName(), clazz);
                Method method = pd.getReadMethod();
                Object obj = method.invoke(object);
                list.add(obj.toString());
            } catch (IllegalAccessException | IntrospectionException | InvocationTargetException e) {
                e.printStackTrace();
            }
        }
        return String.join(DELIMITER,list);
    }
}
