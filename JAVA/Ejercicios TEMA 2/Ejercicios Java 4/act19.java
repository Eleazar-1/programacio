import java.util.Scanner;

public class act19 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numAleatorio1 = (int) (Math.random()*99+1);
        int numAleatorio2 = (int) (Math.random()*99+1);
        System.out.println("Cuanto es?: "+numAleatorio1+"+"+numAleatorio2);
        int respuesta = sc.nextInt();

        if (respuesta == (numAleatorio1+numAleatorio2)) {
            System.out.println("La operación es correcta.");
        } else{
            System.out.println("La suma no es correcta.");
        }
       
        sc.close();
    }
}