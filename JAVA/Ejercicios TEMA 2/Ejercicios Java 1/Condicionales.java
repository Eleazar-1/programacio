import java.util.Scanner;

public class Condicionales {
    public static void main(String[] args) {
      /*
        Un condicional no es más que una expresion relacional o lógica

        Se utilizan operadores logicos && || !
        Operades racionales == != < > <= =>
      */  

      //CONDICION SIMPLE
      // if(condicion){
            //instruccion
      //}

      int n =10, m=5;
      boolean c1 = n< 5 && m > 10;
      boolean c2 = n< 5 && m > 10;
      boolean c3 = n > 5;
      boolean c4 = !c3;
      boolean c2 = ( n > 5 || m<=3) && m == 10;

      System.out.println(c1);
      System.out.println(c2);
      System.out.println(c3);
      System.out.println(c4);
      System.out.println(c5);

      Scanner sc = new Scanner(System.in);

      System.out.println("Introduce tu edad: ");
      int edad = sc.nextInt()

      if (edad >= 18){
        System.out.println("Eres mayor de edad");
      }

      //CONDICIONAL DOBLE
      /*
        if(condicion){
            bloque true
        } else {
            bloque false
        }
        }
       */

       System.out.println("Introduce un numero para comparar con 5");
       int otroNumero = sc.nextInt();

       if (otroNumero == 5){
        System.out.println("Has introducido el numero 5");
       }

       //OPERADOR TERNARIO
       //Variable = condicion ? valor1 : valor2

       System.out.println("Introduce un numero: ");
       int n1 = sc.nextInt();

       String resultado = (n1 % 2 ==0)

       System.out.println("Calcular la media de 5 notas");
       double media =0;

       for (int i = 0; i<5; i++) {
        System.out.println("Introduce la nota " + (i+1) + ": ");
        double notaModulo = sc.nextDouble();
        media = media + notaModulo;
       }

       media = media / 5.0;

       System.out.println("Tu media es : %.2f%n", media);

       System.out.println("Muestra media " + media);

       if (media >= 6.5){
        System.out.println("Felicitaciones, excelente promedio");
       } else if (media >= 6){
        System.out.println("Excelente promedio");
       } else if (media >= 5){
        System.out.println("Regular, necesitas esforzarte un poco");
       } else if ()
    }
}
