
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ejercicio5 {
    public static void main(String[] args) {
        try {
            
            String comando = "ping 8.8.8.8";

            ProcessBuilder cmd = new ProcessBuilder("CMD", "/C", comando);

            Process proceso = cmd.start();

            BufferedReader reader = new BufferedReader(new InputStreamReader(proceso.getInputStream()));
            String linea;

            while ((linea = reader.readLine())!= null) {
                System.out.println(linea);
                
            }
            int exitCode = proceso.waitFor();
            System.out.println("Comando terminado con codigo de salida: " + exitCode);
        } catch (Exception e) {
        }
    }
}
