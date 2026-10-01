import java.io.*;


public class lanzador {
    public static void main(String[] args) {
        try{
        System.out.println("soy la clase principal");

        String java = System.getProperty("java.home") + File.separator + "bin" + File.separator + "java";
        String cp = System.getProperty("java.class.path");

        //Lanzar la calse Saludo en una maquina virtual nueva
        ProcessBuilder pb = new ProcessBuilder(java, "-cp", cp, "Ejercicio11.saludador");
        Process hijo = pb.start();
        //Leer lo que el hijo escribe con System.out
        BufferedReader br = new BufferedReader(new InputStreamReader(hijo.getInputStream()));
        String linea;
        while((linea = br.readLine()) != null){
            System.out.println(linea);
        }

        hijo.waitFor();
        System.out.println("El proceso hijo ha terminado con codigo de salida: ");
        
    } catch (Exception e) {
        System.out.println("Error al ejecutar el comando: " + e.getMessage());
        e.printStackTrace();
    }
}
}
