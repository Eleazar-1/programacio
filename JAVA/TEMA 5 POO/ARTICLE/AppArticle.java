public class AppArticle {
    public static void main(String[] args) {
        //Crear articles
        Article articulo1 = new Article();
        Article articulo2 = new Article();

        Article articulo3 = new Article("003", "Black Mirror", "Streaming", 10);
        Article articulo4 = new Article("004", null, "Streaming", 10);
    
        //Asignar valor directament als atributs
        articulo1.gerCod();
        articulo1.setCod("00005");;
        articulo1.formato = "DVD";
        articulo1.precioAlquiler = 2.50;

        articulo2.cod = "002";
        articulo2.titulo = null;
        articulo2.formato = "DVD";
        articulo2.precioAlquiler = 3;

        //Utilizar métodos

        System.out.println("Alquiler Art "+articulo1.cod+" 1 día: "+articulo1.precio1());

        System.out.println("Alquiler Art "+articulo1.cod+" 2 día: "+articulo1.precio2());

        System.out.println("Alquiler Art "+articulo1.cod+" 5 día: "+articulo1.precioSemana());

        articulo1.mostrarArticulo();
        articulo2.mostrarArticulo();
        articulo3.mostrarArticulo();
        articulo4.mostrarArticulo();

        //Metodo estatico
        Article.mostrarContador();

        articulo1.mostrarContadorObjetos();
        articulo2.mostrarContadorObjetos();
        articulo3.mostrarContadorObjetos();
        articulo4.mostrarContadorObjetos();
        
    }
}
