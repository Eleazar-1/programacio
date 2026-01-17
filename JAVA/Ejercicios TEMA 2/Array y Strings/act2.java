public class act2 {
    public static void main(String[] args) {
        int numeros[] = {1,2,3,10,15,20,25,30,58,70};
        int min = 0;
        int max =0;

        for (int i : numeros) {
            if (i > max) {
                max = i;
            }
        }
        
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[0] > min) {
                min = i;
            }
            
        }
        
        System.out.println("Max: "+max+", min: "+min);
    }
}
