/**
 * 
 */
package com.programación2.prácticas.práctica3;

import java.util.Scanner;

import com.fran_utils.ConsolaGenerica.EntradaDatos;
import com.programación2.Ejercicio;

/** Ejercicio impropio #6 (6.6 del libro) */

public class ValoresFuncion extends Ejercicio
{
/** Crea una nueva instancia de 'ValoresFuncion' */

public ValoresFuncion()
{
id = 6;
nombre = "Valores de una función";

esPropio = false;
}

/** Muestra diferentes valores obtenidos al evaluar una función. */

@Override
	
public void ejecutar(Scanner lector)
{
final int VECES = 15;

for(int i = 1; i <= VECES; i++)
{
double x = EntradaDatos.leerValor(lector, "Digita el número clave", int.class);

double f = Math.exp(2* x) - x;
System.out.printf("f(%d) = %df\n", x, f);
}

}

}