public class PalabraOrdenada {
    public static void main(String[] args) {
        System.out.println(palabraOrdenada("palabra"));
    }

    static boolean palabraOrdenada(String cad){
        // Si la cadena tiene solo 1 caracter o està vacia

        if (cad.length()<= 1) {
            return true;
        }
        return (cad.charAt(0) <= cad.charAt(1)&& palabraOrdenada (cad.substring(1, cad.length())));
    }
}
