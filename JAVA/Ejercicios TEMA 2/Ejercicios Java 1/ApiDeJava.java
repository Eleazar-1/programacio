import java.time.LocalTime;
import java.util.Scanner;

public class ApiDeJava {
    public static void main(String[] args) {
        /*
            Qué es una API de JAVA?
            Application Programming Interface
            Biblioteca de clases y métodos.
            Api Java proporciona su propia Api con miles de clases
            listas para usar
            -Ahorra tiempo y asegura fiabilidad

            Las clases se agrupan EN PAQUETES segun la
            funcionalidad
            java.lang
            java.time
            java.util
            La clase java.lang.Object. ES LA CLASE MADRE
         */
        java.time.LocalTime hora1 = java.time.LocalTime.now();
        System.out.println("Hora (con nombre cualificado: )" + hora1);

        LocalTime hora2 = LocalTime.now();
        Scanner sc = new Scanner(System.in);

        java.time.LocalDate hoy = java.time.LocalDate.now();
        System.out.println("Fecha actual: " + hoy);

        //Clase Math :métodos estáticos más comunes

        int numero = 10;
        double raizCuadrada = Math.sqrt(numero);
        System.out.println("La raiz cuadrada de " + numero + " = ");
        
        int x = 4, y = 4;

        double potencia = Math.pow(x, y);
        System.out.println(x + "^" +y + " = "+ potencia);
        System.out.println("Casting a int: " + (int)potencia);

        //Area circulo
        int radio = 10;
        double area = Math.PI * radio * radio;
        System.out.println("Area del circulo (r=10)" + area);

        //Redondeos
        System.out.println("Math.round(area)" + Math.round(area));
        System.out.println("Math.ceil(area)" + Math.round(area)); //hacia arriba 315 .0
        System.out.println("Math.floor(area)" + Math.round(area)); //hacia abajo 314.0

        //Mostrar area con 2 decimales

        double areaDosDecimales = Math.round(area*100)/100;
        System.out.println("Area con dos decimales" + areaDosDecimales);

            //Math.random()
            /*
         Retorna siempre un numero decimal (double)
         comprendido entre 0.0 (incluido) y 1.0 (excluido)
         0.0 <= x < 1.0
         */

         double aleatorio = Math.random();
         System.out.println("Aleatorio [0.0 , 1.0]: " + aleatorio);

         // Si queremos numeros enteros
         /*
          Multiplicar ese decimal por un rango y hacemos casting a int 
         */

        int aleatorio2 = (int)(Math.random()*10) + 1;
        System.out.println("Entero [1,10]" + aleatorio2);
         
        int aleatorio3 = (int)(Math.random()*10) + 1;
        System.out.println("Entero [1,10]" + aleatorio3);

        // Calcular el area de un circulo con un radio aleatorio entre 1 y 10

        int radioRandom = (int)(Math.random()*10)+1;
        double areaRandom = Math.PI * radioRandom * radioRandom;
        System.out.println("r aleatorio= " + radioRandom + " -> area = " + areaRandom);

        //Generar un número aleatorio decimal entre 2.0 y 5.0

        double aleatorio4 = 2 + Math.random() * 3;
        System.out.println("Aleatorio [2.0,5.0] : " + aleatorio4);

        int n = 2;
        double resultadoMixto = Math.sqrt(Math.pow(n, b:4));
        System.out.println("Raiz cuadrada de nº elevado a 4" + resultadoMixto);

    }
}
