import java.util.Scanner;

public class Bucles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //WHILE

        int contador = 1;
        while (contador<=5) {
            System.out.println("Numero "+contador);

            contador++;
        }

        System.out.println("Cuenta hacia atras");
        int cuentaAtras = 10;

        while (cuentaAtras >= 0) {
            System.out.println(cuentaAtras);
            cuentaAtras--;
        }
        // DO WHILE

        int num = 0;
        int total = 0;

        do{
            System.out.println(" ");
            System.out.println("Introduce un numero distinto de 0 para continuar en el bucle");
            num = sc.nextInt();
            total += num;
        } while (num !=0);

        System.out.println(" La suma es "+total);

        for (int i = 0; i < 10; i++) {
            System.out.println(i+ " ");
        }
        System.out.println(" ");
        for (int i = 0, j = 3; i < 10; i+=j) {
            System.out.println("El valor de i es: "+i);
        }

        //Sacar la media con un for

        int numero1 = 0;
        double media = 0;
        System.out.println("Dime cuantos numeros quieres introducir: ");
        int cantidadNumeros = sc.nextInt();

        for (int i = 0; i < cantidadNumeros; i++) {
            System.out.println("Dime un numero "+(i + 1)+ " de "+cantidadNumeros);

            numero1 = sc.nextInt();
            media += numero1;
        }

        System.out.println("La media es "+ (media / cantidadNumeros));

        //BREAK CONTINUE

        //Ejemplo 1

        System.out.println("Empezamos con break");

        for (int i = 0; i < 10; i++) {
            System.out.println("Terminada vuelta"+i);

            if (i == 8) {
                break;
            }
            System.out.println("Terminada vuelta "+i);

        }
        System.out.println("Terminado");
        System.out.println("Empezamos con break");

        for (int i = 0; i < 10; i++) {
            System.out.println("Terminada vuelta"+i);

            if (i == 8) {
                continue;
            }
            System.out.println("Terminada vuelta "+i);

        }
    }
}
