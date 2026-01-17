Proceso ConvertirTiempo
    Definir tiempoTotal, dias, horas, minutos Como Entero;
	
    Escribir "ingrese el tiempo en minutos: ";
    Leer tiempoTotal;
	
    dias <- trunc(tiempoTotal / 1440);         // 1440 minutos en un día
    horas <- trunc((tiempoTotal MOD 1440) / 60);
    minutos <- tiempoTotal MOD 60;
	
    Escribir "equivalente: ";
    Escribir dias, " dia(s)" ;
    Escribir horas, " hora(s)" ;
    Escribir minutos, " minuto(s)" ;
FinProceso
