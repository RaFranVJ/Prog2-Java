
package com.programación2.prácticas.práctica4;

import java.util.*;
import com.fran_utils.ConsolaGenerica.*;

import com.programación2.Ejercicio;

/** Ejercicio impropio #5 (10.5 del libro). */

public class VerificarIndiceDeArr extends Ejercicio
{
/** ctor Base */

public VerificarIndiceDeArr()
{
id = 5;
nombre = "Verificar índice de un arreglo";
		        
esPropio = false;
}

private int datos(Scanner lector, Double a[])
{ 
int n = EntradaDatos.leerValor(lector, "Entrada de datos, cuántos elementos: ", int.class);

if(n > a.length)
return 0;
	 
for (int i = 0; i < n; i++)
a[i] = EntradaDatos.leerValor(lector, "Ingresa un double", double.class);

return 1;
}

@Override

public void ejecutar(Scanner lector)
{
Double [] a = new Double[24];

datos(lector, a);

SalidaDatos.imprimirArr(a, true);
}

}