Proceso  SumaNumerosPositivos
    Definir num, suma Como Entero;
    Definir cadena Como Cadena;
    
    suma <- 0;
    cadena <- "";
    
    Escribir "introduce numeros enteros (termina con un número <= 0):";
    Leer num;
    
    Mientras num > 0 Hacer
        suma <- suma + num;
        
        Si cadena = "" Entonces
            cadena <- ConvertirATexto(num);
        SiNo
            cadena <- cadena + "+" + ConvertirATexto(num);
        FinSi
        
        Leer num;
    FinMientras
    
    Escribir cadena, " = ", suma;
FinProceso

