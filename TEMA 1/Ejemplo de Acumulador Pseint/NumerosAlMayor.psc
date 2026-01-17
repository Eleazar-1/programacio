Proceso NumerosAlMayor
	
	Definir num Como Entero;
	
	contadorNegativos <- 0;
	
	Escribir " Introduce 10 números ";
	Leer num;
	
	max <- num;
	
	Para i<-2 Hasta 10 Con Paso 1 Hacer
		Escribir " Introduce un número ", i, ":";
		Leer num;
		
		SI num > max Entonces
			max <- num;
		FinSi
		
	FinPara
	Escribir  " El valor máximo introducido es: ", max;
FinProceso
