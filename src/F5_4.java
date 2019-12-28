import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;
import java.nio.file.Paths;

public class F5_4 {
    public static void main(String[] args) {
        String all = JsonUtils.readAll(Paths.get("data3.json"));

        Jsonb jsonb = JsonbBuilder.create();
        EnrolleeLocator locator = jsonb.fromJson(all,EnrolleeLocator.class);

        for (Enrollee enrollee:locator){
            System.out.println(enrollee.getId()+ "");
            System.out.println(enrollee.getName()+ "");
            System.out.println(enrollee.getScore());
        }
    }
}
