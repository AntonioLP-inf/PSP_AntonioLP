public class restar extends Thread {
    //Atributos
    private int num1;
    private int num2;
    //Constructoes 
    public restar(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    //metodos
    
    public void run() {
        int resultado = num1 - num2;
        System.out.println("La resta de " + num1 + " y " + num2 + " es: " + resultado);
    }
}
