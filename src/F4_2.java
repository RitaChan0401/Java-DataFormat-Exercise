import java.lang.reflect.Field;

public class F4_2 {
    public static void main(String[] args) {
        Enrollee enrollee = new Enrollee("00AJ00" , "山田" , 70);
        Instructor instructor = new Instructor("00SD00" , "山田");

    }
    public static void print(Object object){
        Class<?> clazz = object.getClass();
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields){
            System.out.println(field.getName());
        }
    }
}
