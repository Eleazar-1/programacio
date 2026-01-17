import java.util.Scanner;

public class metodo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero1=3;
        multiplicacion(numero1);
        resultado(numero1);
        System.out.println("----MENU DE OPCIONES---");
        System.out.println("1-Saludar");
        System.out.println("2-Despedirse");
        System.out.println("3-Salir");
        int opcion = sc.nextInt();
        menu(opcion);
        sc.close();
    }

    static int multiplicar(int num1, int num2){
        int calculo = num1*num2;
        return calculo;
    }

    static void multiplicacion(int num1){
        System.out.println("TABLA DE MULTI DE "+num1);
        for (int i = 1; i <= 10; i++) {
            System.out.println(i+"x"+num1+"="+multiplicar(i, num1));
        }
        
    }

    static void resultado (int num1){
      if ( num1 %2==0 ) {
        System.out.println("El numero es par");
      }else{
        System.out.println("El numero no es par");
      }
    }

    static void menu(int num1){
        
        do {
            System.out.println("----MENU DE OPCIONES---");
            System.out.println("1-Saludar");
            System.out.println("2-Despedirse");
            System.out.println("3-Salir");
            opcion = sc.nextInt();
            switch (num1) {
            
            case 1:
                System.out.println("Hola usuario");
                break;
            case 2:
                System.out.println("Adios usuario");
                break;
            case 3:
                System.out.println("Has salido");
                break;
            default:
                System.out.println("Opcion no valida");
                break;
            }
        } while (num1 !=3);
        
    }
}
