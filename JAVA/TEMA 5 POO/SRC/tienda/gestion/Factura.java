package tienda.gestion;

//Se importan las clases no los paquetes

import tienda.modelo.Producto;
//importa la clase producto pq es public
//Solo voy a poder usar los miembros publics.

//import tienda.modelo.Almacen;


//Clase publica
//Está en otro paquete
//Es una clase EXTERNA del paquete modelo

public class Factura {
    
    //Calcular el precio total de varios productos
    //Que necesito para generar la factura?
        //Conocer los productos y los precios

    public double calcularTotal(Producto [] productos, int cantidad){

        double total = 0;

        for (int i = 0; i < cantidad; i++) {
            //Permitido. Método es public
            total += productos[i].getPrecio();

            //suma el precio a traves del metodo publico getPrecio

            //System.out.println(productos[i].nombre);
            //visibilitat es Default. Nombre no es public 

            //No PERMITIDO. es private
            //total+= productos[i].precio;
        }
        return total;
    }

}
