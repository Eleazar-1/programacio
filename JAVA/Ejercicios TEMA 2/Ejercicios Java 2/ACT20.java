public class ACT20 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Introdueix un número real: ");
        double numero = scanner.nextDouble();

        double raiz = java.lang.Math.sqrt(numero);

        System.out.println("La arrel cuadrada " + numero + " es: " + raiz);
    }
}
