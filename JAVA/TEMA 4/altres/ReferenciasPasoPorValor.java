public class ReferenciasPasoPorValor {
    public static void main(String[] args) {
     int n = 10;
     System.out.println("Antes de llamar al metodo, número vale "+n);
     
     intentarCambiarInt(n);
     System.out.println("Despues de llamar al metodo, numero vale"+n);

     String [] miArray = new String[3];
     miArray[0] = "Ana";
     System.out.println("Antes de llamar a miArray[0] vale "+miArray);

     cambiarArray(miArray);
     System.out.println("Despues de llamar a miArray[0] vale "+miArray[0]);

    }
    static void cambiarArray(String [] arrayOriginal){
        arrayOriginal[0]="Berto";
        System.out.println("Dentro del metodo, el array[0] vale "+arrayOriginal);
    }
    static void intentarCambiarInt(int n){
        n = 20;
        System.out.println("2. Dentro del método, la copia vale"+n);
    }
}
