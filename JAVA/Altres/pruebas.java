import java.util.Arrays;

public class pruebas {
        static int LONGITUD_CLAVE = 4;
        static int MAX_VALOR = 5;
    public static void main(String[] args) {
        int [] secreto = generarSecreto();
        System.out.println(Arrays.toString(secreto));
    }
    static int[] generarSecreto(){
        int[] secreto = new int[LONGITUD_CLAVE];

        for (int i = 0; i < LONGITUD_CLAVE; i++) {
            secreto[i]=(int)(Math.random()*MAX_VALOR)+1;
        }
        return secreto;
    }
}