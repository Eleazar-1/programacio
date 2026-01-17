import java.util.Random;

public class Ejercicio3 {
    public static void main(String[] args) {
        
    }
    static int lanzarDado(){
        Random rnd = new Random();
        
        return rnd.nextInt(6)+1;
    }

    static int [] simularLanzamientos(int n){
        int [] numerosDado = new int[6];
        //6 posiciones

        for (int i = 0; i < n; i++) {
            int resultado = lanzarDado();
        }
    }

    public static void mostrarEstadisticas(int []numerosDado ){
        for (int i = 0; i < numerosDado.length; i++) {
            System.out.println("Numero "+(i+1)+" ->"+numerosDado[i]+"veces");
        }
    }
}
