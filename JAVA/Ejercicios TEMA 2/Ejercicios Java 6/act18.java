import java.util.Scanner;

public class act18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce la hora: h m s: ");
        int hora = sc.nextInt();
        int minuto = sc.nextInt();
        int segundo = sc.nextInt();

        System.out.println("Cuantos segundos quieres incrementar?:");
        int segundos = sc.nextInt();

        segundo+=segundos;

        while (segundo >= 60) {
            segundo = segundo % 60;
            minuto++;
        }

        while (minuto >= 60) {
            minuto = minuto % 60;
            hora++;
        }
        
        System.out.println("Horas: "+hora+", minutos: "+minuto+", segundos: "+segundo+".");
        
        sc.close();
    }
}
