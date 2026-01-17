Proceso IntercambiarValores
    Definir A, B, aux Como Real;
	
    Escribir "introduce el valor de A: ";
    Leer A;
	
    Escribir "introduce el valor de B: ";
    Leer B;
	
    aux <- A;
    A <- B;
    B <- aux;
	
    Escribir "después del intercambio: ";
    Escribir "A = ", A;
    Escribir "B = ", B;
FinProceso
