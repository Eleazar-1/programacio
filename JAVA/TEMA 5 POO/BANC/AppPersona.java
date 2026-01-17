public class AppPersona {
    public static void main(String[] args) {
        Persona p1 = new Persona();

        p1.mostrarDatos();

        p1.nombre = "Pablo";
        p1.dni = "2108600F";
        p1.cuidadDeResidencia = "Valencia";
        p1.profesion = "Programador Malo";
        p1.mostrarDatos();

        Persona p2 = new Persona();
        p2.mostrarDatos();

        Persona p3 = p2;
        p3.mostrarDatos();

        Persona p4 = new Persona("MariaJosé");
        p4.mostrarDatos();

        Persona p5 = new Persona("arnau", 30, "123456");

        p5.mostrarDatos();

        System.out.println(p5.cuidadDeResidencia);
    }
}
