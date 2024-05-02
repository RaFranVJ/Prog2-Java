
package com.programación2.prácticas.práctica4;

import java.util.*;
import com.fran_utils.*;
import com.fran_utils.ConsolaGenerica.EntradaDatos;
import com.fran_utils.ConsolaGenerica.SalidaDatos;
import com.programación2.Ejercicio;

/** Ejercicio propio #5 */

public class MayorFilaEnArrBidimensional extends Ejercicio
{
/** ctor Base */

public MayorFilaEnArrBidimensional()
{
id = 5;
nombre = "Obtener la fila más grande de un Array 2D";
		        
esPropio = true;
}

@Override

public void ejecutar(Scanner lector)
{
// Leer el arreglo por teclado
Object[][] arr = EntradaDatos.leerMatriz(lector, float.class);

System.out.println("* Tu arreglo:\n");

SalidaDatos.imprimirArrComoTabla(arr, false);

System.out.println("* Fila más grande del arreglo:\n");

Object[] filaMayor = UtilidadArrays.obtenerFilaMasGrande(arr);
SalidaDatos.imprimirArr(filaMayor, false);
}

}