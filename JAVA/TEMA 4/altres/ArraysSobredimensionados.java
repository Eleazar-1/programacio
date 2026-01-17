import java.util.Scanner;

public class ArraysSobredimensionados {
    public static void main(String[] args) {
       //El tamaño del array. El tamaño físico CAPACIDAD
       //CANTIDAD: el tamaño logico. Cuantos huecos son validos
       
       
       final int CAPACIDAD= 3;//INMUTABLE Y NO MODIFICABLE

       Scanner sc = new Scanner(System.in);
       
       int cantidad = 0; //casillas ocupadas
       int posicionABorrar;

       String nombreUsuario;

       String[] nombres = new String[CAPACIDAD];

       System.out.println("Escribe hasta "+CAPACIDAD+"nombres: ");

       for (int i = 0; i < CAPACIDAD; i++) {
            System.out.println("Introduce un nombre: ");
            nombreUsuario = sc.nextLine();
            //Verificar q aun tenemos espacio disponible en array
            if (cantidad < CAPACIDAD) {
                nombres[cantidad]=nombreUsuario;
                cantidad++;
            }
        }
        System.out.println("Nombres almacenados: ");
            for (int j = 0; j < cantidad; j++) {
                System.out.println((j+1)+"."+nombres[j]);
            }
        
            //BORRAR POSICION
            //SERÁ ENTRE EL NUMERO 1 Y LA CANTIDAD E ELEMENTOS QUE TENIM
            //PARA RELLENAR EL HUECO, DESPLAZAMOS HACIA LA IZQ TODOS LOS ELEMENTOS DESDE LA POSICION INDICADA

            System.out.println("\n Elige una posicion a borrar (1- )"+cantidad+"):");

            //Validar el usuario introduce un numero valido

            while (!sc.hasNext()) {
                System.out.println("Por favor, introduce un número válido: ");
                sc.next();
            }

            posicionABorrar= sc.nextInt();
            sc.next();//Limpiar salto de lineas del buffer

            posicionABorrar--;

            if (posicionABorrar>=0 && posicionABorrar < cantidad) {
                for (int i = posicionABorrar; i < cantidad-1; i++) {
                    nombres[i] = nombres[i+1];
                }
                nombres[cantidad -1]= null;
                cantidad--;
                System.out.println("Nombre borrado correctamente");
            }else{
                System.out.println("Posicion incorrecta, no se ha borrado ningun elemento");
            }

            System.out.println("\n NOmbres almacenados después del borrado: ");
            for (int i = 0; i < cantidad; i++) {
                System.out.println((i+1)+"."+nombres[i]);
            }
       sc.close();
    }

}
