public class cronometro extends Thread{
    private int segundos;
    public cronometro(int segundos) {
        this.segundos = segundos;
    }
    public void run() {
        try {
            for (int i = 0; i < segundos; i++) {
                System.out.println("Tiempo transcurrido: " + (i + 1) + " segundos");
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("El cronómetro ha sido interrumpido.");
        }
    }
    
    
}
