public class InvertirCadena {
    public static void main(String[] args) {
        System.out.println(invertirCadena("hola"));
    }

    static String invertirCadena(String texto){
        if (texto.length() <= 1) {
            return texto;
        }else{
            return invertirCadena(texto.substring(1))+texto.charAt(0);
            
        }
    }
}
