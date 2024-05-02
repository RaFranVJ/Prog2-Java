package com.programación2.prácticas.práctica3.ejs_bucle_for;

import java.util.Scanner;

import com.fran_utils.ConsolaGenerica.EntradaDatos;
import com.programación2.Ejercicio;

/** Ejercicio propio #3 usando el bucle for. */

public class SumaNatural extends Ejercicio
{
/** Ctor base */

public SumaNatural()
{
id = 3;
nombre = "Suma de números naturales";
	        
esPropio = true;
}

@Override

/** Muestra una suma consecutiva de números naturales. */
	
public void ejecutar(Scanner lector)
{
int maxSumando = EntradaDatos.leerNumEnRango(2, 20, "Ingresa un número natural", lector);
int suma = 0;

System.out.printf("Calculando suma de %d...\n\n", maxSumando);

for(int i = 1; i <= maxSumando; i++) 
{
int suma_anterior = suma;
suma += i;

if(i == maxSumando)
System.out.printf("[ %d + %d = %d ]\n\n", i, suma_anterior, suma);

else
System.out.printf("%d + %d = %d\n", i, suma_anterior, suma);

}

System.out.printf("Resultado: %d\n", suma);
}

}