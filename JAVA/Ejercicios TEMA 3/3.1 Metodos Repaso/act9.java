import java.util.Scanner;

public class act9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce la 1a hora: ");
        String hora1 = sc.nextLine();

        System.out.println("Introduce la 2a hora: ");
        String hora2 = sc.nextLine();

        System.out.println("La hora es "+valido(hora1));
        System.out.println("La hora es "+valido(hora2));
        
        System.out.println("La diferencia es de "+diferencia(hora1, hora2));
        sc.close();
    }

    static boolean valido(String h){
        if (h.length()!=5) {
            return false;
        }
        String primerosDos = h.substring(0,2);
        int hora = Integer.parseInt(primerosDos);
        String ultimosDos = h.substring(3, 5);
        int minuto = Integer.parseInt(ultimosDos);
        char puntos= h.charAt(2);
        if (hora < 24 && minuto < 60 && puntos == ':' ) {
            return true;
        }else{
            return false;
        }
        
    }

    static int diferencia(String hora1, String hora2){
        String primerosDos1 = hora1.substring(0,2);
        int h1 = Integer.parseInt(primerosDos1);
        String ultimosDos1 = hora1.substring(3, 5);
        int h2 = Integer.parseInt(ultimosDos1);

        String primerosDos2 = hora2.substring(0,2);
        int h3 = Integer.parseInt(primerosDos2);
        String ultimosDos2 = hora2.substring(3, 5);
        int h4 = Integer.parseInt(ultimosDos2);

        int minutos1 = (h1*60)+h2;
        int minutos2 = (h3*60)+h4;

        int minutostotal1 =minutos1-minutos2;
        int minutostotal2 =minutos2-minutos1;

        if (minutos1 > minutos2) {
            return minutostotal1;
        }else if (minutos1 < minutos2) {
            return minutostotal2;
        }else{
            return 0;
        }
    }
}
