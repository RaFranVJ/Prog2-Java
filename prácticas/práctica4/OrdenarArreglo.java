
package com.programación2.prácticas.práctica4;

import java.util.*;
import com.fran_utils.ConsolaGenerica.*;

import com.programación2.Ejercicio;

/** Ejercicio propio #1 */

public class OrdenarArreglo extends Ejercicio
{
/** ctor Base */

public OrdenarArreglo()
{
id = 2;
nombre = "Ordenar un arreglo";
		        
esPropio = true;
}

@Override

public void ejecutar(Scanner lector)
{
Integer[] numeros = { 100, 50, 25, 175, 200, 150 };

System.out.println("* Arreglo desordenado:\n");
SalidaDatos.imprimirArr(numeros, false);

Arrays.sort(numeros);

System.out.println("* Arreglo ordenado:\n");
SalidaDatos.imprimirArr(numeros, false);
}

}