import java.util.Scanner;

public class MenuSwitch {
    public static void main(String[] args) {
        int x = 1;

        switch (x) {
            case 1:
                System.out.println("He ejecutado el 1.");
                break;
            case 2:
                System.out.println("He ejecutado el 2.");
                break;

            case 3:
                System.out.println("He ejecutado el 3.");
                break;

            case 4:
                System.out.println("He ejecutado el 4.");
                break;
            default:
                System.out.println("El valor de x no está entre 1 y 4.");
                break;
        }

        //EJEMPLO · Calculo de areas con menus

        System.out.println("CÁLCULO DE AREAS");
        System.out.println("----------------");
        System.out.println("1 .Cuadrado");
        System.out.println("2. Rectángulo");
        System.out.println("3. Triángulo");
        System.out.println("\n Elija la opción 1-3");

        Scanner entrada = new Scanner(System.in);

        double lado, base, altura;

            int opción = entrada.nextInt();

            switch (opción) {
            case 1:
                System.out.println("Introduzca el lado del cuadrado en cm: ");
                lado = entrada.nextDouble();
                System.out.println("El area del cuadrado es "+ (lado * lado)+"cm2");
                break;
            
            case 2:
                System.out.println("Introduzca la altura del rectangulo en cm: ");
                altura = entrada.nextDouble();
                System.out.println("Introduzca la base del rectangulo en cm: ");
                base = entrada.nextDouble();
                System.out.println("El area del rectangul es "+(base * altura)+" cm2");
                break;

            case 3: // Calcular triangulo
                System.out.println("Introduzca la altura del rectangulo en cm: ");
                altura = entrada.nextDouble();
                System.out.println("Introduzca la base del rectangulo en cm: ");
                base = entrada.nextDouble();
                System.out.println("El area del rectangulo es "+ (base * altura)/2);
            default:
                System.out.println("No es una opcion");
                break;
             }
            int notaExamen = 0;
            switch (notaExamen) {
                case 0,1,2,3,4:
                    System.out.println("Lo siento!");
                    System.out.println("Necesitas mejorar");
         
                case 5 -> System.out.println("Suficiente");
                case 6 -> System.out.println("Bien");
                case 7,8 -> System.out.println("Notable");
                case 9,10 -> System.out.println("Sobresaliente");
                default -> System.out.println("Nota incorrecta");

            }

        System.out.println("Escribe un mes (1 al 12) para saber cuantos dias tiene: ");
        int mes = new Scanner(System.in).nextInt();

        int dias = switch()
    }
}
