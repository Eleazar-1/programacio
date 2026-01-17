Proceso ImparesCuatro10
	Definir num1, i, impares, ContadorImpares Como Entero;
	
	Escribir "Introduce hasta 4 impares ";
	Leer impares;
	ContadorImpares <- 0;
	
	Para i <- 2 Hasta 4 Con Paso 1 Hacer 
		Escribir "Introduce hasta 4 impares ";
		Leer impares;
		SI (impares %2 <> 0) Entonces
			ContadorImpares <- ContadorImpares + 1;
		SiNo
			Escribir "No és un número impar ";
		FinSi
	FinPara
	Escribir "Ya has introducido 4 números impares. ";
FinProceso
	