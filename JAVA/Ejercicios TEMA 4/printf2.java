import java.util.Scanner;

public class printf2 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Quantes cuitats vols que medi la temperatura?: ");
        int numeroDeCuitats = sc.nextInt();

        sc.nextLine(); // neteja buffer

        String nomDeCuitats [] = new String[numeroDeCuitats];

        double cuitatPerTemperatura [][] = new double[numeroDeCuitats][7];

        for (int i = 0; i < cuitatPerTemperatura.length; i++) {
            System.out.println("Digues el nom de la cuitat: ");
            nomDeCuitats[i]= sc.nextLine();

            for (int j = 0; j < cuitatPerTemperatura[i].length; j++) {
                System.out.printf("Quina temperatura farà en %s dia %d?",nomDeCuitats[i],(j+1));
                cuitatPerTemperatura[i][j]=sc.nextDouble();
            }
            sc.nextLine();
        }
        System.out.printf("%-10s","CUITAT");
        for (int i = 1; i <= 7; i++) {
            System.out.printf("%-10s","DIA"+i);
        }
        System.out.printf("%-10s","MITJANA");
        System.out.println();

        for (int i = 0; i < cuitatPerTemperatura.length; i++) {
            double media=0;
            
            System.out.printf("%-10s",nomDeCuitats[i]);

            for (int j = 0; j < cuitatPerTemperatura[i].length; j++) {
                //System.out.println("Cuitat :"+nomDeCuitats[i]+" dia "+(j+1)+" farán "+cuitatPerTemperatura[i][j]);
                System.out.printf("%-10.2f",cuitatPerTemperatura[i][j]);
                media+=cuitatPerTemperatura[i][j];
            }
            System.out.printf("%-10.2f",(media/7));
            //System.out.println("La media semanal es "+(media/7));
            System.out.println();
        }
        int filaAEliminar = 2; // la fila que NO volem mostrar

            for (int i = 0; i < matriu.length; i++) {

                if (i != filaAEliminar) {
                    for (int j = 0; j < matriu[i].length; j++) {
                    System.out.print(matriu[i][j] + " ");
                }
            }

            
    System.out.println();
}

        
    }

    static double [][] mostrar(double b[][]){
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }

        return b;
    }

    

}
