import java.util.Scanner;
import java.lang.Math;

public class AppLibros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Libro [] libros = new Libro[4];
        String titulo, editorial;
        int numPaginas;

        //Formas de rellenar
        libros[0] = new Libro("El juego de Ender");
        libros[0].setEditorial("Ediciones B");

        libros[1] = new Libro();

        Libro libro3= new Libro("La tabla de Flandes ", "Alfaguara", 200);

        libros[2] = libro3;

        System.out.println("Titulo del libro: ");
        titulo = sc.nextLine();
        System.out.println("Editorial de libro: ");
        editorial = sc.nextLine();
        System.out.println("Numero de paginas del libro: ");
        numPaginas = sc.nextInt();

        libros[3] = new Libro(titulo, editorial, numPaginas);

        System.out.println("Listado de libros con for:");

        for (int i = 0; i < libros.length; i++) {
            libros[i].mostrarInformacion();
        }
        
        System.out.println("Listado con foreach");
        for (Libro l : libros) {
            l.mostrarInformacion();
            System.out.println();
        }

        //Crear 3 libros aleatorios en un array de 3 libros

        System.out.println("Libros de la editorial Bruguera");
        Libro[] librosBrugera = new Libro[3];

        for (int i = 0; i < librosBrugera.length; i++) {
            librosBrugera[i] = new Libro();
            //Solicitar datos de cada libro
            System.out.println("Titulo del libro: ");
            titulo = sc.nextLine();

            librosBrugera[i].setTitulo(titulo);

            librosBrugera[i].setEditorial("Editorial Bruguera");

            librosBrugera[i].setNumpaginas((int)Math.random()*1000);
        }
        
    }
}
