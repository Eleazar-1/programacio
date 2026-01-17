public class act12 {
    public static void main(String[] args) {
        System.out.println("+-----------+----------+");
        System.out.println("| Decimal   | Carácter |");
        System.out.println("+-----------+----------+");

        for (int i = 32; i <= 126; i++) {
            System.out.printf("|%7d   |    %c     |\n", i, (char) i);
        }

        System.out.println("+-----------+----------+");
    }
}
