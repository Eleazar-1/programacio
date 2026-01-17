import java.util.Scanner;

public class printf {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        //1 Preguntar el numero de habitatges

        System.out.println("Quants avitatges vols que hi haguen?: ");
        int numeroHabitatges = sc.nextInt();
        sc.nextLine();
        
        //2 Preguntar el nom del habitatge
            //Array amb el numero de habitatges
            String habitatges [] = new String[numeroHabitatges];

        //Demanar el consum d'aigua en litres de cada mes del trimestre
        int habitatgeMesos [][] = new int[numeroHabitatges][3];

        for (int i = 0; i < habitatgeMesos.length; i++) {
            System.out.println("Com es diu el habitatge?: ");
            habitatges[i]=sc.nextLine();


            for (int j = 0; j < habitatgeMesos[i].length; j++) {
                System.out.println("Quants L s'han consumit en el mes "+(j+1)+"?");
                habitatgeMesos[i][j]=sc.nextInt();
            }
            sc.nextLine();
            System.out.println();
        }
        
        //MOSTRAR DATOS

        System.out.printf("%-10s","NOM");
        for (int i = 1; i <=3; i++) {
            System.out.printf("%-10s","MES"+i);
        }
        System.out.printf("%-10s","SUMA-TOTAL");
        System.out.println();

        for (int i = 0; i < habitatgeMesos.length; i++) {
            int sumaTrimestral = 0;
            System.out.printf("%-10s",habitatges[i]);
            
            for (int j = 0; j < habitatgeMesos[i].length; j++) {
                System.out.printf("%-10d",habitatgeMesos[i][j]);
                sumaTrimestral+=habitatgeMesos[i][j];
            }
            System.out.printf("%d",sumaTrimestral);
            System.out.println();
        }
    }
    /* 
    static int sumaTrimestral (int s){
        return
    }
    */
}
