Algoritmo CalculaSumaPares
	
	Definir contador, suma Como Entero;
	contador <- 2;
	suma <- 0;
	
	Mientras  (contador <= 10) Hacer
		SI (contador %2 == 0) Entonces
			suma <- suma + contador;
			
		FinSi
		contador <- contador +1;
	FinMientras
	
	
	Escribir " La suma de los pares del 1 al 10 es ", suma;
	
	Definir contador2, suma2 Como Entero;
	contador2 <- 2;
	suma2 <- 0;
	
	Para contador2 <- 0 Hasta 10 Con Paso  2 Hacer
		suma2 <- suma2 + contador2;
	FinPara
	Escribir  " La suma con PARA de los pares es :", suma2;
FinAlgoritmo

