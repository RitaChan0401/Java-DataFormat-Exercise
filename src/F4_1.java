import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;

public class F4_1 {
    public static void main(String[] args) {
        Enrollee enrollee = new Enrollee("00AJ00" , "山田" , 70);
        Instructor instructor = new Instructor("00SD00" , "山田");
        print1(enrollee);
        print2(instructor);
        print(enrollee);
        print(instructor);
    }
    public static void print1(Enrollee enrollee){
        System.out.print("id:" + enrollee.getId() + " ");
        System.out.print("name:" + enrollee.getName() + " ");
        System.out.println("score:" + enrollee.getScore());
    }
    public static void print2(Instructor instructor){
        System.out.print("id:" + instructor.getId() + " ");
        System.out.print("name:" + instructor.getName() + " ");
    }
    public static void print(Object object){
        Class<?> clazz = object.getClass();
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields){
            try{
                PropertyDescriptor pd = new PropertyDescriptor(field.getName(),clazz);
                Method method = pd.getReadMethod();
                Object ro = method.invoke(object);
                System.out.println(field.getName()+" "+ro.toString()+" ");
            } catch (IllegalAccessException | IntrospectionException | InvocationTargetException e) {
                e.printStackTrace();
            }
        }
        System.out.println();
    }
}
