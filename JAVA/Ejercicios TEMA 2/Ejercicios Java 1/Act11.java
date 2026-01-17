import java.util.Scanner;

public class Act11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escibe la nota del primer trimestre: ");
        int nota1 = sc.nextInt();

        System.out.println("Escibe la nota del segundo trimestre: ");
        int nota2 = sc.nextInt();

        System.out.println("Escibe la nota del terc trimestre: ");
        int nota3 = sc.nextInt();

        double media = (nota1 + nota2 + nota3) /3;

        System.out.println("Tu nota media es: " + media);

        if (media < 5) {
            System.out.println("Insuficiente");
        } else if (media >= 5 & media < 7) {
            System.out.println("Aprobado");
        } else if (media >=7 & media < 9) {
            System.out.println("Notable");
        } else if (media >= 9) {
            System.out.println("Sobresaliente");
        }
        sc.close();
    }
}
