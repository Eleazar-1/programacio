Proceso MayorOIgual
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
	
	SI (num2=num1) Entonces
		Escribir "Els numeros son iguals ";
		
	SiNo
		SI (num2 > num1) Entonces
			Escribir "El numero ", num2, " Es mes major que el " num1;
		FinSi
		Escribir "El numero ", num1, " Es mes major que el " num2;
		
	FinSi
FinProceso