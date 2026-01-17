import java.util.Scanner;

public class ordenacion {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int array[] = {};
        int valor = 0;
        String fin = "no";
        //PROGRAMA

        //1 PEDIR AL USUARIO VARIOS NUMEROS
        //2 SE AÑADAN A UN ARRAY
        //3 ORDENAR EL ARRAY TODO EL RATO
        //4 MOSTRAR RESULTADO
        //FIN = CUANDO EL USUARIO ESCRIBA "FIN"

        while (true) {
            
            System.out.println("Introduce un valor o 'fin' para acabar.");
            
            if (sc.hasNextInt()) {
                valor = sc.nextInt();
                array[] = valor;
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
    }
    

}
