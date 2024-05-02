/**
 * 
 */
package com.programación2.prácticas.práctica3;

import java.util.Scanner;

import com.programación2.Ejercicio;

/** Ejercicio impropio #17 (6.17 del libro). */

public class BuclesAnidados extends Ejercicio {

/** Ctor base */

public BuclesAnidados()
{
id = 17;
nombre = "Control de bucles anidados";

esPropio = false;
}

@Override
	
public void ejecutar(Scanner lector)
{
System.out.println("\n\t\t i \t j"); //cabecera de salida

for(int i = 0; i < 4; i++)
{
System.out.println("Externo\t " + i);

for (int j = 0; j < i; j++)
System.out.println("Interno\t\t " + j);

} // fin del bucle externo

}

}