import java.util.Scanner;

public class Act23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la nota del primer examen: ");
        double nota1 = sc.nextDouble();

        System.out.println("Que media quieres sacar?: ");
        double media = sc.nextDouble();

        double notaNecesaria = (media - nota1 * 0.4)/0.6;

        System.out.println("Se necesitaria sacar: " +notaNecesaria);

        sc.close();
    }
}
