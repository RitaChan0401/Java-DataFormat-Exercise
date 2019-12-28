import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class F2_7 {
    public static void main(String[] args) {
        String PathName = "data1";
        byte[] data = new byte[0];
        try{
            data = Files.readAllBytes(Paths.get(PathName));
        }catch (IOException e){
            e.printStackTrace();
        }
        for (int i = 0; i < data.length; i++){
            System.out.println(String.format("%02x" , data[i]));
        }
    }
}
