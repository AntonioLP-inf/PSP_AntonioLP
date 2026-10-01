import java.io.File;
import java.io.*;
public class Ejercicio8 {
    

    public static void main(String[] args) {
        /*
         * 8.Desarrolla un programa capaz de guardar la lista de procesos en ejecucion
         * en tu ordenador en un´txt. Para ello, en lugar de utlizar el CMD, utliza
         * PowerShell
         */
        try{
         
           
            //Contruimos el comando de PowerShell: Get-Process
            ProcessBuilder pb = new ProcessBuilder("powershell.exe", "/C " ,"Get-Process");
            //Iniciamos el proceso
            Process proceso = pb.start();
            //Creamos un BufferedReader para leer la salida del proceso
            BufferedReader br = new BufferedReader(new InputStreamReader(proceso.getInputStream()));
            String linea;
            //Crear el archivo de salida
            File archivoSalida = new File("procesos.txt");
            FileWriter fw = new FileWriter(archivoSalida, false );
            
            while((linea = br.readLine()) != null){
                //guardamos la linea en el archivo de salida
                fw.write(linea + System.lineSeparator());
                System.out.println(linea);
            }
            br.close();
            fw.close();
            //Esperamos a que el proceso termine
            proceso.waitFor();
            //Mostramos un mensaje indicando que el archivo se ha creado correctamente
            System.out.println("Archivo de salida creado correctamente: ");
            //Mostramos un mensaje indicando que el proceso ha terminado
            System.out.println("Proceso terminado con codigo de salida: " );
            


        } catch (Exception e) {
            System.out.println("Error al ejecutar el comando: " + e.getMessage());
        } 
    }
}

