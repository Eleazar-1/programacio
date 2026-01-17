public class AppPunto {
    public static void main(String[] args) {
        Punto p1 = new Punto(5, 0);
        Punto p2 = new Punto(10, 10);
        Punto p3 = new Punto(-3, 7);

        p1.mostrarInfo();
        p2.mostrarInfo();
        p3.mostrarInfo();

        //p1.x = 10;
        //p1.setX(10);
        //p1.mostrarInfo();

        //Modificar coordenadas
        p1.x += 5;
        p1.x *=6;

        p2.x *=4;
        p2.y -= 5;

        p3.x *=6;
        p3.y -= 8;
        System.out.println("=============================");
        //System.out.println(p1.getX());
        p1.mostrarInfo();
        p2.mostrarInfo();
        p3.mostrarInfo();
    }
}
