public class string {

    public static void main(String[] args) {
      // declaramos algunas variables de tipo char para probar
        char caracter1 = '5'; // esto es un digito
        char caracter2 = 'b'; // esto es una letra minuscula
        char caracter3 = 'Z'; // esto es una letra mayuscula
        char caracter4 = '%'; // esto no es ni letra ni digito

        // comprobamos si es un digito usando isDigit
        System.out.println("¿'" + caracter1 + "' es un digito? " + Character.isDigit(caracter1));
        System.out.println("¿'" + caracter2 + "' es un digito? " + Character.isDigit(caracter2));

        // comprobamos si es una letra usando isLetter
        System.out.println("¿'" + caracter2 + "' es una letra? " + Character.isLetter(caracter2));
        System.out.println("¿'" + caracter3 + "' es una letra? " + Character.isLetter(caracter3));
        System.out.println("¿'" + caracter4 + "' es una letra? " + Character.isLetter(caracter4));

        // declaramos algunas cadenas para hacer pruebas
        String cad1 = "HolaMundo";
        String cad2 = "HolaMundo";
        String cad3 = "holamundo";
        String cad4 = "HolaUniverso";

        // usamos equals para comparar si dos cadenas son exactamente iguales (distingue mayusculas)
        System.out.println("¿cad1 es igual a cad2? " + cad1.equals(cad2)); // true
        System.out.println("¿cad1 es igual a cad3? " + cad1.equals(cad3)); // false

        // usamos equalsIgnoreCase para comparar sin importar mayusculas o minusculas
        System.out.println("¿cad1 es igual a cad3 ignorando mayusculas? " + cad1.equalsIgnoreCase(cad3)); // true

        // usamos regionMatches para comparar partes de las cadenas
        // comparamos "Hola" de cad1 con "Hola" de cad4
        boolean region1 = cad1.regionMatches(0, cad4, 0, 4);
        System.out.println("¿Las primeras 4 letras coinciden entre cad1 y cad4? " + region1); // true

        // ahora usamos la version que ignora mayusculas
        // comparamos "Mundo" de cad1 con "mundo" de cad3
        boolean region2 = cad1.regionMatches(true, 4, cad3, 4, 5);
        System.out.println("¿Las partes 'Mundo' y 'mundo' coinciden ignorando mayusculas? " + region2); // true 

        //--------------------------------------------

        // declaramos algunas cadenas para comparar
        String cad11 = "Manzana";
        String cad22 = "Manzana";
        String cad33 = "manzana";
        String cad44 = "Melon";
        String cad55 = "Limón";

        // usamos compareTo para comparar alfabeticamente (distingue mayusculas)
        System.out.println("cad1 vs cad2: " + cad1.compareTo(cad22)); // 0 porque son iguales
        System.out.println("cad1 vs cad3: " + cad1.compareTo(cad33)); // negativo porque 'M' < 'm' en ASCII
        System.out.println("cad1 vs cad4: " + cad1.compareTo(cad44)); // negativo porque 'Manzana' va antes que 'Melon'
        System.out.println("cad1 vs cad5: " + cad1.compareTo(cad55)); // positivo porque 'Manzana' va despues que 'Limón'

        // usamos compareToIgnoreCase para comparar sin importar mayusculas
        System.out.println("cad1 vs cad3 ignorando mayusculas: " + cad1.compareToIgnoreCase(cad3)); // 0 porque son iguales ignorando mayusculas

        // ejemplo de concatenacion de cadenas
        String resultado = cad1 + " y " + cad4 + " son frutas.";
        System.out.println("Concatenacion: " + resultado);

        //------------------------------------------

        // declaramos una cadena base para hacer pruebas
        String texto = "   Bienvenido a Java   ";

        // usamos charAt para obtener el caracter en una posicion concreta
        char letra = texto.charAt(3); // recuerda que empieza en 0
        System.out.println("El caracter en la posicion 3 es: '" + letra + "'");

        // usamos substring para obtener una subcadena desde una posicion hasta el final
        String sub1 = texto.substring(3);
        System.out.println("Subcadena desde la posicion 3: '" + sub1 + "'");

        // usamos substring con inicio y fin para obtener una parte concreta
        String sub2 = texto.substring(3, 12); // del 3 al 11
        System.out.println("Subcadena del 3 al 11: '" + sub2 + "'");

        // usamos strip para eliminar espacios blancos al principio y al final
        String limpio = texto.strip();
        System.out.println("Cadena con strip: '" + limpio + "'");

        // usamos trim para eliminar caracteres no imprimibles (espacios, tabuladores, etc)
        String recortado = texto.trim();
        System.out.println("Cadena con trim: '" + recortado + "'");

        // usamos stripLeading para quitar solo los espacios del principio
        String inicioLimpio = texto.stripLeading();
        System.out.println("Cadena con stripLeading: '" + inicioLimpio + "'");

        // usamos stripTrailing para quitar solo los espacios del final
        String finalLimpio = texto.stripTrailing();
        System.out.println("Cadena con stripTrailing: '" + finalLimpio + "'");

        // usamos length para saber cuántos caracteres tiene la cadena original
        int longitud = texto.length();
        System.out.println("La longitud de la cadena original es: " + longitud);

        //-------------------------------------------

        {

        // declaramos una cadena base para hacer pruebas
        String frase = "Java es divertido y Java es potente";

        // usamos indexOf(int c) para buscar la primera ocurrencia de un caracter
        int pos1 = frase.indexOf('J');
        System.out.println("Primera ocurrencia de 'J': " + pos1); // deberia ser 0

        // usamos indexOf(String cadena) para buscar la primera ocurrencia de una palabra
        int pos2 = frase.indexOf("Java");
        System.out.println("Primera ocurrencia de 'Java': " + pos2); // deberia ser 0

        // usamos indexOf(int c, int inicio) para buscar desde una posicion concreta
        int pos3 = frase.indexOf('J', 10);
        System.out.println("Buscando 'J' desde la posicion 10: " + pos3); // deberia ser 21

        // usamos indexOf(String cadena, int inicio) para buscar una palabra desde una posicion
        int pos4 = frase.indexOf("Java", 10);
        System.out.println("Buscando 'Java' desde la posicion 10: " + pos4); // deberia ser 21

        // usamos lastIndexOf(int c) para buscar la ultima ocurrencia de un caracter
        int pos5 = frase.lastIndexOf('e');
        System.out.println("Ultima ocurrencia de 'e': " + pos5); // deberia ser 33

        // usamos lastIndexOf(String cadena) para buscar la ultima ocurrencia de una palabra
        int pos6 = frase.lastIndexOf("Java");
        System.out.println("Ultima ocurrencia de 'Java': " + pos6); // deberia ser 21

        // usamos lastIndexOf(int c, int inicio) para buscar desde una posicion hacia atras
        int pos7 = frase.lastIndexOf('a', 20);
        System.out.println("Buscando 'a' hacia atras desde la posicion 20: " + pos7); // deberia ser 17

        // usamos lastIndexOf(String cadena, int inicio) para buscar una palabra hacia atras desde una posicion
        int pos8 = frase.lastIndexOf("Java", 20);
        System.out.println("Buscando 'Java' hacia atras desde la posicion 20: " + pos8); // deberia ser 0

        //-----------------------------------------

        // declaramos algunas cadenas para probar
        String vacia = "";
        String frases = "Programar en Java es divertido";
        String saludo = "  Hola Mundo  ";

        // usamos isEmpty para ver si la cadena está vacia
        System.out.println("¿La cadena 'vacia' está vacia? " + vacia.isEmpty()); // true
        System.out.println("¿La cadena 'frase' está vacia? " + frases.isEmpty()); // false

        // usamos contains para ver si una subcadena está dentro de otra
        System.out.println("¿La frase contiene 'Java'? " + frase.contains("Java")); // true
        System.out.println("¿La frase contiene 'Python'? " + frase.contains("Python")); // false

        // usamos startsWith para ver si la cadena empieza por cierto prefijo
        System.out.println("¿La frase empieza por 'Pro'? " + frase.startsWith("Pro")); // true

        // usamos startsWith con posición de inicio
        System.out.println("¿La frase tiene 'Java' empezando desde la posición 13? " + frase.startsWith("Java", 13)); // true

        // usamos endsWith para ver si termina con cierto sufijo
        System.out.println("¿La frase termina con 'divertido'? " + frase.endsWith("divertido")); // true

        // usamos toLowerCase para convertir todo a minusculas
        String minusculas = saludo.toLowerCase();
        System.out.println("Saludo en minusculas: '" + minusculas + "'");

        // usamos toUpperCase para convertir todo a mayusculas
        String mayusculas = saludo.toUpperCase();
        System.out.println("Saludo en mayusculas: '" + mayusculas + "'");

        // usamos replace(char, char) para cambiar letras
        String cambiado1 = frase.replace('a', '@');
        System.out.println("Frase con 'a' reemplazada por '@': " + cambiado1);

        // usamos replace(CharSequence, CharSequence) para cambiar palabras
        String cambiado2 = frase.replace("Java", "Python");
        System.out.println("Frase con 'Java' reemplazado por 'Python': " + cambiado2);

        //-----------------------------------------

        {

        // declaramos una cadena para hacer pruebas
        String frasa = "Java,Python,C++,JavaScript";

        // usamos split para dividir la cadena por comas
        String[] lenguajes = frase.split(",");
        System.out.println("Lenguajes separados por coma:");
        for (String lang : lenguajes) {
            System.out.println("- " + lang);
        }

        // usamos toCharArray para convertir la cadena en un array de caracteres
        char[] caracteres = frase.toCharArray();
        System.out.println("Caracteres de la frase:");
        for (char c : caracteres) {
            System.out.print(c + " ");
        }
        System.out.println(); // salto de linea

        // usamos valueOf para convertir el array de caracteres en una cadena nueva
        String reconstruida = String.valueOf(caracteres);
        System.out.println("Cadena reconstruida desde el array: " + reconstruida);

    }
}
}
}