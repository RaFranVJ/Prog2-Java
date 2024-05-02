
package com.programación2.prácticas.práctica4;

import java.util.*;
import com.fran_utils.ConsolaGenerica.*;

import com.programación2.Ejercicio;

/** Ejercicio propio #2 */

public class CopiarArreglo extends Ejercicio
{
/** ctor Base */

public CopiarArreglo()
{
id = 3;
nombre = "Copiar un arreglo";
		        
esPropio = true;
}

@Override

public void ejecutar(Scanner lector)
{
// Leer el arreglo por teclado
Object[] arr = EntradaDatos.leerArreglo(null, null, lector, Object.class);

// Leer la cantidad de elementos a copiar
int n = EntradaDatos.leerNumEnRango(0, arr.length, "Selecciona la cantidad de elementos a copiar", lector);

// Copiar los elementos deseados a un nuevo arreglo
Object[] arr_nuevo = Arrays.copyOf(arr, n);

System.out.println("* Arreglo original:\n");
SalidaDatos.imprimirArr(arr, false);

System.out.println("* Copia del arreglo:\n");
SalidaDatos.imprimirArr(arr_nuevo, false);
}

}