package tienda.servicios;

import tienda.modelo.Producto;

//Clase publica 
//Paquete distinto a modelo y gestion
//Solo podré usar miembros PUBLIC de producto

public class ServicioDescuentos {

    /*
        Aplica descuento a un producto en un porcentaje entre 0 y 50

        Para aplicar el descuento necesito
            Conocer el producto
            Conocer el % del descuento

    */

            public void aplicarDescuento(Producto producto, double porcentaje){
                //Comprobamos que el producto no es nulo

                if (producto == null) {
                    return;
                }

                //Aplicar descuento SOLO si es válido entre 0 y 50

                if (porcentaje < 0 || porcentaje > 50) {
                    System.out.println("Descuento no válido");
                    return;
                }

                //Obtener el precio actual de producto que le paso como parametro

                double precioActual = producto.getPrecio();

                //Calcular el nuevo con el descuento aplicado

                double nuevoPrecio = precioActual *(1-porcentaje/100);

                //Actualizar el precio de producto con el nuevo precio con descuento del producto

                producto.setPrecio(nuevoPrecio);

                //NO PERMITIDO
                //producto.precio
                //producto.nombre uno porque es private y el otro porque es default
            }
}
