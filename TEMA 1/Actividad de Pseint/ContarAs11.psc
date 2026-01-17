Proceso ContarAs11
    Definir algo Como Caracter;
    Definir contador Como Entero;
	Definir z Como Entero;;
    
	contador <- 0;
	
    Escribir "Introduce caracteres (termina con z):";
	Leer algo;
	
    Mientras algo <> "z" Y algo <> "Z" Hacer
		Escribir "Introduce caracteres (termina con z):";
		Leer algo;
		si algo = "A" O algo = "a" Entonces
			contador <- contador + 1;
			
		FinSi
	Fin Mientras
	
Escribir "Número de A introducidas: ", contador;
FinProceso
