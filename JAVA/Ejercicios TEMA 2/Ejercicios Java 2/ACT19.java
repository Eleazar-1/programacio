import java.util.Scanner;

public class ACT19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("MENÚ DE ENTRADAS");
        System.out.println("1-Elegir entrada infantil");
        System.out.println("2-Elegir entrada adulta");
        int opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("MENÚ DE ENTRADAS");
                System.out.println("Cuantas quieres?: ");
                double entradasInfantiles = sc.nextDouble();

                if (entradasInfantiles > 0 && entradasInfantiles < 7) {
                double calculoInfantil = entradasInfantiles * 15.5;
                System.out.println("Coste total de entradas: "+calculoInfantil);
                } else if (entradasInfantiles >= 7) {
                    double calculoInfantil = entradasInfantiles * 15.5;
                    double calculoDescuento = calculoInfantil * 0.05;
                    double calculoInfantilFinal = calculoInfantil - calculoDescuento;
                    System.out.println("El precio total con descuento es: "+calculoInfantilFinal +" €.");
                }
                break;
            case 2:
                System.out.println("MENÚ DE ENTRADAS");
                System.out.println("Cuantas quieres?: ");
                double entradasAdultas = sc.nextInt();
                
                if (entradasAdultas > 0 && entradasAdultas < 5) {
                double calculoAdulto = entradasAdultas * 20;
                System.out.println("Coste total de entradas: "+calculoAdulto+" €.");
                } else if (entradasAdultas >= 5) {
                    double calculoAdulto = entradasAdultas * 20;
                    double calculoDescuento = calculoAdulto * 0.05;
                    double calculoAdultoFinal = calculoAdulto - calculoDescuento;
                    System.out.println("El precio total con descuento es: "+calculoAdultoFinal+ " €.");
                }
                break;
            default:
                System.out.println("Opción no valida.");
                break;
        }
        
        sc.close();
    }
}
