import java.util.Scanner;

public class act8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce la hora: ");
        String hora = sc.nextLine();

        System.out.println("La hora es "+valido(hora));
        
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
}
