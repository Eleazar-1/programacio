import java.util.Scanner;

public class act20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numAleatorio1 = (int) (Math.random()*99+1);
        int numAleatorio2 = (int) (Math.random()*99+1);

        int elegirOperacion = (int) (Math.random()*4+1);

        //OPCION DE SUMA
        if (elegirOperacion == 1) {
            System.out.println("Cuanto es?: "+numAleatorio1+"+"+numAleatorio2);
            int respuesta = sc.nextInt();
            if (respuesta == (numAleatorio1+numAleatorio2)) {
            System.out.println("La operación es correcta.");
            } else{
            System.out.println("La operacion no es correcta.");
            }
        } 
        //OPCION RESTA
        else if (elegirOperacion == 2) {
            System.out.println("Cuanto es?: "+numAleatorio1+"-"+numAleatorio2);
            int respuesta = sc.nextInt();
            if (respuesta == (numAleatorio1-numAleatorio2)) {
            System.out.println("La operación es correcta.");
            } else{
            System.out.println("La operacion no es correcta.");
            }
        }
        //OPERACION MULTIPLICACION
        else if (elegirOperacion == 3) {
            System.out.println("Cuanto es?: "+numAleatorio1+"*"+numAleatorio2);
            int respuesta = sc.nextInt();
            if (respuesta == (numAleatorio1*numAleatorio2)) {
            System.out.println("La operación es correcta.");
            } else{
            System.out.println("La operacion no es correcta.");
            }
        }
        //OPERACION DIVISIÓN
        else if (elegirOperacion == 4) {
            System.out.println("Cuanto es?: "+numAleatorio1+"/"+numAleatorio2);
            int respuesta = sc.nextInt();
            if (respuesta == (numAleatorio1/numAleatorio2)) {
            System.out.println("La operación es correcta.");
            } else{
            System.out.println("La operacion no es correcta.");
            }
        }
        sc.close();
    }
}