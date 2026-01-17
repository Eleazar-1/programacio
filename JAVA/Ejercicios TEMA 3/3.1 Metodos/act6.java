public class act6 {
    public static void main(String[] args) {
        int mayor =0;
        int menor =0;
        calculoMayorYMenor(mayor, menor);
    }

    static void calculoMayorYMenor(int mayor, int menor){
        int []numeros={2,5,6,8,20,5,30};
        mayor =numeros[0];
        menor =numeros[0];
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i]>mayor) {
                mayor=numeros[i];
            }
        }
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i]<menor) {
                menor=numeros[i];
            }
        }
        
        System.out.println("El numero mayor es: "+mayor);
        System.out.println("El numero menor es: "+menor);
    }
}