import java.util.Scanner;

public class EjerciciosBuclesCondicion {

    public static void main(String[] args) {
        //CONTADOR DE NUMEROS PARES E IMPARES

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número");
        int n = sc.nextInt();

        System.out.println("Pares: ");

        for (int i = 0; i <= n; i++) {
            if (i % 2==0) {
                System.out.println(i + " ");
            }
        }
        System.out.println();
        System.out.println("Impares");
        for (int i = 0; i <= n; i++) {
            if (i % 2!=0) {
                System.out.println(i + " ");
            }
        }

        //STRING PER A CONCATENAR. AMPLIAR CONTANTS QUANTS HI HAN

        System.out.println();
        String pares = "Pares: ";
        String impares = "Impares: ";

        int contadorPares = 0;
        int contadorImpares = 0;

        for (int i = 0; i < n; i++) {
            if (i %2==0) {
                pares= pares + i + " ";
                contadorPares++;
            }else{
                impares = impares + i + " ";
                contadorImpares++;
            }
            
        }//fin for

        System.out.println(pares);
        System.out.println("Total de pares "+contadorPares);
        System.out.println(impares);
        System.out.println("Total de impares "+contadorImpares);
    
        //CALCULAR LA MEDIA DE NOTAS
        // DETENERSE EN -1
        // UTILIZAR do while

        double nota = 0;
        int suma = 0;
        int contador = 0;

        do {
            System.out.println("Introduce la nota(-1 para terminar)");
            nota = sc.nextInt();

            if (nota != -1) {
                suma += nota;
                contador++;
            }

            if (contador > 0) {
                double media = (double)suma / contador;
                System.out.println("La media es "+media);
            } else{
                System.out.println("No se introdujeron notas válidas");
            }
        } while (nota !=-1);

        //NO acepte notas menores de 0 ni mayores de 10
        //Muestre la notas maxima y minima

        double notaMaxima = 0;
        double notaMinima = 0;

        do {
            System.out.println("Introduce la nota (0-10) y (-1) para terminar");
            nota = sc.nextDouble();

            //Si introduce -1 salimos
            if (nota == -1) {
                break;
            }

            //validacion rango
            if (nota < 0 || nota > 10) {
                System.out.println("Error, la nota debe de estar entre 0 y 10");
            }else{
                //nota es valida
                suma += nota;
                contador++;
            }

            //NOTA MAX Y MIN

            if (nota > notaMaxima) {
                notaMaxima = nota;
            }
            if (nota < notaMinima) {
                notaMinima = nota;
            }

        } while (true);
        
        if (contador > 0) {
            double media = suma / contador;
            System.out.println("Numero de notas validas "+contador);
            System.out.println("Media "+media);
            System.out.println("Nota mas alta "+notaMaxima);
            System.out.println("Nota mas baja "+notaMinima);
        }else{
            
        }
    }
}