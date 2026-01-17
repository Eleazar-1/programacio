import java.util.Scanner;

public class act2 {
    public static void main(String[] args) {
       int[] numeros = {1,2,3,4};

       int total =0;

       System.out.println(sumatorio(numeros, total));
    }
    static int sumatorio(int []n, int total){
        int[] numeros = {1,2,3,4};

       total =0;

       for (int i = 0; i < numeros.length; i++) {
            total+=numeros[i];
       }
       return total;
    }

}
