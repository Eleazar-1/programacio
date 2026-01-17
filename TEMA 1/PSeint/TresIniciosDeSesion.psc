Proceso TresIniciosDeSesion
	
	Definir nombre Como entero;
	Definir contrasenya Como Entero;
	Definir nom Como Caracter;
	Definir password Como Caracter;
	
	nombre <- 0 ;
	contrasenya = 0 ;
	
	Escribir " Introduce tu nombre ";
	Leer nom;
	Escribir " Introduce tu contraseña ";
	Leer password;
	
	si nombre = nombre
		Escribir " El nombre es correcto ";
	FinSi
	
	si contrasenya = contrasenya
		Escribir " La contrasenya es correcta ";
	FinSi
	
	Mientras nombre <> nombre Hacer
		
	
		Para i<-2 Hasta 3 Con Paso 1 Hacer
			
			Escribir " Introduce tu nombre ";
			Leer nombre;
			Escribir " Introduce tu contraseña ";
			Leer contrasenya;
			
			
		FinPara
		Escribir "Has fallado el intento de inicio de sesión 3 veces";
	FinMientras
FinProceso
	