public class act6 {
    public static void main(String[] args) {
        String p1 = "amor";   // a < m < o < r → ordenada
        String p2 = "roma";   // r > o → no ordenada

        System.out.println(p1 + " → " + estaOrdenada(p1)); // true
        System.out.println(p2 + " → " + estaOrdenada(p2)); // false
    }
    public static boolean estaOrdenada(String palabra) {
        for (int i = 0; i < palabra.length() - 1; i++) {
            if (palabra.charAt(i) > palabra.charAt(i + 1)) {
                return false; // trobem una lletra fora d'ordre
            }
        }
        return true; // totes les lletres estan en ordre
    }
}
