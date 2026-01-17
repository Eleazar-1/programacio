import java.util.Scanner;

public class ACT12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce la hora minutos y segundos: ");
        int hora = sc.nextInt();
        int minuto = sc.nextInt();
        int segundo = sc.nextInt();

        segundo = segundo+1;
        if (segundo >= 60) {
            minuto += segundo - 59;
            segundo = 00;
        }
        if (minuto >= 60) {
            hora += minuto - 59;
            minuto = 00;
        }

        System.out.println("Son las "+hora+" horas "+minuto+" minutos "+segundo+" segundos.");
        sc.close();
    }
}
