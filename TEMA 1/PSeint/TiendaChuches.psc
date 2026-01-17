Algoritmo TiendaChuches
	Definir compra Como Real;
	Definir tipo Como Caracter;
	
	Escribir " Ingrese el total de la compra: ";
	Leer  tipo;
	
	Escribir " Ingrese el total de la compra: ";
	Leer  tipo;
	
	Segun tipo hacer
		Caso 'A':
			Escribir "Precio Tipo A -> Personas normales" ;
			Escribir " El importe total es: ", (compra - (compra * 0,10));
		Caso 'B':
			Escribir "Precio Tipo A -> Personas normales" ;
			Escribir " El importe total es: ", (compra - (compra * 0,15));
		Caso 'C':
			Escribir "Precio Tipo A -> Personas normales" ;
			Escribir " El importe total es: ", (compra - (compra * 0,20));
		De Otro Modo:
			Escribir " El importe total de la compra sin descuento es: ", compra;
	FinSegun
FinAlgoritmo
