public class Ejercicio1 {
    public static void main(String[] args) {
        try {
            
                
            
            //Los programas nativos de windows no necesitan ruta

            //Ejecutar la Calculadora de Windows
            ProcessBuilder calculadora = new ProcessBuilder("calc");
            Process p = calculadora.start();

            //Esperar un momento para asegurarnos de que la calculadora se abra completamente
            Thread.sleep(2000);

            p.destroyForcibly();

            //Ejecuta el bloc de notas
            ProcessBuilder notepad = new ProcessBuilder("notepad");
            Process a = notepad.start();
            
            
            // Espera 2000 milisegundos 
            Thread.sleep(2000);
            a.destroyForcibly();

            ProcessBuilder paint = new ProcessBuilder("mspaint");
            Process c = paint.start();
            
            Thread.sleep(2000);
            c.destroyForcibly();
        } catch (Exception e) {
        }
    }
}
