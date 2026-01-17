import java.util.Scanner;

public class ACT18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce las hormigas: ");
        int hormigas = sc.nextInt();
        System.out.println("Introduce las arañas: ");
        int arañas = sc.nextInt();
        System.out.println("Introduce las cochinillas: ");
        int cochinillas = sc.nextInt();

        int patasHormigas = hormigas * 6;
        int patasArañas = arañas * 8; 
        int patasCochinillas = cochinillas * 14;

        int totalPatas = patasArañas + patasCochinillas+ patasHormigas;

        System.out.println("Total de patas: "+totalPatas);

        sc.close();
    }
}
