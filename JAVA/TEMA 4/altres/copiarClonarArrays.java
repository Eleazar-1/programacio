import java.util.Arrays;

public class copiarClonarArrays {
    public static void main(String[] args) {
        int [] nums ={1,2,3,4,5};
        int [] copiarArray;

        copiarArray = nums;
        copiarArray[0] =0;
        
        System.out.println("Recorrer: ");
        for (int i : nums) {
            System.out.println(i);
        }

        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(copiarArray));

        System.out.println("Vemos las referencias ");
        System.out.println(nums);
        System.out.println(copiarArray);

        int []primos = {1,3,5,7,9,11,13,15};
        int []copiaConClonado;//Copia independiente
        int []copiaConReferencia;//por referencia

        //Clonar con otro espacio de memoria
        copiaConClonado = primos.clone();//NO MODIFICO EL ORIGINAL
        
        copiaConClonado[0]=0;
        copiaConReferencia=primos;
        copiaConReferencia[1]=0;
    
    }
}
