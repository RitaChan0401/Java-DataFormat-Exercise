import java.beans.IntrospectionException;
        import java.beans.PropertyDescriptor;
        import java.lang.reflect.InvocationTargetException;
        import java.lang.reflect.Method;
        import java.util.Arrays;
        import java.util.List;

public class F3_20 {
    public static void main(String[] args) {
        List<Enrollee> list = Arrays.asList(
                new Enrollee("00AJ00" , "小濱" , 80),
                new Enrollee("00AJ99" , "高野", 90)
        );

        for (Enrollee enrollee : list){
            try{
                Class<?> clazz = enrollee.getClass();
                PropertyDescriptor pd = new PropertyDescriptor("name", clazz);
                Method method = pd.getReadMethod();
                Object object = method.invoke(enrollee);
                System.out.println(object.toString()+"");
            }catch (IntrospectionException | IllegalArgumentException |
                    IllegalAccessException | InvocationTargetException e){
                e.printStackTrace();
            }
        }
    }
}
