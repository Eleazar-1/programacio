Proceso CalculoMetros
	Definir millas COMO Entero;
	Definir metros Como Entero;
	
	Escribir "Introduce las millas";
	Leer millas;
	
	metros <- millas * 1852 ;
	Escribir millas, " Millas son " , metros, " metros ";
FinProceso
