import java.util.Scanner;

public class PracticaExamen {
    static int LONGITUD = 4;
    static int MAX_VALOR = 6;
    static int MAX_INTENTOS = 8;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion =0;

        System.out.println("Introduce la clave: ");
        int clave = sc.nextInt();
        
        
        sc.close();
    }

    //Vamos a crear el array generador de contraseña
    //Y que devuelva la contraseña
    static int generarContraseña(int numero){
        int []contraseña = new int[numero];
        for (int i = 0; i < numero; i++) {
            contraseña[i]=(int)(Math.random()*10);
        }
        String puente ="";
        for (int i : contraseña) {
            puente+=i;
        }
        int password = Integer.parseInt(puente);
        return password;
    }

    //Pedir al usuario intentos para adivinar la clave
    //
    static void intentos (){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la clave");
        int intento = sc.nextInt();
        while (intento <= MAX_INTENTOS) {
            System.out.println("Introduce la clave");
            intento = sc.nextInt();
            
        }
        


        
        sc.close();
    }
}
