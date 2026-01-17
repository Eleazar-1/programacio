Proceso CalculoSalario
    Definir nombre Como Cadena;
    Definir horas, tarifa, salarioBruto, retencion, salarioNeto Como Real;
	
    Escribir "introduce el nombre del trabajador: ";
    Leer nombre;
	
    Escribir "introduce el número de horas trabajadas: ";
    Leer horas;
	
    Escribir "ingrese la tarifa por hora:";
    Leer tarifa;
	
    salarioBruto <- horas * tarifa;
    retencion <- salarioBruto * 0.15;
    salarioNeto <- salarioBruto - retencion;
	
    Escribir "Nombre del trabajador: ", nombre;
    Escribir "Salario bruto: ", salarioBruto;
    Escribir "Retención (15%): ", retencion;
    Escribir "Salario neto: ", salarioNeto;
FinProceso
