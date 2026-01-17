import java.lang.classfile.Opcode;
import java.util.Scanner;

public class prova {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    String opcion1 = "";
    String g95 = "g95";
    String g98 = "g98";
    String diesel = "diesel";
    
    while (!opcion1.equals("fin")) {
        System.out.println("G95 (1,79€)/L");
        System.out.println("G98 (1,95€/L)");
        System.out.println("DIESEL (1,69€/L)");
        System.out.println("FIN (Salir)");
        System.out.println("Que tipo de combustible quieres?:");
        opcion1 = sc.nextLine();
        //convertir a minuscula
        String convertirMinus = opcion1.toLowerCase();
        
        if (convertirMinus.equals(g95) || convertirMinus.equals(g98) || convertirMinus.equals(diesel)) {
            System.out.println("Introduce tu nombre: ");
            String nombre = sc.nextLine();
        }else if (convertirMinus.equals("fin")) {
            System.out.println("Has elegido salir del programa");
            break;
        }else{
            System.out.println("Opcion no valida, vuelve a abrir el programa.");
            break;
        }

        System.out.println("Introduce tu nombre: ");
        String nombre1 = sc.nextLine();
        String nombre = nombre1.toLowerCase();

        if (nombre.equals(null)) {
            System.out.println("NOMBRE VACÍO, venta descartada, vuelve a abrir el programa.");
            break;
        }

        //PART MATRICULA (no fet)
        System.out.println("Introduce la matricula de tu vehiculo formato 'NNNNLLL'.");
        String matricula = sc.nextLine();

        for (int i = 0; i < args.length; i++) {
            
        }
        //--------------------------------------------------

        //DATOS VENTA
        System.out.println("Cuantos litros quieres llenar?: ");
        double litros = sc.nextDouble();
        if (litros <= 0) {
            System.out.println("Los litros deben de ser > 0");
            break;
        }
        System.out.println("Tienes tarjeta de fidelización?: (SI) o (NO)");
        String tarjeta = sc.nextLine();
        String tarjetaPasadoAMinuscula = tarjeta.toLowerCase();

        if (!tarjetaPasadoAMinuscula.equals("si")|| !tarjetaPasadoAMinuscula.equals("no")) {
            System.out.println("Respuesta no válida, vuelve a iniciar el programa");
            break;
        }else{
            System.out.println("Si que tienes targeta de fidelización");
        }

        //CALCULO DEL IMPORTE
        double calculoImporte = 0;

        
        if (convertirMinus.equals(g95)) {
            calculoImporte = litros * 1.79;
        }else if (convertirMinus.equals(g98)) {
            calculoImporte = litros * 1.95;
        } else if (convertirMinus.equals(diesel)) {
            calculoImporte = litros * 1.69;
        }
        double descuentoLitros = 0;

        if (litros > 20 && litros < 39.99) {
            descuentoLitros = (litros * 3)/100;
            calculoImporte = calculoImporte - descuentoLitros;
        }
        if (litros > 40 ) {
            descuentoLitros = (litros * 5)/100;
            calculoImporte = calculoImporte - descuentoLitros;
        }
        double calculoTarjeta = 0;

        if (tarjetaPasadoAMinuscula.equals("si")) {
            calculoTarjeta = (calculoImporte * 20)/100;   
            calculoImporte = calculoImporte - calculoTarjeta;
        }

        double calculoImpuesto = (calculoImporte * 21)/100;
        //Este es el precio despues del IVA
        double precioFinal = calculoImporte + calculoImpuesto;
        
        //COBRO Y TICKET
        System.out.println("Importe a pagar "+precioFinal);
        System.out.println("Cuanto dinero vas a introducir? :");
        double importeEntregado = sc.nextDouble();

        while (importeEntregado < precioFinal) {
            System.out.println("Has introducido poco dinero, vuelve a introducir: ");
            System.out.println("Importe a pagar "+precioFinal);
            System.out.println("Cuanto dinero vas a introducir? :");
            importeEntregado = sc.nextDouble();
        }
        double vueltas = 0;
        if (importeEntregado > precioFinal) {
            vueltas = importeEntregado - precioFinal;
        }
        //TICKET FINAL
        System.out.println("==========TICKET=======================");
        System.out.println("Cliente: "+nombre+" matricula"+matricula);
        System.out.println("Combustible: "+convertirMinus);
        System.out.println("Litros: "+litros);
        System.out.println("Tarjeta: "+tarjetaPasadoAMinuscula);
        System.out.println("Total con IVA: "+precioFinal);
        System.out.println("Entregado "+importeEntregado);
        System.out.println("Cambio"+vueltas);
        System.out.println("=================================");
        
        //FINALIZAR EL PROGRAMA
        opcion1 = "fin";
    }
    

    sc.close();
    }
}