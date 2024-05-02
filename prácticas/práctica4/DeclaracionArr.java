
package com.programación2.prácticas.práctica4;

import java.util.Scanner;

import com.fran_utils.ConsolaGenerica.SalidaDatos;
import com.programación2.Ejercicio;

/** Ejercicio impropio #1 (10.1 del libro). */

public class DeclaracionArr extends Ejercicio
{
/** ctor Base */

public DeclaracionArr()
{
id = 1;
nombre = "Declaración de arreglo tipo double";
		        
esPropio = false;
}

@Override
	
public void ejecutar(Scanner lector)
{
Double[] a = { 25.1, 34.2, 5.25, 7.45, 6.09, 7.54 };
SalidaDatos.imprimirArr(a, true);
}

}