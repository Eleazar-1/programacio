package tienda.modelo;

/*

    Clase SIN public
    Visibilidad por defecto
    Solo visible dentro del paquete tienda.modelo
    Clase Vecina de Producto

*/
public class Almacen {
    
    //Atributos. Variables de instancia. Los miembros de la clase
    public Producto[] productes;
    private Producto[] productos; //Array de productos almacenados
    //Conoce productos. Perque esta en el mismo paquete

    private int total;

    public Almacen(int capacidad){
        this.productos = new Producto[capacidad];
        total = 0;
    }

    public void integrarProducto(Producto p){
        if (total < productos.length) {
            productos[total] = p;
            total++;
        }
    }

    public Producto obtenerProducto(int posicion){
        if (posicion >= 0 && posicion < total) {
            return productos[posicion];
        }
        return null;
    }

    public int getTotal(){
        return total;
    }
    /*
        Visibilidad por defecto
        Solo clase del paquete modelo
    */
    void revisarProducto(int i){
        Producto p = productos[i];

        //Permitido (mismo paquete) NO es private. Es default
        System.out.println(p.nombre);

        //Permitido metodo default
        p.mostrarInterno();

        //No es permitido. Es private
        //p.precio;
    }
}
