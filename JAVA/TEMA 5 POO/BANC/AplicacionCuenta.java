public class AplicacionCuenta {
    public static void main(String[] args) {
    Persona p1 = new Persona("Pepe", 0, "20202020A");
    Persona p2 = new Persona("Marta", 25, "30303003A");

    CuentaBancaria cuenta1 = new CuentaBancaria(1, p1);
    CuentaBancaria cuenta2 = new CuentaBancaria(1, p2);

    cuenta1.mostrarDatos();

    cuenta1.ingresar(100);
    cuenta2.ingresar(200);
    }
   
}
