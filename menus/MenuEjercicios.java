package com.programación2.menus;

import com.fran_utils.*;
import com.programación2.Ejercicio;

/** Menú usado para seleccionar ejercicios. */

public class MenuEjercicios extends MenuGenerico<Ejercicio>
{
/** Muestra el ejercicio actual seleccionado.
@param elemento El ejercicio a mostrar. */
	
@Override

public void mostrarElemento(Ejercicio elemento)
{
System.out.printf("%d. %s\n", elemento.id, elemento.nombre);
}

}