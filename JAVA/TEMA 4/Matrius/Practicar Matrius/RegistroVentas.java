//package MATRIUSIRREGULARS;

import java.util.Arrays;
import java.util.Scanner;

public class RegistroVentas {
    static final int NUM_MESES= 3;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("---GESTIÓN DE VENTAS TRIMESTRALES---");
        System.out.print("Introduce el número de productos: ");

        int numeroProductos = sc.nextInt();
        sc.nextLine();

        
        //Estructura datos
        double [][] ventasPorProductos = new double [numeroProductos] [NUM_MESES];
        String [] nombresProductos = new String [numeroProductos];


        //Fase registro

        for (int i = 0; i < numeroProductos; i++) {
            nombresProductos[i] = obtenerNombreProducto();

            //Anidado para los meses

            for (int mes = 0; mes < NUM_MESES; mes++) {
                System.out.printf(" > Ventas de %s para el mes %d: € ", nombresProductos[i], (mes+1));
                ventasPorProductos [i] [mes] = sc.nextDouble(); //ALmaceno ventas
            }
            sc.nextLine();
        }

        //FASE RESULTADOS

        System.out.println("\n---INFORME FINAL DE VENTAS---");

        System.out.printf("%-15s", "PRODUCTO");

        for (int j = 0; j < NUM_MESES; j++) {
            System.out.printf("%-10s", "MES" + (j+1));
        }
        System.out.printf("%-10s%n", "TOTAL");
        System.out.println("-----------------------------------------------------");

        //System.out.println(Arrays.deepToString(ventasPorProductos));
        //System.out.println(Arrays.toString(nombresProductos));

        //Imprimir los datos

        for (int i = 0; i < nombresProductos.length; i++) {
            //A Nombre del producto (Fijo a la izquierda)
            System.out.printf("%-15s", nombresProductos[i]);

            //Bucle interno para las ventas

            for (int j = 0; j < ventasPorProductos[i].length; j++) {
                System.out.printf("%-10.2f", ventasPorProductos[i] [j]);
            }

            //Claculo total
            //double total = calcularTotalVentas(ventasPorProductos,i);
            double total = calcularTotalVentasV2(ventasPorProductos[i]);
            System.out.printf("%-10.2f%n", total);

        }
        
    }//FIN MAIN

    static double calcularTotalVentasV2(double [] ventasProducto) {
        double total = 0;
        for (double ventas : ventasProducto) {
            total += ventas;
        }
        return total;
    }
        

     static double calcularTotalVentas( double [][]ventas, int indiceProducto) {
        double total = 0;
        for (int col = 0; col < ventas[indiceProducto].length; col++) {
            total += ventas [indiceProducto] [col];
        }
        return total;
     }

    static String obtenerNombreProducto() {
        System.out.println("Introduce el nombre del producto: ");
        return sc.nextLine();
    }
}
