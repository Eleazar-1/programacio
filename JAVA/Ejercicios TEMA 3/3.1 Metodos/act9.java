import java.util.Scanner;

public class act9 {

    static boolean validaHora(String hora) {
        if (!hora.matches("\\d{2}:\\d{2}:\\d{2}")) {
            return false;
        }
        String[] partes = hora.split(":");
        int h = Integer.parseInt(partes[0]);
        int m = Integer.parseInt(partes[1]);
        int s = Integer.parseInt(partes[2]);

        return (h >= 0 && h < 24) && (m >= 0 && m < 60) && (s >= 0 && s < 60);
    }

    static int deHoraASegundos(String hora) {
        String[] partes = hora.split(":");
        int h = Integer.parseInt(partes[0]);
        int m = Integer.parseInt(partes[1]);
        int s = Integer.parseInt(partes[2]);
        return h * 3600 + m * 60 + s;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la primera hora (HH:MM:SS): ");
        String h1 = sc.nextLine();

        System.out.print("Introduce la segunda hora (HH:MM:SS): ");
        String h2 = sc.nextLine();

        if (!validaHora(h1) || !validaHora(h2)) {
            System.out.println("Error: alguna de las horas no tiene el formato correcto.");
            sc.close();
            return;
        }

        int segundos1 = deHoraASegundos(h1);
        int segundos2 = deHoraASegundos(h2);

        int diferenciaSegundos = Math.abs(segundos1 - segundos2);
        int diferenciaMinutos = diferenciaSegundos / 60;

        System.out.println("La diferencia entre las dos horas es de " + diferenciaMinutos + " minutos.");

        sc.close();
    }
}

