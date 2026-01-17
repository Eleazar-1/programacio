Algoritmo CalcularProductoCincoNumeros
	
	Definir num, producto, contador Como Entero;
	producto <- 1;
	
	Para contador <- 1 Hasta 5 Con Paso 1 Hacer
		Leer num;
		producto <- producto * num;
		Escribir " Muestrame el valor de producto ", producto, " y el valor de contador ", contador ;
	FinPara
	
	Escribir " El producto de los 5 numeros es ", producto;
FinAlgoritmo
