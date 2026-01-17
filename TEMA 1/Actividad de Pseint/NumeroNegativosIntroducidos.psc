Proceso NumeroNegativosIntroducidos9
	
	Definir num1,i,NumerosNegativos Como REAL;
	
	
	NumerosNegativos <- 0;
	
	Escribir "Introduce hasta 10 números";
	Leer num1;
	
	Para i <- 1 Hasta 10 Con Paso 1 Hacer
		
		Escribir "Introduce hasta 10 números, ", i, " Números introducidos";
		Leer num1;
		
		SI num1 < 0 Entonces
			NumerosNegativos <- NumerosNegativos + 1;
		FinSi
		
	Fin Para
	Escribir "Has introducido " NumerosNegativos " números negativos.";
	
FinProceso
	