public class App {
    public static void main(String[] args) throws Exception {
        //-------//
        //start()-> lanzar el hilo (llama al metodo especial run() de la clase Thread)
        //join()-> espera hasta qeu el hilo termine (suele ir en el main)
        //sleep()-> pausa de unos cuantos milisegundos (suele ir en el hilo)

        Hilos h1 = new Hilos(1);
        Hilos h2 = new Hilos(2);
        Hilos h3 = new Hilos(3);
        Hilos h4 = new Hilos(4);
        Hilos h5 = new Hilos(5);

        h1.start();
        try {
            h1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        h2.start();
        try {
            h2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        h3.start();
        try {
            h3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        h4.start();
        try {
            h4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        h5.start();
        try {
            h5.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
    }
}
