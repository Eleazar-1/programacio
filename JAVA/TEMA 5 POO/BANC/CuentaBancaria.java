public class CuentaBancaria {

    //Miembros de la clase

    //Atributos. Definen el estado del objeto

    int id;
    double saldo;
    String tipo; //Tipo de cuenta
    Persona propietario;

    //Constructor

    public CuentaBancaria(int num, Persona p){
        id = num; //Assigna el numero de cuenta al identificador
        propietario = p;
        saldo = 0;
        tipo = "Corriente";
    }

    public void verSaldo(){
        System.out.println("El saldo de la cuenta es: "+id+" es "+saldo+"€");
    }

    public void ingresar(double n){
        saldo+=n;
    }

    public void retirar (double n){
        if (saldo >= n) {
            saldo -= n;//Reduzco el saldo si hay suficiente saldo
        }else{
            System.out.println("ERROR, no hay suficiente saldo.");
        }
    }

    public void mostrarDatos(){
        System.out.println("----El propietario es----");
        propietario.mostrarDatos();
        verSaldo();
        System.out.println("-------------------------");
    }
}