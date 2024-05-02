/**
 * 
 */
package com.programación2.prácticas.práctica3;

import java.util.Scanner;

import com.programación2.Ejercicio;

/** Ejercicio impropio #7 (6.7 del libro) */

public class SumaPares extends Ejercicio {

/** Crea una nueva instancia de 'SumaPares' */

public SumaPares()
{
id = 7;
nombre = "Suma de números pares";

esPropio = false;
}

/** Muestra la suma de los números pares que hay hasta 12. */

@Override
	
public void ejecutar(Scanner lector)
{
final int M = 12;

int suma = 0;
	
for(int n = 2; n <= 2*M; n += 2)
suma += n;

System.out.printf("La suma de los %d primeros números pares: %d\n", M, suma);
}

}