import java.util.Scanner;

public class ordenacion2 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String fin;
        int array [];
        int numero = 0;
        System.out.println("Introduce numeros o 'fin' para acabar.");

        if
    }

    static int validarValor (int numero, int array[], String fin){
        while (true) {
            if (sc.hasNextInt()) {
                numero = sc.nextInt();
                for (int i : array) {
                    array[i] = numero;
                }
            }else if (sc.hasNextLine()) {
                fin = sc.nextLine();
            
                if (fin.equals("fin")) {
                    System.out.println("Fin del programa");
                    break;
                }else{
                    System.out.println("Opcion no valida");
                }
            } 
        }
        return 0;
    }

    static int [] ordenarArray(int array []){
        for (int i = 0; i < array.length; i++) {
            
        }
        
    }

}
