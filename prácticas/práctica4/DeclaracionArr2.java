
package com.programación2.prácticas.práctica4;

import java.util.Scanner;

import com.fran_utils.ConsolaGenerica.EntradaDatos;
import com.fran_utils.ConsolaGenerica.SalidaDatos;
import com.programación2.Ejercicio;

/** Ejercicio impropio #2 (10.2 del libro). */

public class DeclaracionArr2 extends Ejercicio
{
/** ctor Base */

public DeclaracionArr2()
{
id = 2;
nombre = "Declaración de arreglos de diferentes tipos";
		        
esPropio = false;
}

@Override
	
public void ejecutar(Scanner lector)
{
final int N = 20;

Integer[] a = new Integer[N/2];

System.out.println("* Arreglo \"a\": \n");

SalidaDatos.imprimirArr(a, false);

Float [] vector = new Float[N];
vector[2] = EntradaDatos.leerValor(lector, "Ingresa un float", float.class);

System.out.println("* Arreglo \"vector\": \n");

SalidaDatos.imprimirArr(vector, false);
}

}