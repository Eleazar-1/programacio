import java.util.Scanner;

public class act6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] todos = new int[5];

        System.out.println("Introduce 5 numeros: ");

        for (int i = 0; i < todos.length; i++) {
            System.out.println("Numero "+(i+1)+": ");
            todos[i] = sc.nextInt();
        }

        System.out.println("Los numeros en orden inverso son: ");
        
        for (int i = todos.length -1; i >=0; i--) {
            System.out.println(todos[i]);
        }
        sc.close();
    }
}
