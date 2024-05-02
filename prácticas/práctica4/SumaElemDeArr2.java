
package com.programación2.prácticas.práctica4;

import java.util.*;

import com.programación2.Ejercicio;

/** Ejercicio impropio #9 (10.9 del libro). */

public class SumaElemDeArr2 extends Ejercicio
{
/** ctor Base */

public SumaElemDeArr2()
{
id = 9;
nombre = "Sumar elementos de un Array usando longitud específica";
		        
esPropio = false;
}

private int sumaDeEnteros(int[]arregloEnteros, int n)
{
int i, s;

for(i = s = 0; i < n; )
s += arregloEnteros[i++];
	 
return s;
}

@Override

public void ejecutar(Scanner lector)
{
int [] lista = new int[33];
System.out.printf("Cantidad de elementos: %d\n", lista.length);

int n = 10;
System.out.printf("Longitud específica: %d\n", n);

int s = sumaDeEnteros(lista, n);
System.out.printf("Suma de enteros en el Array: %d\n", s); 
}

}