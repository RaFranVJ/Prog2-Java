
package com.programación2.prácticas.práctica4;

import java.util.*;

import com.programación2.Ejercicio;

/** Ejercicio impropio #4 (10.4 del libro). */

public class SumaElemDeArr extends Ejercicio
{
/** ctor Base */

public SumaElemDeArr()
{
id = 4;
nombre = "Sumar elementos de un Array usando su longitud";
		        
esPropio = false;
}

private double suma(double [] w)
{
double s = 0.0;

for (int i = 0; i < w.length; i++)
s += w[i];

return s;
}

@Override

public void ejecutar(Scanner lector)
{
double [] v = new double[15];

System.out.printf("Cantidad de elementos: %d\n", v.length);

double s = suma(v);

System.out.printf("Sumatorio de elementos: %f\n", s); 
}

}