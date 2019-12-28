//import javax.json.bind.Jsonb;
//import javax.json.bind.JsonbBuilder;
//import javax.json.bind.JsonbConfig;
//import java.nio.file.Paths;
//import java.util.List;
//
//public class F7_2 {
//    public static void main(String[] args) {
//        String all = JsonUtils.readAll(Paths.get("data6.json"));
//        JsonbConfig jsonbConfig = new JsonbConfig();
//        jsonbConfig.withFormatting(true);
//        Jsonb jsonb = JsonbBuilder.create(jsonbConfig);
//        EnrolleeLocator locator = jsonb.fromJson(all.EnrolleeLocator);
//        for (Enrollee enrollee :locator){
//            System.out.print(enrollee.getId());
//            System.out.println(enrollee.getName());
//            List<Score> scores = enrollee.getScore();
//            for (Score score : scores){
//                System.out.print(score.getSubject());
//                System.out.println(" " + score.getScore());
//            }
//            System.out.println();
//        }
//    }
//}
