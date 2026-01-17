public class varargs {

    public static void main(String[] args) {
        System.out.println("Ejemplo 1 cantidad variable de enteros");
        mostrarEnteros(5);
        mostrarEnteros(1,2,3,4);
        mostrarEnteros();
        int a=2, b=3;
        mostrarEnteros(b,a++,a*b,++b);

        System.out.println("Ejemplo 2");
        System.out.println("Sumar: "+sumar(2,4,5,6));

        System.out.println("Ejemplo 3");
        mostrarLinea("Alumnos", "ana", "luis", "maria");
    }
    //Parametros fijo + args
    static void mostrarLinea(String titulo, String... palabras){
        for (String p : palabras) {
            System.out.println(p+",");
        }
        System.out.println();
    }
    //Sumar todos los enteros recibidos
    static int sumar (int... valores){
        int suma = 0;
        for (int v : valores) {
            suma+=v;
        }
        return suma;
    }

    //Mostrar enteros recibidos por vararg
    static void mostrarEnteros(int... nums){
        System.out.println("Hay "+nums.length+" enteros ");
        for (int n : nums) {
            System.out.println(n+" ");
        }
        System.out.println();
    }
}