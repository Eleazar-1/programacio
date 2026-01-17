public class act5 {
    public static void main(String[] args) {
        int[] numReales = {2,4,5,6,8,9};
        int calculoMedia =0;
        for (int i = 0; i < numReales.length; i++) {
            calculoMedia += numReales[i]; 
        }

        System.out.println("La media es de: "+media(calculoMedia));

        for (int i = 0; i < numReales.length; i++) {
            if (numReales[i]> media(calculoMedia)) {
                System.out.println(numReales[i]+" es superior a la media");
            }
        }
    }

    static int media (int array){
        array = array /6;
        return array;
    }

}
