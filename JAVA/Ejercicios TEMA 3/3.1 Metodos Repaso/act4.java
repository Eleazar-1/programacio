import java.util.Scanner;

public class act4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            menuImprimir();
            opcion = sc.nextInt();
            switch (opcion) {
            case 1:
                System.out.println("Introduce el nº: ");
                int n = sc.nextInt();
                System.out.println(cuadrado(n));
                break;
            case 2:
                System.out.println("Introduce el nº: ");
                int c = sc.nextInt();
                System.out.println(cubo(c));
                break;
            case 3:
                System.out.println("Introduce la base: ");
                int b = sc.nextInt();
                System.out.println("Introduce la potencia: ");
                int p = sc.nextInt();
                System.out.println(potencia(b, p));
                break;
            case 4:
                System.out.println("Saliendo");
                break;
        
            default:
                System.out.println("Opcion no valida");
                break;
        
            }
        } while (opcion !=4);
            
        sc.close();
    }
    static void menuImprimir(){
        System.out.println("---------MENU-------");
        System.out.println("1 Calcular el cuadrado");
        System.out.println("2 Calcular el cubo");
        System.out.println("3 Calcula la potencia");
        System.out.println("4 Salir");
    }

    static int cuadrado(int c){
        return c*c;
    }

    static int cubo(int c){
        return c*c*c;
    }

    static int potencia(int base, int potencia){
        return (int)(Math.pow(base, potencia));
    }
}
