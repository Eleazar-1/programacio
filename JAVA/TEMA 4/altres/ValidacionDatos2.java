import java.util.Scanner;

public class ValidacionDatos2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Validacion entero simple");
        System.out.println("Introduce un numero entero");

        if (sc.hasNextLine()) {
            int numero = sc.nextInt();
            System.out.println("Exito. Has introducido el "+numero);
        }else{
            System.out.println("Error, No era un número: ");
            sc.nextLine();
        }
        System.out.println("VALIDACION ENTERO BUCLE INFINITO");

        while (true) {
            System.out.println("Introduce un numero entero");

            //Miramos si hay entero esperando
            if (sc.hasNextInt()) {
                int numero = sc.nextInt();
                System.out.println("Enhorabuena, has introducido el "+numero);
                break;
            }else{
                System.out.println("Error, no era un numero");
                sc.next();
            }
        }

        System.out.println("SISTEMA SALARIO");
        double salario = 0;
        boolean datoValido = false;

        do {
            System.out.println("Introduce salario mensual (deicmal):");

            if (sc.hasNextDouble()) {
                salario = sc.nextDouble();
                if (salario >=0) {
                    datoValido = true;
                }else{
                    System.out.println("Error, el salario no puedes ser negativo");
                }
            }else{
                System.out.println("Error, esto no es un numero decimal");
            }
        } while (!datoValido);
        System.out.println("LIMPIEZA DE BUFFER");
        System.out.println("Dime edad");
        int edad = sc.nextInt();
        sc.next();

        System.out.println("Dime tu nombre: ");
        String nombre = sc.nextLine();
        sc.close();
    }

}
