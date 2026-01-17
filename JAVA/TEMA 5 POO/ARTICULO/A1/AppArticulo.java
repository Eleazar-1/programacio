package A1;

public class AppArticulo {
    public static void main(String[] args) {
        Articulo a1 = new Articulo();
        a1.nombre = "camisa de cuadros";
        a1.precio = 20;
        a1.iva = 21;
        a1.cuantosQuedan = 5;

        System.out.println(a1.nombre + " -Precio: "+a1.precio+" €"+a1.iva+" % -PVP "+(a1.precio + (a1.precio*a1.iva/100))+" €");

        //Articulo a2 = new Articulo("Pantalon de pana", 100, 10, -5);
    }
}
