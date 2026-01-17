Proceso ParOImpar
	// Diseño
	//Leer numero
	//Calcular si el número es par , Si al dividir da 0
	//Si el resto es 0 el numero es Para 
	//En caso contrario es impar
	//Mostrar el resultado
	
	Definir num COMO Entero;
	
	Escribir "Introduce el numero";
	Leer num;
	
	SI (num mod 2=0) Entonces
		Escribir "El numero ", num , " es par";
	SiNo
		Escribir " El numero ", num , " No es par";
	FinSi
FinProceso
