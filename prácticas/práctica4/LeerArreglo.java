
package com.programación2.prácticas.práctica4;

import java.util.*;
import com.fran_utils.ConsolaGenerica.*;

import com.programación2.Ejercicio;

/** Ejercicio propio #1 */

public class LeerArreglo extends Ejercicio
{
/** ctor Base */

public LeerArreglo()
{
id = 1;
nombre = "Leer un arreglo";
		        
esPropio = true;
}

@Override

public void ejecutar(Scanner lector)
{
// Leer el arreglo por teclado
Object[] arr = EntradaDatos.leerArreglo(null, null, lector, String.class);

System.out.println("* Tu arreglo:\n");

SalidaDatos.imprimirArr(arr, true);
}

}