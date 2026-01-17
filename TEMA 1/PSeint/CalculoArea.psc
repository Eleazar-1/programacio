// Calcular area de un rectangulo

// Analsis

// Problema -- Calcular el area del rectangulo a partir de la base y la altura
// Datos de entrada base, altura (entero)
// Inforamcion de salida : area (entero)

// Variables base, altura, area --> Entero --> Declarativo

// Diseño

// 1 Leer base y altura
// 2 Calcular area = base * altura
// Mostrar el resultado

Proceso CalculoArea
	Definir base COMO Entero;
	Definir altura Como Entero;
	Definir area Como Entero;
	
	Escribir "Introduce la base";
	Leer base;
	Escribir "Introduce la altura";
	Leer altura;
	
	area <- base * altura;
	Escribir "El area del rectangulo es ", area;
FinProceso