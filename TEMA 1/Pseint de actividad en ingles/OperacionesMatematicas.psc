Proceso OperacionesMatematicas
    Definir num1, num2, suma, resta, multiplicacion, division Como Real;
	
    Escribir "introduce el primer número:";
    Leer num1;
	
    Escribir "introduce el segundo número:";
    Leer num2;
	
    suma <- num1 + num2;
    resta <- num1 - num2;
    multiplicacion <- num1 * num2;
	
    Si num2 <> 0 Entonces
        division <- num1 / num2;
    Sino
        Escribir " No se puede dividir entre cero";
        division <- 0;
    FinSi
	
    Escribir "suma: ", suma;
    Escribir "resta: ", resta;
    Escribir "multiplicacion: ", multiplicacion;
	
    Si num2 <> 0 Entonces
        Escribir "division: ", division;
    FinSi
	
FinProceso
