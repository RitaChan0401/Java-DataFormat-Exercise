import java.util.ArrayList;
import java.util.List;
public class F2_11 {
    public static void main(String[] args) {
        List<String> list = asList("a" , "b" ,"c");

        for (String s: list){
            System.out.println(s);
        }
    }
    public static List<String> asList(String... strings){
        List<String> list = new ArrayList<String>(strings.length);
        for (String s:strings){
            list.add(s);
        }

        return list;
    }
}

