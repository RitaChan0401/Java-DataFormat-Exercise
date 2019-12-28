import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;
import javax.json.bind.JsonbConfig;

public class F6_4 {
    public static void main(String[] args) {
        Path jsonPath = csv2json(Paths.get("data2.csv") , Paths.get("data5.json"));
        System.out.println(jsonPath.getFileName());
    }

    public static Path csv2json(Path csvPath, Path jsonPath) {
        List<String> list = CsvUtils.readAllLines(csvPath);

        JsonbConfig jsonbConfig = new JsonbConfig();
        jsonbConfig.withFormatting(true);

        Jsonb jsonb = JsonbBuilder.create(jsonbConfig);
        for (String line:list) {
            try {
                return Files.write(csvPath, Files.readAllBytes(jsonPath));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return jsonPath;
    }
}
