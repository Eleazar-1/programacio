Proceso AyBCalcularCAxB
	// Diseño
	//Leer numero
	//
	// 
	//
	//Mostrar el resultado
	
	Definir num1, num2, producto, contador COMO Entero;
	
	Escribir "Introduce dos números ";
	Leer num1, num2;
	producto <- 0;
	contador <- 0;
	
	Mientras (contador < num2) Hacer
		producto <- producto + num1;
		contador <- contador + 1;
		
	FinMientras
	
	Escribir (num1 + "*" + num2+"=");
	
	
	
FinProceso