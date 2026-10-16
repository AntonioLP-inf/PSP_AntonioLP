
public class Hilos extends Thread {
    
     int numhilo;

    public Hilos(int n) {
        this.numhilo = n;
    }

    @Override
    public void run() {
       for (int i = 0; i < 5; i++) {
            System.out.println("Hilo " + numhilo + " : " + i);
            try {
                Thread.sleep(1000);//pausa de 1 segundo
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
    

