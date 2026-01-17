public class SobreCarga {
    public static void main(String[] args) {
        //invocar
        saluda();
        saludar("Joan");
        //saludarv2 -- retorna String


    }

    //metodo sin parametros
    static void saludar(){
        System.out.println("Hola, que tal?");
    }

    static void saludar(String nombre){
        System.out.println("Hola "+nombre+", como estas?");
    }

    static String saludar(String nombre){
        return "Hola";
    }
}
