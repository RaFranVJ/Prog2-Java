
package com.programación2.prácticas.práctica4;

import java.util.*;
import com.fran_utils.ConsolaGenerica.*;

import com.programación2.Ejercicio;

/** Ejercicio impropio #8 (10.8 del libro). */

public class Libro extends Ejercicio
{
/** ctor Base */

public Libro()
{
id = 8;
nombre = "Libro de caracteres";

esPropio = false;
}

@Override
	
public void ejecutar(Scanner lector)
{
final int PAGINAS = 500;
final int LINEAS = 45;
final int COLUMNAS = 80;

char libro[][][] = new char[PAGINAS][LINEAS][COLUMNAS];
SalidaDatos.imprimirArrComoTabla(libro, esPropio);
}

}