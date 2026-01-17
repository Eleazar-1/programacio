import java.util.Scanner;

public class act5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int numero1 = (int)(Math.random()*101);
        int numero2 = (int)(Math.random()*101);
        int resultadoReal = numero1 + numero2;
        System.out.println("Cuanto es?: "+numero1+"+"+numero2);
        int resultado = sc.nextInt();
        int contadorAcertadas = 0;

        if (resultado != resultadoReal) {
            System.out.println("La operacion es incorrecta, fin.");
        }else {
            System.out.println("La operacion "+numero1+"+"+numero2+" es correcta.");
            System.out.println("-----------------------------------");
            contadorAcertadas ++;
        }

        while (resultado == resultadoReal) {
        
            numero1 = (int)(Math.random()*101);
            numero2 = (int)(Math.random()*101);
            System.out.println("Cuanto es?: "+numero1+"+"+numero2);
            resultado = sc.nextInt();
            resultadoReal = numero1 + numero2; 
            
            if (resultado != resultadoReal) {
            System.out.println("La operacion es incorrecta, fin.");
            }else {
            System.out.println("La operacion "+numero1+"+"+numero2+" es correcta.");
            System.out.println("-----------------------------------");
            contadorAcertadas ++;
            }

        }
        System.out.println("El numero de operaciones acertadas es "+contadorAcertadas);
        sc.close();
    }
}
