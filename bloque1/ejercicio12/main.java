package ejercicio12;
import java.io.File;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class main {
    /*Repaso 2. Ficha del equipo.
Crea dos clases, `Main.java` y `FichaEquipo.java`:
  - FichaEquipo.java: ejecuta en el CMD el comando `systeminfo`, que devuelve unas 70 líneas con los datos del ordenador y tarda unos segundos. De todas ellas, guarda en `equipo.txt` solo  las que contienen `Nombre de host`, `Nombre del sistema operativo` y `Modelo del sistema`.  Al terminar, escribe por consola cuántas líneas ha guardado.
  - Main.java: avisa de que está generando la ficha, lanza `FichaEquipo` en un proceso nuevo, muestra lo que escribe, espera a que termine y, solo entonces, avisa de que la ficha está lista.

Main muestra algo como:
Generando la ficha del equipo, espera...
[FichaEquipo] 3 datos guardados en equipo.txt
Ficha terminada.

Y en `equipo.txt` se escribe algo como:
Nombre de host:                            PC-AULA-07
Nombre del sistema operativo:              Microsoft Windows 11 Pro
Modelo del sistema:                        OptiPlex 7010 */
 public static void main(String[] args) {
    
    try {
        System.out.println("Generando la ficha del equipo, espera...");
        String java = System.getProperty("java.home") + File.separator + "bin" + File.separator + "java";
        String classpath = System.getProperty("java.class.path");

        ProcessBuilder pb = new ProcessBuilder(java, "-cp", classpath, "ejercicio12.FichaEquipo");
        Process process = pb.start();

        //Mostrar lo que escribe FichaEquipo
        BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println("[FichaEquipo] " + line);
        }
        //Esperar a que termine
        process.waitFor();
        System.out.println("Ficha terminada.");
    } catch (Exception e) {
        e.printStackTrace();
    }
 }
}
