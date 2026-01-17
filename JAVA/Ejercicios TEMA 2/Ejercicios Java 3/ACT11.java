import java.util.Scanner;

public class ACT11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce la fecha separada por dia mes año: ");
        int numero1 = sc.nextInt();
        int numero2 = sc.nextInt();
        int numero3 = sc.nextInt();

        boolean fechaValida = true;

        if (fechaValida) {  
 
            if (numero2 ==2) {
                if (numero1 > 29) {
                    System.out.println("Febrero no tiene mas de 29 dias.");
                    fechaValida = false;
                }
            }
            else if (numero2 %2== 0) {
                if (numero1 > 30) {
                    System.out.println("La fecha introducida no es valida");
                    fechaValida = false;
                }
            }
        }

        if (fechaValida) {
            System.out.println("Dia "+numero1+" del mes "+numero2+" del año "+numero3+" fecha válida.");
        }
        sc.close();
    }
}
