import java.util.Scanner;

public class joquese {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int costat = 5;

        for (int i = 0; i < costat; i++) {
            for (int j = 0; j < costat; j++) {
                if (i==0 || i==costat-1 || j==0|| j==costat-1) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        sc.close();
    }
}
