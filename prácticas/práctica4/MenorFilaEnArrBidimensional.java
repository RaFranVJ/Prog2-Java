
package com.programación2.prácticas.práctica4;

import java.util.*;
import com.fran_utils.*;
import com.fran_utils.ConsolaGenerica.EntradaDatos;
import com.fran_utils.ConsolaGenerica.SalidaDatos;
import com.programación2.Ejercicio;

/** Ejercicio propio #4 */

public class MenorFilaEnArrBidimensional extends Ejercicio
{
/** ctor Base */

public MenorFilaEnArrBidimensional()
{
id = 4;
nombre = "Obtener la fila más pequeña de un Array 2D";
		        
esPropio = true;
}

@Override

public void ejecutar(Scanner lector)
{
// Leer el arreglo por teclado
Object[][] arr = EntradaDatos.leerMatriz(lector, int.class);

System.out.println("* Tu arreglo:\n");

SalidaDatos.imprimirArrComoTabla(arr, true);

System.out.println("* Fila más pequeña del arreglo:\n");

Object[] filaMenor = UtilidadArrays.obtenerFilaMasChica(arr);
SalidaDatos.imprimirArr(filaMenor, true);
}

}