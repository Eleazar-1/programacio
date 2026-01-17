Proceso SemaforoColor
	
	Definir estado Como Caracter;
	Definir rojo, i Como Entero;
	
	
	rojo <- 0;
	
	
	

	SI color = 0 Entonces
		Escribir " No se ha introducido el estado Rojo en ningún semaforo";
	SiNo
		Escribir " Se ha introducido el estado rojo", estado, " veces";
	FinSi
	
FinProceso