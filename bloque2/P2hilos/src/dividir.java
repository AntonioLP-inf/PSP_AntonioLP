public class dividir extends Thread {
    private int num1;
    private int num2;

    public dividir(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    public void run() {
        if (num2 != 0) {
            int resultado = num1 / num2;
            System.out.println("La división de " + num1 + " y " + num2 + " es: " + resultado);
        } else {
            System.out.println("Error: División por cero no permitida.");
        }
    }
}
