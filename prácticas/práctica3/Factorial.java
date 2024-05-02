package com.programación2.prácticas.práctica3;

import com.fran_utils.ConsolaGenerica.EntradaDatos;
import com.programación2.Ejercicio;

import java.util.Scanner;

/** Ejercicio impropio #15 (6.15 del libro). */

public class Factorial extends Ejercicio
{
// ctor
    
public Factorial()
{
id = 15;
nombre = "Factorial de un número usando bucle for";

esPropio = false;
}

/** Calcula el factorial de un número dado. */

@Override
    
public void ejecutar(Scanner lector)
{
int num = EntradaDatos.leerNumEnRango(2, 20, "Ingresa un número", lector);
long fact = calcularFactorial(num);

System.out.printf("!%d = %d\n", num, fact);
}

/** Calcula el factorial del número ingresado por el usuario.
@return El factorial calculado. */

private long calcularFactorial(int numero)
{

if (numero < 0)
throw new IllegalArgumentException("El número debe ser positivo.");
        
long resultado = 1;

for(int i = 1; i <= numero; i++) 
{

if(i == numero)
System.out.printf("%d\n", i);

else
System.out.printf("%d x ", i);
	
resultado *= i;
}

return resultado;
}

}
