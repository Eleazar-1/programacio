package tienda.modelo;

public class Producto {

    /*
        Package ->> Cada paquete puede tener multiples clases y subpaquetes

        Import: Una declaración que permite usar otras clases
        
        Una clase será visible dependiendo del modificador de acceso.

        Terminolgia de visibilidad;

        Modificadores de acceso
            -public: accesible desde cualquier clase y paquete
            -private: accesible solo dentro de la misma clase
            -protected: Herencia :PROXIMOS CAPITULOS
            -default: Sin modificador accesible solo dentro del mismo paquete

        Modificadores de clase
            -public la clase es accesible desde cualquier paquete
            -default la clase es accesible SOLO dentro del mismo paquete

        Varias Clases en el mismo archivo Java 
            Solo una puede ser public y el archivo debe de tener el nombre de
            la clase publica

            Clase vecina: La que esta en el mismo paquete que otra clase

            Clase externa: En paquetes diferentes

            Para que un miembro(métodos y atributos) de una clase accesible
            desde otra clase en un paquete diferente, la clase debe ser public
            y el miembro public
    */

    private double precio;
    /*
        private
        ---> SOLO accesbile desde esta clase
        Nadie puede modificar el precio directamente
        SOLO a través de getters/setters
    */

    String nombre; //Lo de abajo en concreto es esto, que el string aunque no ponga nada no es public

    /*
        Visibilidad por defecfo. Default Sin modificador
        Solo accesible desde el mismo paquete tienda.modelo
        Visible para las clases vecinas e invisible para las clases
        Externas

        ERROR Si no pone nada será publico --> FALSO
    */

    public double color;
    /*
        Accesible desde cualquier paquete y clase
        Podemos tanto modificar como leer estre atributo
    */

    public Producto(double precio, String nombre) {
        setPrecio(precio);
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public String getNombre() {
        return nombre;
    }

    public double getColor() {
        return color;
    }

    public void setPrecio(double precio){
        if (precio > 0) {
            this.precio = precio;
        }else{
            this.precio = 1.0;
        }
    }
    /*
        Visibilidad por defecto Default
        solo lo ven las clases vecinas(mismo paquete)
    */
    void mostrarInterno(){
        System.out.println("Producto interno "+nombre);
    }

    @Override 
    public String toString(){
        return "Producto: "+nombre + " , Precio "+precio;
    }

}
