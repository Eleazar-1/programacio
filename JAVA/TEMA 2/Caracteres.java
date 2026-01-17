public class Caracteres {
    public static void main(String[] args) {
        //Character es una clase envoltorio(Wrapper class)
        //Todos los metodos son estaticos
        //Character.nombreDelMetodo(caracter)

        char digito = '5';
        System.out.println("isDigit "+ digito+" "+Character.isDigit(digito));

        digito = 'a';
       // System.out.println(Character.isDigit(digito)? "("+digito+") -": );
    
        String cadena = "Curso JAVA DAW";

        //charAt(int pos)

        System.out.println("La primera letra es "+ cadena.charAt(0));

        char letraPrimera = cadena.charAt(0);
        System.out.println(letraPrimera);

        String cadena1 = cadena.substring(7, 14);
        System.out.println(cadena1);
    
    }
}
