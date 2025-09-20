import org.json.*;
import java.nio.file.*;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String content = new String(Files.readAllBytes(Paths.get("input.json")));
        JSONObject j = new JSONObject(content);

        int n = j.getJSONObject("keys").getInt("n");
        int k = j.getJSONObject("keys").getInt("k");
        System.out.println("n = " + n + ", k = " + k);

        for (int i = 1; i <= n; i++) {
            JSONObject root = j.getJSONObject(Integer.toString(i));
            int base = Integer.parseInt(root.getString("base"));
            String value = root.getString("value");
            int decimalValue = Integer.parseInt(value, base);
            System.out.println("Root " + i + " in decimal: " + decimalValue);
        }
    }
}
