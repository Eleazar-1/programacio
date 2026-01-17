public class Persona {

    String dni;
    String nombre;
    String apellidos;
    int edad;

    public Persona(){
        System.out.println("Persona por defecto. Se crea una nueva persona.");
    }

    public Persona(String dni, String nombre, String apellidos, int edad){
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    public void mostrarDatos(){
        System.out.println("El DNI es "+dni);
        System.out.println("El nombre es "+nombre);
        System.out.println("Los apellidos son: "+apellidos);
        System.out.println("La edad es: "+edad);
    }

    public int esMayor(int edad){
        if (edad > 17) {
            System.out.println("Es mayor de edad.");
        }else{
            System.out.println("Es menor de edad");
        }
        return edad;
    }
}