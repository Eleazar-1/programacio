Proceso DivisibleONo
	// Diseño
	//Leer numero
	//
	// 
	//
	//Mostrar el resultado
	
	Definir num1 COMO Entero;
	Definir num2 Como Entero;
	
	Escribir "Introduce el 1er número";
	Leer num1;
	Escribir "Introduce el 2o número";
	Leer num2;
	
	SI (num1 mod num2=0) Entonces
		Escribir "El número ", num1 , " es divisible per ", num2;
	SiNo
		Escribir " El número ", num1 , " No es divisible per ", num2;
	FinSi
FinProceso