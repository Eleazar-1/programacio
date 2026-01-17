import java.util.Scanner;

public class MenuBucles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el alto: ");
        
        int opcion;

        do {
            
            System.out.println("\n==============");
            System.out.println("\nMENUS PRINCIPAL BUCLES Y IF");
            System.out.println("\n==============");
            System.out.println("Ejercicio 1 Pares Impares");
            System.out.println("Practica de bucles y dobles bucles");
            System.out.println("Ejercicio 2: Media de notas ");
            System.out.println("Do while y validacion de datos");
            System.out.println("3) Ejercicio adivina el numero");
            System.out.println("While, do while, break, rango dinamico");
            System.out.println("4) Ejercicio cuadrado con doble for");

            opcion = sc.nextInt();
            System.out.println();

            switch (opcion) {
                case 1 -> {System.out.println("Practica de bucles y dobles bucles");
                int op1;
                do {
                    System.out.println("""
                            
                            
                    ==========================
                    EJERCICIO 1 PARES E IMPARES
                    ==========================

                    1) Version A: Dos bucles separados
                    2) Version B: Un solo bucle
                    0) Volver al menu principal
                    ----------------------------------
                    Elige una version
                    """);
                    op1= sc.nextInt();
                    System.out.println();
                    switch (op1) {
                        case 1 -> {System.out.println("Version A");}
                        case 2 -> {System.out.println("Version B");}
                        case 3 -> System.out.println("Volviendo al menu principal");
                    
                        default -> System.out.println("Opcion no valida, vuelve a introducir el numero");
                            
                    }
                } while (op1 !=0);
            
            
                }
                case 2 -> {System.out.println("Media de notas");}
                case 3 -> {System.out.println("Adivina el numero");
                System.out.println("\n Version con break");
                int numero = -2;

                int numeroSecreto = (int)(Math.random()*101);
                
                while (numero != numeroSecreto && numero != -1 ) {
                    System.out.println("Introduce el numero: ");
                    numero = sc.nextInt();
                    if (numero > numeroSecreto) {
                        System.out.println("El numero es inferior.");
                    } else if (numero < numeroSecreto) {
                        System.out.println("El numero es superior.");
                    }
                }

                if (numero == numeroSecreto) {
                    System.out.println("Has acertado el numero!");
                } else if (numero == -1) {
                    System.out.println("Te has rendido.");
                }
                
                }
                case 4 -> {System.out.println("Cuadrado con doble for");
                System.out.println("Introduce el alto: ");
                    int alto = sc.nextInt();
                    System.out.println("Introduce el ancho: ");
                    int ancho = sc.nextInt();

                    for (int i = 1; i <= alto; i++) {

                        for (int j = 1; j <= ancho; j++) {
                            if (i == 1 || i == alto || j == 1 || j == ancho) {
                                System.out.print("* ");
                            }else{
                                System.out.print("  ");
                            }
                        }
                        System.out.println(" ");
                    }
            
            
                }
                case 0 -> {System.out.println("Fin del programa, hasta pronto.");}
                default -> System.out.println("Opcion no valida, introduce del 0 al 4");
                    
            }
        } while (opcion != 0);

        sc.close();
    }
}
