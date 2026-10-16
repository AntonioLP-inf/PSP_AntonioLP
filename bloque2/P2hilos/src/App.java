import java.util.Scanner;
public class App {
    
    public static void main(String[] args) throws Exception {
        /*Ejercicio2- operaciones simultaneas
        
        Crear 4 clases, una se encarga de recibir dos numeros por parametro y 
        sumarlos, otra de rescibir dos numeros y restarlos, otra de multiplicarlos y otra de dividirlos*/

        /*En tu "main", pidele al usuario dos numeros y 
        crea 4 hilos correspondientes a cada una de las clases anteriores, pasandole los numeros del usuario   , 
        de forma que las 4 cuentas puedan realizarse <<simultaneamente>>*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el primer numero: ");
        int num1 ;
        num1 = Integer.parseInt(sc.nextLine());
        System.out.println("Introduce el segundo numero: ");
        int num2 ;
        num2 = Integer.parseInt(sc.nextLine());


        restar hilo1 = new restar(num1,num2);
        sumar hilo2 = new sumar(num1,num2);
        multiplicar hilo3 = new multiplicar(num1,num2);
        dividir hilo4 = new dividir(num1,num2);


        hilo1.start();
        hilo2.start();
        hilo3.start();
        hilo4.start();

    }
}


