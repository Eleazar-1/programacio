import java.util.Scanner;

public class act7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el aÃ±o: ");
        int anyo = sc.nextInt();

        boolean bisiesto = bisiestoOno(anyo);

        System.out.println(anyo+" es bisiesto?: "+bisiesto);
        sc.close();
    }

    static boolean bisiestoOno(int anyo){
        if (anyo %4!=0) {
            return false;
        }else if (anyo %100!=0) {
            return true;
        }else if (anyo %400==0) {
            return true;
        }else{
            return true;
        }
        
    }

}