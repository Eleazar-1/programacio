public class Conversiones {
    public static void main(String[] args) {
        //TIPOS DE DATOS PRIMITIVOS
        byte tByte = 1; // 1byte 8 bits
        short tShort = 2; // 2 bytes (16 bits)
        int tInt = 3; // 4Bytes (32 bits)
        long tLong = 4L; // 8 Bytes
        float tFloat = 5f; // 4 bytes
        double tDouble = 6;
        char tChar = 'a'; // 2 bytes
        boolean tBool = true; //1 byte

        // Idea clave: Promocionarlos = pasar a un tipo MAS grande sin perdida
        // Estrechamiento = pasar a un tipo mas pequeño pero pierde info

        //Conversion implicita (promocionar) No necesita casting DE + pequeño a  + grande

        // byte > short > int > long > float > double
        //(char -> int) tambien es promocion

        int entero = 100; //4bytes
        long enteroLargo = entero; // de 4 a 8. Cabe sin perder ino
        double comoDouble = entero; // 8 bytes 100.0

        //conversion explicita (casting) PUEDE  perder precision / valor
        //double > float > long > int > char > short > byte

        double dVal = 12345.6789;
        int dAint = (int)dVal; //TRuncar los decimales
        System.out.println("double -> int (trunca) "+dAint);

        float fVal = 12.4465465f;
        int fAint = (int)fVal;
        System.out.println("float --> int "+ fAint);//12

        long lVal = 1_001_234_525L;
        

        // char <-> int

        int codigoA = 65;
        char letraA = (char)codigoA;
        System.out.println("65 como char: "+letraA);

        char letra = 'a';
        int codigo = letra; // promocion char - int 97
        System.out.println("a como int "+codigo);

        //Podemos operar con char
        letra++; //b
        letra +=5; //g
        letra --; //f
        letra = (char)(letra - 2);

        //Cuidado con las mezclas
        letra = (char)('f' +100 + '1');// 102 + 100 + 49
        System.out.println("Resultado de la mezcla es "+ letra);

        //Pasar de string -> numeros (clases envoltorio)
       String sEntero = "123";
        int pEntero = Integer.parseInt(sEntero);
        System.out.println("ParseInt"+pEntero);

        String sDecimal = "45,67";
        double pDouble = Double.parseDouble(sDecimal); // "45,67" A 45,67
        System.out.println("parseDouble: "+pDouble);

        boolean pBool = Boolean.parseBoolean("true");

        String sNum = "123456";
        int conv = Integer.parseInt(sNum); 
        int suma = conv + 5;
        System.out.println("123456 + 5 = "+ suma);

        //char y string

        char digitoChar = '2';
        int mal = (int)Math.pow(digitoChar, 3);
        System.out.println("2 elevat a 3"+mal);
        
        //CONVERTIR CHAR A INT
        String comoTexto = Character.toString(digitoChar);
        int dos = Integer.parseInt(comoTexto);
        int dosalcubo = (int)(Math.pow(dos, 3));
        System.out.println("");

    }
    
}
