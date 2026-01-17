import java.util.Scanner;

public class act25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-------------------");
        System.out.println("Que opción eliges?");
        System.out.println("-------------------");
        System.out.println("1-Cuadrado relleno");
        System.out.println("2-Cuadrado vacio");
        System.out.println("3-Rectangulo relleno");
        System.out.println("4-Rectangulo vacio");
        System.out.println("5-Triangulo rectangulo");
        System.out.println("6-Salir");
        int eleccion = sc.nextInt();
        switch (eleccion) {
            case 1:
                System.out.println("Asteriscos de lado?: ");
                int lado1 = sc.nextInt();
                for (int i = 0; i < lado1; i++) {
                    for (int j = 0; j < lado1; j++) {
                    System.out.print("*"); 
                    }
                    System.out.println();
                }
                break;
            case 2:
                System.out.println("Asteriscos de lado?: ");
                int lado2 = sc.nextInt();
                for (int i = 0; i < lado2; i++) {
                for (int j = 0; j < lado2; j++) { 
                    if (i == 0 || i == lado2 - 1 || j == 0 || j == lado2 - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");// 
                    }
                }
                System.out.println();
                }
                break;
            case 3:
                System.out.println("Asteriscos de base?: ");
                int base1 = sc.nextInt();
                System.out.println("Asteriscos de altura");
                int altura1 = sc.nextInt();
                for (int i = 0; i < altura1; i++) {
                    for (int j = 0; j < base1; j++) {
                    System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            case 4:
                System.out.println("Asteriscos de base?: ");
                int base2 = sc.nextInt();
                System.out.println("Asteriscos de altura");
                int altura2 = sc.nextInt();
                for (int i = 0; i < altura2; i++) {
                for (int j = 0; j < base2; j++) {
                    if (i == 0 || i == altura2 - 1 || j == 0 || j == base2 - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
                }
                break;
            case 5:
                System.out.println("Asteriscos de base?: ");
                int base3 = sc.nextInt();
                for (int i = 0; i < base3; i++) {
                    for (int j = 0; j < (2*i-1); j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            case 6:
                
                break;
            
        }
        sc.close();
    }
}
