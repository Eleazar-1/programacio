Proceso CuantosNegativos
	
	Definir i Como Real;
	Definir contadorNegativos Como Entero;
	Definir num Como Entero;
	
	contadorNegativos <- 0;
	
	Escribir " Introduce 10 números ";
	Leer num;
	
	Para i <- 10 Hasta 20 Con Paso 1 Hacer
		Escribir " Introduce 10 números ";
		Leer num;
		
		Si num < 0 Entonces
			contadorNegativos <- contadorNegativos +1;
		FinSi
		
	Fin Para
	Escribir " Has introducido ", contadorNegativos, " números negativos ";
FinProceso
	