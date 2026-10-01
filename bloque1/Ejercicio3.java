
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);

            System.err.println("Que navegador desea usar: \n 1. Edge \n 2. Chrome");
            String navegador = sc.nextLine();

            System.out.println("Ingrese la url:");
            String url = sc.nextLine();

            String rutaChrome = "C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe";

            String rutaEdge = "C:\\Program Files (x86)\\Microsoft\\Edge\\Application\\msedge.exe";

            if (navegador.equalsIgnoreCase("edge")) {
                ProcessBuilder edge = new ProcessBuilder(rutaEdge,url);
                edge.start();

            }else if (navegador.equalsIgnoreCase("chrome")) {
                ProcessBuilder chrome = new ProcessBuilder(rutaChrome,url);
                chrome.start();
            }
            else{
                System.out.println("No a introducido ningun navegador de los indicados");
            }
        } catch (Exception e) {
        }
    }
}
