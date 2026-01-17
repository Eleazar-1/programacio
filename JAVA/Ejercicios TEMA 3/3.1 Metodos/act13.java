import java.util.Scanner;

public class act13 {

    static String[] dias = {"Lunes","Martes","Miércoles","Jueves","Viernes","Sábado","Domingo"};

    static boolean validaFecha(String diaDeLaSemana, int h, int m, int s) {
        boolean diaValido = false;
        for (String d : dias) {
            if (d.equalsIgnoreCase(diaDeLaSemana)) {
                diaValido = true;
                break;
            }
        }
        return diaValido && (h >= 0 && h < 24) && (m >= 0 && m < 60) && (s >= 0 && s < 60);
    }

    static int deFechaASegundos(String diaDeLaSemana, int h, int m, int s) {
        int diaNum = 0;
        for (int i = 0; i < dias.length; i++) {
            if (dias[i].equalsIgnoreCase(diaDeLaSemana)) {
                diaNum = i;
                break;
            }
        }
        return diaNum * 24 * 3600 + h * 3600 + m * 60 + s;
    }

    static void deSegundosAFecha(int s) {
        int diaNum = s / (24 * 3600);
        int restoDia = s % (24 * 3600);

        int h = restoDia / 3600;
        int restoHora = restoDia % 3600;

        int m = restoHora / 60;
        int seg = restoHora % 60;

        System.out.println(dias[diaNum] + " " + h + " " + m + " " + seg);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String dia;
        int h, m, s;

        do {
            System.out.println("Introduce el día de la semana: ");
            dia = sc.next();
            System.out.println("Introduce la hora: ");
            h = sc.nextInt();
            System.out.println("Introduce los minutos: ");
            m = sc.nextInt();
            System.out.println("Introduce los segundos: ");
            s = sc.nextInt();
        } while (!validaFecha(dia, h, m, s));

        int segundos = deFechaASegundos(dia, h, m, s);

        for (int i = 1; i <= 100; i++) {
            deSegundosAFecha(segundos + i);
        }

        sc.close();
    }
}
