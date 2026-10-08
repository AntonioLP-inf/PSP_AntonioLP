import java.util.Scanner;

public class ejerciciorepaso11 {
    public static void main(String[] args) {
        /*
         * Crea un programa que muestre este menú y lo repita hasta que se elija salir:
         * === PANEL DE ESTUDIO ===
         * 1. Abrir el campus virtual
         * 2. Tomar apuntes
         * 3. Ver mis descargas
         * 4. Terminar de tomar apuntes
         * 5. Salir
         * Cada opción lanza un proceso distinto:
         * - 1. Abre la web de Davante (`https://davante.es`) en Microsoft Edge, que
         * viene con
         * todos los Windows.
         * - 2. Abre el Bloc de notas con el fichero `apuntes.txt`. Igual que a Edge se
         * le pasa la web, al Bloc de notas se le pasa el nombre del fichero: `notepad
         * apuntes.txt`.
         * - 3. Abre el Explorador de archivos en tu carpeta de Descargas: `explorer`
         * seguido de la ruta de la carpeta.
         * - 4. Cierra el Bloc de notas pidiéndoselo al CMD con `taskkill`.
         * - Si se escribe una opción que no existe, avisa y vuelve a mostrar el menú.
         */
        try {
            Scanner sc = new Scanner(System.in);
            int opcion;
            do {
                System.out.println("=== PANEL DE ESTUDIO ===");
                System.out.println("1. Abrir el campus virtual");
                System.out.println("2. Tomar apuntes");
                System.out.println("3. Ver mis descargas");
                System.out.println("4. Terminar de tomar apuntes");
                System.out.println("5. Salir");
                System.out.print("Elige una opción: ");
                opcion = sc.nextInt();
                switch (opcion) {
                    case 1:
                        // Abrir el campus virtual
                        ProcessBuilder pb1 = new ProcessBuilder("cmd.exe", "/c", "start", "microsoft-edge:https://davante.es");
                        pb1.start();
                        break;
                    case 2:
                        // Tomar apuntes
                        ProcessBuilder pb2 = new ProcessBuilder("notepad", "apuntes.txt");
                        pb2.start();
                        break;
                    case 3:
                        // Ver mis descargas
                        String userHome = System.getProperty("user.home");
                        String downloadsPath = userHome + "\\Downloads";
                        ProcessBuilder pb3 = new ProcessBuilder("explorer", downloadsPath);
                        pb3.start();
                        break;
                    case 4:
                        // Terminar de tomar apuntes
                        ProcessBuilder pb4 = new ProcessBuilder("cmd.exe", "/c", "taskkill", "/IM", "notepad.exe");
                        pb4.start();
                        break;
                    case 5:
                        // Salir
                        System.out.println("Saliendo del programa...");
                        break;
                    default:
                        System.out.println("Opción no válida, vuelve a intentarlo.");
                }
            } while (opcion != 5);
            sc.close();
            
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
