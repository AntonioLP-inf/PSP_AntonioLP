// CLASE Main · el asistente de soporte
// ============================================================================
// RECORDATORIO · es el mismo en todos los ficheros del examen
// ============================================================================
//
// import java.io.BufferedReader;
// import java.io.File;
// import java.io.FileWriter;
// import java.io.InputStreamReader;
// import java.util.Scanner;
//
// Crear un proceso para un programa (el programa y, detrás, lo que haya que darle):
//     ProcessBuilder pb = new ProcessBuilder("programa", "argumento");
//
// Crear un proceso para un comando del CMD o de PowerShell:
//     ProcessBuilder pb = new ProcessBuilder("cmd", "/c", comando);
//     ProcessBuilder pb = new ProcessBuilder("powershell.exe", "/c", comando);
//
// Crear un proceso para otra clase de Java:
//     String java = System.getProperty("java.home") + File.separator + "bin" + File.separator + "java";
//     String cp = System.getProperty("java.class.path");
//     ProcessBuilder pb = new ProcessBuilder(java, "-cp", cp, "NombreDeLaClase");
//
// Crear un lector para lo que escribe un proceso:
//     BufferedReader reader = new BufferedReader(new InputStreamReader(proceso.getInputStream()));
//
// Crear un fichero de texto para escribir (false = se sobrescribe; true = se añade al final):
//     FileWriter writer = new FileWriter("fichero.txt", false);
//
// ============================================================================
// PROGRAMAS DE WINDOWS (se abren con su nombre, salvo Edge)
// ============================================================================
//     notepad       Bloc de notas
//     mspaint       Paint
//     calc          Calculadora
//     explorer      Explorador de archivos (detrás, la carpeta que se quiere abrir)
//     control       Panel de control
//     charmap       Mapa de caracteres
//     magnify       Lupa
//     osk           Teclado en pantalla
//     mstsc         Conexión a Escritorio remoto
//     C:\Program Files (x86)\Microsoft\Edge\Application\msedge.exe     Microsoft Edge
//
// ============================================================================
// COMANDOS DEL SISTEMA
// ============================================================================
//     ipconfig                  Configuración de red del equipo
//     ping -n 4 dirección       Comprueba si se llega a una dirección (4 intentos)
//     tasklist                  Lista de procesos en ejecución
//     taskkill /F /IM nombre    Cierra un proceso por el nombre de su ejecutable
//     dir carpeta               Contenido de una carpeta (sin barra al final: dir C:)
//     systeminfo                Datos del equipo y del sistema operativo
//     hostname                  Nombre del equipo
//     whoami                    Usuario con el que se ha iniciado sesión
//     Get-Process               Lista de procesos (PowerShell)
//     Get-LocalUser | Where-Object Enabled | Select-Object -ExpandProperty Name
//                               Usuarios activos del equipo, uno por línea (PowerShell)
//
//     BufferedReader reader = new BufferedReader(new InputStreamReader(proceso.getInputStream()));
// ============================================================================
import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option = 0;
        do {
            System.out.println("===Asistente de soporte==");
            System.out.println("¿Que problema tiene?");
            System.out.println("1-Tengo problemas de red");
            System.out.println("2-Mi ordenador va muy lento");
            System.out.println("3-No se cuantos usuario hay en mi equipo");
            System.out.println("4-ME estoy quedando sin espacion en el disco");
            System.out.println("5-salir");
            try {
                option = Integer.parseInt(sc.nextLine());
                switch(option) {
                    case 1:
                    System.out.println("Tus estadistiacas de red estan cargando espera...");
                    System.out.println("==Diagnostico de Red==");
                    try {
                        String java = System.getProperty("java.home") + File.separator + "bin" + File.separator + "java";
                        String cp = System.getProperty("java.class.path");
                        ProcessBuilder pbred = new ProcessBuilder(java, "-cp", cp, "red");
                        Process procesoRed = pbred.start();
                        System.out.println("Se ha carcado todo en el archivo correctamente en red.txt");
                    } catch (Exception e) {System.out.println("Error en la opcion1");

                    }
                    break;
                    case 2:
                    System.out.println("Estamos mirando los procesoso espera...");
                    System.out.println("==Procesos en Ejecucion");
                    try {

                        String java = System.getProperty("java.home") + File.separator + "bin" + File.separator + "java";
                        String cp = System.getProperty("java.class.path");
                        ProcessBuilder pb = new ProcessBuilder(java, "-cp", cp, "Lento");
                        Process procesoProceso = pb.start();
                        System.out.println("Se an cargado todos los procesos en lento.txt");

                    } catch (Exception e) {System.out.println("Error en la opcion 2");

                    }
                    break;
                    case 3:
                    System.out.println("Estamos cargando tus usuarios espera...");
                    System.out.println("==Usuarios en tu discpositivo==");
                    try {
                        String java = System.getProperty("java.home") + File.separator + "bin" + File.separator + "java";
                        String cp = System.getProperty("java.class.path");
                        ProcessBuilder pb = new ProcessBuilder(java, "-cp", cp, "Usuarios");
                        Process procesoUsuario = pb.start();
                        System.out.println("Se ha carcado todo en el archivo correctamente en Usuario.txt");

                    } catch (Exception e) {System.out.println("Error en la opcion 3");

                    }
                    break;
                    case 4:
                    System.out.println("Estamos calculando el espacio libre en el disco espera....");
                    System.out.println("==Espcio libre en el dico==");
                    try {
                        String java = System.getProperty("java.home") + File.separator + "bin" + File.separator + "java";
                        String cp = System.getProperty("java.class.path");
                        ProcessBuilder pb = new ProcessBuilder(java, "-cp", cp, "Disco");
                        Process procesoDisc = pb.start();
                        System.out.println("Se ha cargado todo el archivo correctamente en disco.txt");
                    } catch (Exception e) {System.out.println("Error en la opcion 4");

                    }
                    break;
                    case 5:
                    System.out.println("Saliendo ");
                    break;

                    default:
                    System.out.println("ELige una opcion valida");
                    break;
                }

            } catch (Exception e) {
                System.out.println("Error al elegir una opcion valida");
            }

        } while(option !=5);
        {
        }
    }
}