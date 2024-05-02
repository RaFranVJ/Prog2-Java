
package com.programación2.prácticas.práctica5.ejercicios;

import java.util.Scanner;

import com.programación2.Ejercicio;
import com.programación2.prácticas.práctica5.clases.numerico.*;



/** Ejercicio impropio #5 (8.5 del libro). */

public class AmbiguedadEntreClases extends Ejercicio
{
/** ctor Base */

public AmbiguedadEntreClases()
{
id = 5;
nombre = "Ambiguedad entre dos clases con el mismo nombre";
		        
esPropio = false;
}

@Override

public void ejecutar(Scanner lector)
{
Random miNum = new Random();

java.util.Random aleatorio = new java.util.Random();

System.out.printf(" 'miNum' es del tipo: %s\n", miNum.getClass().getTypeName() );
System.out.printf(" 'aleatorio' es del tipo: %s\n", aleatorio.getClass().getTypeName() ); 
}

}