Proceso PotenciaDeNumero
	// Diseño
	//Leer numero
	//
	// 
	//
	//Mostrar el resultado
	
	Definir base, exponente, contador, potencia COMO Entero;
	Leer base;
	Leer exponente;
	
	potencia <- 1;
	contador <- 1;
		
	Mientras (contador < exponente) Hacer
			potencia <- potencia * base;
			contador <- contador + 1;
			
	FinMientras
	
	Escribir "Introduce la base";
	Leer num1;
	Escribir "Introduce la potencia";
	Leer num2;
	
	
FinProceso