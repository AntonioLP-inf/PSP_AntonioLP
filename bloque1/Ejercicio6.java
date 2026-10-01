import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ejercicio6 {
    public static void main(String[] args) {
        try {
            
        String comando = "ipconfig";

        ProcessBuilder cmd = new ProcessBuilder("CMD","/C",comando);

        Process proceso = cmd.start();

        BufferedReader reader = new BufferedReader(new InputStreamReader(proceso.getInputStream()));
            String linea;

            
        while ((linea = reader.readLine())!= null) {
            if (linea.contains("IPv4")) {
                System.out.println(linea.substring(47));
            }
                
            }
        } catch (Exception e) {
                }

    }
}
