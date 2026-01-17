Proceso CalculoTotalFactura
	//Definir variable
	//Total --> acumulador importe
	//Cantidad --> numero de unidades
	//Precio --> precio unitario cada producto
	
	Definir total, cantidad, precio Como real;
	
	total <- 0;
	
	Escribir " Cuantas unidades?: ";
	Leer cantidad;
	
	Escribir " Cuantas cuesta es producto?: ";
	Leer precio;
	
	Mientras cantidad > 0 Hacer
		
		Escribir " Cuantas cuesta es producto?: ";
		Leer precio;
		
		//Acumulo
		total <- total + precio * cantidad;
		
		Escribir " Cuantas cuesta es producto?: ";
		Leer cantidad;
	FinMientras
	
	Escribir " Cuantas cuesta es producto?: ";
	Leer total;
	
FinProceso
	