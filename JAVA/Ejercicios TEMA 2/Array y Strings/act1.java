public class act1 {

    public static void main(String[] args) {
        int numeros[] = {1,5,6,8,9,7};
        int suma = 0;
        double media = 0;

        for (int i : numeros) {
            suma += i;
        }
        
        media = suma / numeros.length;

        for (int i : numeros) {
            if (i > media) {
                System.out.println("Es superior a la media: "+i);
            }
        }

        
        System.out.println("La media es de "+media);

        if (numeros[0] > media) {
            System.out.println("Es superior a"+media);
        }
    }
}