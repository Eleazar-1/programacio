public class Persona {

    //Clase es un molde del que se crean objetos
    /*Describe atributos(datos) y métodos(acciones o comportamiento)
        La clase se escribe una vez y se crean muchos objetos
        Cada clase debe estar en su propio archivo
        Atributos y métodos SON LOS MIEMBROS DE UNA CLASE

        CADA objeto tiene un estado

        Los atributos de cada objeto son variables de instancia

        Cada objeto tiene una copia de los atributos/metodos
     */

    //Variables de instancia

    String nombre; //atributo
    int edad;
    String cuidadDeResidencia;
    String profesion;
    String dni;

    //NO TENEMOS MAIN

    //NECESITO CONSTRUCTOR
    //public + nombreClase

    public Persona(){
        nombre = "Joan";
        edad = 40;
        cuidadDeResidencia = "Sin cuidad";
        profesion = "Sin profesión";
        dni = "Sin dni";
    }

    public Persona(String s){
        nombre = s;
        edad = 0;
        cuidadDeResidencia = "Sin cuidad";
        profesion = "Sin profesion";
        dni = "123456789";
    }
    //CONSTRUCTOR 3

    public Persona (String s, int n, String d){
        nombre = s;
        edad = 0;
        cuidadDeResidencia = "Sin cuidad";
        profesion = "Sin profesion";
        dni = "123456789";
    }

    public void establecerEdad(int e){
        if(e < 0) System.out.println("La edad no puede ser negativa");
        else edad = e;
    }

    public void mostrarDatos(){
        System.out.println("Nombre: "+nombre);
        System.out.println("DNI: "+dni);
        System.out.println("Edad: "+edad);
        System.out.println("Cuuidad: "+cuidadDeResidencia);
        System.out.println("Profesion: "+profesion);
        System.out.println("-----------------------------");
    }
}