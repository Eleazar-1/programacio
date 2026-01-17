import java.util.Scanner;

public class ACT16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce los segundos: ");
        int segundos = sc.nextInt();

        int CalcularHoras = segundos / 3600;
        int ResiduHoras = segundos % 3600;

        int CalcularMinutos = ResiduHoras / 60;
        int ResiduMinutos = ResiduHoras % 60;
             
        System.out.println(CalcularHoras+" horas "+CalcularMinutos+" minutos "+ResiduMinutos+" segundos.");

        sc.close();
    }
}
