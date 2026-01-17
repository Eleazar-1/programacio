Algoritmo PuntosHasta0
	
	//Leer numeros hasta que sea un 0
	
	Definir puntuacion, total Como real;
	
	total <- 0;
	
	Escribir " Introduce la puntuación ";
	Leer puntuacion;
	
	Mientras puntuacion <> 0 Hacer
		
		si puntuacion   >= 2000 y puntuacion <= 3000 Entonces
			total <- total + puntuacion * 0.3;
		SiNo
			total <- total + puntuacion * 0.2;
		FinSi
		Escribir  " Introduce la puntuacion ";
		Leer puntuacion;
	FinMientras
	
	Escribir " La puntuacion total es ", total;
FinAlgoritmo
