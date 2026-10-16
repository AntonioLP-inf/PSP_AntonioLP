public class sumar extends Thread {
    private int num1;
    private int num2;

    public sumar(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    public void run() {
        int resultado = num1 + num2;
        System.out.println("La suma de " + num1 + " y " + num2 + " es: " + resultado);
    }
}
