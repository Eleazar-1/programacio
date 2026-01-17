import java.util.Scanner;

public class ContadorCaracteres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Escribe una frase: ");
        String frase = sc.nextLine();

        System.out.println("Escribe un caracter: ");
        char caracter = sc.next().charAt(0);

        int contador = 0;

        //RECORRER LA FRASE CARACTER A CARACTER

        //Si el caracter esta en la posicion actual
        //Aumento el contador

        for (int i = 0; i < frase.length(); i++) {
            
            if (caracter==frase.charAt(i)) {
                contador++;
            }
            //Si el caracter esta en la posicion actual
            //Aumento el contador
        }
        System.out.println("El caracter sale: "+contador);
        
        
        sc.close();
    }
}
