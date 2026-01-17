public class act5 {
    public static void main(String[] args) {
        int []numeros={2,5,6,8,20,5,30};
        int media =0;
        System.out.println(calculoMedia(media, media));
    }

    static double calculoMedia(int media, int mediaTotal){
        int []numeros={2,5,6,8,20,5,30};
        media =0;
        for (int i = 0; i < numeros.length; i++) {
            media+=numeros[i];
        }
        mediaTotal=media/7;
        for (int j = 0; j < numeros.length; j++) {
           if (numeros[j]>mediaTotal) {
            System.out.println(numeros[j]+" es superior a la media.");
            } 
        }
        System.out.println("La media es: ");
        return mediaTotal;
    }

    
}

