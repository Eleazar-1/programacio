import java.util.Scanner;

public class Act19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Cuantas horas has trabajado: ");
        int salario = sc.nextInt();

        System.out.println("El salario semanal es de: "+(salario *12) + " €.");

        sc.close();
    }
}
