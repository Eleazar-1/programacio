public class exercicis {
    /*
     * Crea un metodo que dado un Array de enteros y un valor entero,
     * muestre la cantidad de veces que aparece el entero en el array
     */

    public static void main(String[] args) {
        int[] arrayEjemplo={2,1,3,5,5,6,8,8,9,5};
        cantidadVeces(arrayEjemplo, 5);
        String arrayPalabras[]={"Hola", "primero", "DAW", "novembre"};
        palabraMasLarga(arrayPalabras);
        buscarLetras(arrayPalabras, 'n');

        int[]a={4,5,9,8,2,1};
        int[]b={7,12,5,6,8,9};
        //mostrarArray(a, b);

        System.out.println("\n Arrays diferentes");
        
    }
    static int[] arrayMasGrandeDiferentes(int [] array1, int array2[]){
        //inicializar el array mas grande
        int [] arrayFinal = array1.length > array2.length ? array1:array2;
        for (int i = 0; i < arrayFinal.length; i++) {
            if (i>=array1.length) {//cuando array2 es mas largo
                arrayFinal[i]=array2[i];
            }
            else if (i>= array2.length) {
                arrayFinal[i]=array1[i];
            }else{
                //Cuando ambos arrays tienen el mismo tamaño
                //Comparar los valores
                if (array1[i] > array2[i]) {
                    arrayFinal[i]= array1[i];
                }else{
                    arrayFinal[i]=array2[i];
                }
            }
        }
        return arrayFinal;
    }
    static int[] arrayMasGrande(int[] array1, int array2[]){
        int [] arrayFinal = array1;//son iguales
        for (int i = 0; i < arrayFinal.length; i++) {
            if (array1[i]>array2[i]) {
                arrayFinal[i]=array1[i];
            }else{
                arrayFinal[i] = array2[i];
            }
        }
        return arrayFinal;
    }
    static void buscarLetras(String [] palabras, char letra){
        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i].charAt(0)== letra) {
                System.out.println(palabras[i]);
            }
        }
    }
    static void palabraMasLarga(String[] palabras){
        String palabraMax = "";
        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i].length()>palabraMax.length()) {
                palabraMax = palabras[i];
            }
        }
        System.out.println("La palabra mas larga es: "+palabraMax);
    }

    static void cantidadVeces(int [] array, int n){
        int contador=0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]==n) {
                contador++;
            }
        }
        if (contador ==0) {
            System.out.println("El valor "+n+" no aparece en el array");
        }else{
            System.out.println("El valor "+n+" aparece "+contador+(contador ==1 ? " vez ":" veces "));
        }
    }
    static void mostrarArray(int [] array){
        for (int i : array) {
            System.out.println("["+i+"]");
        }
    }
}