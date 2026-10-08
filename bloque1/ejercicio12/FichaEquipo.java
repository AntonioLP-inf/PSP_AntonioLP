package ejercicio12;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
public class FichaEquipo {
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
        //Ejecutar el comando systeminfo
        ProcessBuilder pb = new ProcessBuilder("cmd.exe", "/c", "systeminfo");
        Process process = pb.start();

        //Leer la salida del comando
        BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
        FileWriter writer = new FileWriter("equipo.txt");
        String line;
        int count = 0;

        while ((line = reader.readLine()) != null) {
            if (line.contains("Nombre de host") || line.contains("Nombre del sistema operativo") 
                || line.contains("Modelo del sistema")) {
                writer.write(line + System.lineSeparator());
                count++;
            }
        }
        writer.close();
        reader.close();
        process.waitFor();
        System.out.println(count + " datos guardados en equipo.txt");
    } catch (Exception e) {
        e.printStackTrace();
    }
 }
}
