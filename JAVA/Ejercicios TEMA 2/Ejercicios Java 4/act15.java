import java.util.Scanner;

public class act15 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantos kg de comida diaria se compran al dia: ");
        int comidaDiaria = sc.nextInt();

        System.out.println("Cuantos animales hay: ");
        int numAnimales = sc.nextInt();

        System.out.println("Cual es la media de kg que come cada animal: ");
        int kilosPorAnimal = sc.nextInt();

        int totalNecesario = numAnimales * kilosPorAnimal;

        if (comidaDiaria >= totalNecesario) {
            System.out.println("Hay suficiente comida.");
        }else{
            System.out.println("No hay suficiente comida");
            System.out.println("Cada animal deberá comer: "+(comidaDiaria / numAnimales)+" kg.");
        }
        sc.close();
    }
}