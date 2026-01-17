import java.util.Scanner;

public class act4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion=0;
        while (opcion!=4) {
            System.out.println("---------MENU---------");
            System.out.println("1 Calcular el cuadrado");
            System.out.println("2 Calcular el cubo");
            System.out.println("3 Calcular la potencia");
            System.out.println("4 Salirse");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Dime el numero: ");
                    int cuadrado = sc.nextInt();
                    System.out.println(cuadrado(cuadrado));;
                    break;
                case 2:
                    System.out.println("Dime el numero: ");
                    int cubo = sc.nextInt();
                    System.out.println(cubo(cubo));
                    break;
                case 3:
                    System.out.println("Dime la base: ");
                    int base = sc.nextInt();
                    System.out.println("Dime el exponente: ");
                    int exponente = sc.nextInt();
                    System.out.println(potencia(base, exponente));
                    break;
                case 4:
                    System.out.println("Has salido.");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }
        sc.close();
    }

    public static int cuadrado(int cuadrado){
        return cuadrado*cuadrado;
    }
    public static int cubo(int cubo){
        return cubo*cubo*cubo;
    }
    public static double potencia(int base, int exponente){
        double resultado =Math.pow(base, exponente);
        return resultado;
    }
}
