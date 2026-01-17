Proceso CalculoPrecio
	Definir precio COMO REAL;
	Definir porcentaje Como REAL;
	
	Escribir "Introduce el precio";
	Leer precio;
	
	Escribir "Introduce el descuento";
	Leer porcentaje;
	
	precio <- precio - (precio * porcentaje / 100) ;
	Escribir "El precio con el descuento es " precio;
FinProceso