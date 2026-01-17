Proceso MayorMenor
    Definir CantidadDeNumeros, NumeroIntroducido, NumeroMaximo, NumeroMinimo, i Como Entero;
	Definir RepetidoMaximo, RepetidoMinimo Como Entero;
	
	Escribir "¿Cuántos números quieres insertar?";
    Leer CantidadDeNumeros;
	
	Escribir "Introduce el primer número:";
    Leer NumeroIntroducido;
	
	NumeroMaximo <- NumeroIntroducido;
	NumeroMinimo <- NumeroIntroducido;
	
	i <- 0;
	
	RepetidoMaximo <- 1;
	RepetidoMinimo <- 1;
	
	Para i <- 2 Hasta CantidadDeNumeros Con Paso 1 Hacer 
		
		Escribir "Introduce números enteros.";
		Leer NumeroIntroducido;
		
		SI NumeroIntroducido > NumeroMaximo Entonces
			NumeroMaximo <- NumeroIntroducido;
			RepetidoMaximo <- 1;
		SiNo
			SI NumeroIntroducido = NumeroMaximo Entonces
				RepetidoMaximo <- RepetidoMaximo + 1;
			FinSi
			
		FinSi
		
		SI NumeroIntroducido < NumeroMinimo Entonces
			NumeroMinimo <- NumeroMinimo;
			RepetidoMinimo <- 1;
		SiNo
			SI NumeroIntroducido = NumeroMinimo Entonces
				RepetidoMinimo <- RepetidoMinimo + 1;
			FinSi
		FinSi
		
	FinPara
	
    Escribir "El número mayor es: ",NumeroMaximo , " y aparece ", RepetidoMaximo, " veces.";
    Escribir "El número menor es: ", NumeroMinimo, " y aparece ", RepetidoMinimo, " veces.";
FinProceso
