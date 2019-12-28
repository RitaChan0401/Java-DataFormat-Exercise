import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;

public class F6_1 {
    public static void main(String[] args) {
        Jsonb jsonb = JsonbBuilder.create();

        EnrolleeLocator locator = new EnrolleeLocator();
        locator.add(new Enrollee("00AJ03" , "高田" , 60));
        locator.add(new Enrollee("00AJ04" , "山田" , 80));

        System.out.println(jsonb.toJson(locator));
    }
}
