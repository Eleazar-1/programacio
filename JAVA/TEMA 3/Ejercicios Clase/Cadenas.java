public class Cadenas {
    public static void main(String[] args) {
        diferenciasCharString();
        operacionesBasicas();
        busquedaTexto();
        extraerSubstrings();
        recorrerCadenas();
        demoDividirCadena();
        buscarLetraPosiciones();
        String texto = "murcielago";
        int contador = manualContarVocales(texto);
        System.out.println(contador);
        System.out.println(manualInvertir("coche"));
        String cadena = manualQuitarTodosEspacios("Lo que queramos");
        System.out.println(cadena);
        System.out.println(manualEquals("textp", "textp"));
        
    }
    //DOBLE METODOS

    static void demoContarVocales(){
        System.out.println("CONTAR VOCALES");
        String texto = "Aprendiendo Java";
        System.out.println("Texto "+texto);
        System.err.println("Manual nuestro: "+manualContarVocales(texto));

        //METODO DE LA API
        String vocales = "aeiouAEIOU";
        int contadorIndex = 0;
        for (int i = 0; i < texto.length(); i++) {
            if (vocales.indexOf(texto.charAt(i)) != -1) {
                contadorIndex++;
            }
        }
        System.out.println("indexOF"+contadorIndex);
    }
    static void analizadorDeTextos(){
        System.out.println("Analizador de texto");
        //Introducir la frase

        //si esta buida dir que no ha introduit res.
        //sino
        System.out.println("\n ---INFORME DEL TEXTO----");
    }
    static void demoPalindroma(){
        System.out.println("Es palindroma");
        String texto = "Anita lava la tina";
        System.out.println("Texto "+texto);
        System.out.println("Es palindroma"+manualContarConsonantes(texto));
    }
    static void demoInvertirCadena(){
        System.out.println("Invertir cadena");
        String original = "Roma";
        String invertida = manualInvertir(original);
        System.out.println("Original: "+original);
        System.out.println("Invertida ()"+invertida);
    }
    static void demoReemplazar(){
        System.out.println("REEMPLAZAR CARACTERES");
        String texto = "patata";
        System.out.println("Texto "+texto);
        System.out.println("API .replace: "+texto.replace('a', 'o'));
        System.out.println("Manual nuestro: "+manualReemplazarCaracter(texto, 'a', 'o'));

    }
    static void demoQuitarEspacios(){
        System.out.println("QUitar espacios");
        String texto = "Hola daw";
        System.out.println("Texto original "+texto);
        System.out.println(".trim()"+texto.trim() + " Solo en extremos");
        System.out.println("Manual nuestro "+manualQuitarTodosEspacios(texto)+"quita todos");
    }
    //IMPLEMENTACION MANUAL DE EQUALS
    
    static boolean manualEquals(String a, String b){
        if (a.length() != b.length()) {
            return false;
        }
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) {
                return false;
            }
        }
        return true;
    }
    //BIBLIOTECA MANUAL
    
    static String manualReemplazarCaracter(String texto, char origen, char nuevoChar){
        String resultado = "";
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            if (c==origen) {
                resultado= resultado + nuevoChar;
            } else {
                resultado = resultado+c;
            }
        }
        return resultado;
    }
    static boolean manualEsPalindroma(String texto){
        String limpio = manualQuitarTodosEspacios(texto.toLowerCase());
        String invertido = manualInvertir(limpio);
        return limpio.equals(invertido);
    }

    static String manualQuitarTodosEspacios(String texto){
        String resultado="";
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            if (c !=' ') {
                resultado= resultado +c;
            }
        }
        return resultado;
    }
    static String manualInvertir(String texto){
        String resultado = "";
        for (int i = texto.length()-1; i >=0; i--) {
            resultado = resultado + texto.charAt(i);
        }
        return resultado;
    }

    static int manualContarConsonantes(String texto){
        int contador = 0;
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            if (manualEsLetra(c)&& manualEsVocal(c)) {
                contador++;
            }
        }
        return contador;
    }
    //Retorna true si c es vocal (ignora may/minus)

    static boolean manualEsVocal(char c){
        char min = Character.toLowerCase(c);
        return(min == 'a'||min == 'e'||min == 'i'||min == 'o'||min == 'u');
    }
    //si es letra del alfabeto

    static boolean manualEsLetra(char c){
        return((c >= 'a')&& c<='z')||((c >= 'A')&& c<='Z');
    }

    //MANUAL q cuenta el numero total de vocales en un texto

    static int manualContarVocales(String texto){
        int contador = 0;
        for (int i = 0; i < texto.length(); i++) {
            if (manualEsVocal(texto.charAt(i))) {
                contador++;
            }
        }
        return contador;
    }
    static void buscarLetraPosiciones(){
        System.out.println("BUSCAR POSICIONES");
        String palabra = "Programacion";
        char buscada='o';
        System.out.println("Palabra: "+palabra+" | Buscando "+buscada);
        System.out.println("Posiciones: ");

        int posicion = palabra.indexOf(buscada);

        while (posicion !=-1) {
            System.out.println(posicion+" ");
            posicion = palabra.indexOf(buscada, posicion +1);
        }
        System.out.println();
    }
    static void demoDividirCadena(){
        System.out.println("Dividir cadena de dos FORMAS");
        String llista = "uno,dos,tres";

        System.out.println("VERSION API .split");
        String[] partes = llista.split(",");
        for (String p : partes) {
            System.out.println(" - "+p);
        }

        System.out.println("Version MANUAL");

        String palabraActual = "";
        for (int i = 0; i < llista.length(); i++) {
            char c = llista.charAt(i);
            if (c == ',') {//fin de la palabra
                System.out.println(" - "+palabraActual);//imprimo la palabra
                palabraActual="";//resetea
            }else{
                palabraActual+=c;
            }
        }
        System.out.println(" - "+palabraActual);//la ultima palabra
    }
    static void recorrerCadenas(){
        System.out.println("RECORRER CADENAS DE DOS FORMAS");
        String palabra = "DAW";
        System.out.println("Palabra "+palabra);
        System.out.println("Forma for y un charAr(i)");
        for (int i = 0; i < palabra.length(); i++) {
            System.out.println(" POS "+i+" --> "+palabra.charAt(i));
        }
        System.out.println("Forma 2 ForEach y toCharArray");
        char [] letras = palabra.toCharArray();
        for (char c : letras) {
            System.out.println(" letra "+c);
        }
    }
    static void extraerSubstrings(){
        System.out.println("EXTRAER SUBCADENAS");
        String frase = "Aprendiendo Java en DAW.";
        System.out.println("Frase: "+frase);
        System.out.println(".substring -->"+frase.substring(12));
        System.out.println(".substring (inicio, fin)-->"+frase.substring(12));
    }
    static void busquedaTexto(){
        System.out.println("BUSQUEDA DE TEXTO");
        String frase = "Aprendiendo Java en DAW. Java es util";
        System.out.println("Frase: "+frase);
        System.out.println(".contaisn()->"+frase.contains("Java"));//TRUE FALSE
        System.out.println(".indexOF"+frase.indexOf("Java"));//-1
        System.out.println(".indexOF"+frase.lastIndexOf("Java"));//-1
    }
    static void demoInmutabilidad(){
        System.out.println("Demo INMUTABILIDAD");
        String frase = "Hola";
        System.out.println("\n String original"+frase);
        frase.toUpperCase();
        System.out.println("Despues de frase.toUpperCase"+frase+" SIGUE IGUAL ");
        //FORMA CORRECTA
        String fraseMay = frase.toUpperCase();
        System.out.println("Guardo la copia -->"+fraseMay);
    }
    static void operacionesBasicas(){
        System.out.println("Operaciones básicas");
        String texto = "Java";
        System.out.println(".lenght()"+texto.length());
        System.out.println(".charAt(0)"+texto.charAt(0));
        System.out.println("toUppercase() and toLowerCase"+texto.toUpperCase()+" y "+texto.toLowerCase());
    }
    static void diferenciasCharString(){
        System.out.println("Diferencias entre char y string");
        char letra = 'A';
        int letrA = 'A';
        String palabra = "A";

        System.out.println("Char letra = "+letra);
        System.out.println("int letraA"+letrA);
        System.out.println("String palabra"+palabra);
    }

}
