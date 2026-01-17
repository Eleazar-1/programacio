import java.util.Scanner;

public class ACT12 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Introduce el número: ");
    double numero = sc.nextDouble();

    int siete = 7;
    double resultado = numero % siete;
    
    if (resultado == 0) {
        System.out.println(numero +" es multiplo de "+siete);
    } else{
        System.out.println(7 - resultado+" Esto es lo que falta para llegar.");
    }

    sc.close();
  }

}



