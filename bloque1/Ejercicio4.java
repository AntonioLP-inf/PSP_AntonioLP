
import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Que programa desea iniciar (Ingrese el numero de opción)");

        System.out.println("1. Blog de notas \n2. Calculadora \n3. Paint\n 4. Ninguno");

        int opcion;
        String seguir;
        try {

            do {
                opcion = Integer.parseInt(sc.nextLine());

                if (opcion == 1) {
                    ProcessBuilder blog = new ProcessBuilder("notepad");
                    Process a = blog.start();
                    do {

                        System.out.println("Cuando dese cerrar el programa escriba si:");
                        seguir = sc.nextLine();

                            if (seguir.equalsIgnoreCase("si")) {
                                a.destroyForcibly();
                            }else{
                                System.out.println("Ingrese nuevamente la accion deseada");
                            }
                    } while (!seguir.equalsIgnoreCase("si"));


                } 
                
                
                
                else if (opcion == 2) {
                    ProcessBuilder calc = new ProcessBuilder("calc");
                    Process b = calc.start();
                    do {

                        System.out.println("Cuando dese cerrar el programa escriba si:");
                        seguir = sc.nextLine();

                            if (seguir.equalsIgnoreCase("si")) {
                                b.destroyForcibly();
                            }else{
                                System.out.println("Ingrese nuevamente la accion deseada");
                            }
                    } while (!seguir.equalsIgnoreCase("si"));


                } 
                
                
                
                else if (opcion == 3) {
                    ProcessBuilder paint = new ProcessBuilder("mspaint");
                    Process c = paint.start();
                    do {

                        System.out.println("Cuando dese cerrar el programa escriba si:");
                        seguir = sc.nextLine();

                            if (seguir.equalsIgnoreCase("si")) {
                                c.destroyForcibly();
                            }else{
                                System.out.println("Ingrese nuevamente la accion deseada");
                            }
                    } while (!seguir.equalsIgnoreCase("si"));



                } 
                
                
                
                else if (opcion == 4) {
                    System.out.println("Programa cerrandose");
                } else {
                    System.out.println("Ingrese una opcion valida \n");
                }
            } while (opcion != 4);
        } catch (Exception e) {
        }
    }
}
