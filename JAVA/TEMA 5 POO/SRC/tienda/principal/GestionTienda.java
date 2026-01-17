package tienda.principal;

import tienda.modelo.Producto;
import tienda.gestion.*;
import tienda.servicios.ServicioDescuentos;

import tienda.modelo.Almacen;;

public class GestionTienda {
    public static void main(String[] args) {
        //Uso clase Producto pq es public y està importada
        Producto p1 = new Producto(30, "teclado");
        Producto p2 = new Producto(20, "Ratón");

        //Creo un carrito para la compra
        Producto [] carrito = new Producto[2];
        carrito[0] = p1;
        carrito[1] = p2;

        //Mostrar los precios del carrito
        for (int i = 0; i < carrito.length; i++) {
            System.out.println(" - "+carrito[i].getNombre());
            System.out.println(" - "+carrito[i].getPrecio());
        }

        //Puedo usar ServicioDescuentos? Sí, es public e importada
        //Aplicar descuentos a los productos
        ServicioDescuentos sd = new ServicioDescuentos();
        sd.aplicarDescuento(p1, 20);
        sd.aplicarDescuento(p2, 80);//NO VALIDO

        //Crear la factura Calculo total de la factura

        Factura f = new Factura();
        double total = f.calcularTotal(carrito, 2);


        System.out.println("Total final de la factura "+total);

        Almacen almacen = new Almacen(5);

        //Añadir productos al almacen
        almacen.integrarProducto(p2);
        almacen.integrarProducto(p1);
        almacen.integrarProducto(new Producto(150, "Monitor"));
        almacen.integrarProducto(new Producto(80, "Impresora"));
        almacen.integrarProducto(new Producto(60, "Altavoces"));

        //Mostrar los productos del almacen
        for (int i = 0; i < almacen.getTotal(); i++) {
            Producto producto = almacen.obtenerProducto(i);
            System.out.println(producto);
        }

        almacen.productes[0] = new Producto(200, "Tablet");
    }    
}
