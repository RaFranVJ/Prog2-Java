package com.programación2.menus;

import com.fran_utils.*;
import com.programación2.GrupoEjercicios;

/** Menú usado para seleccionar grupos de ejercicios. */

public class MenuGrupoEjs extends MenuGenerico<GrupoEjercicios>
{
/** Muestra el grupo de ejercicios seleccionado.
@param elemento El grupo de ejercicios a mostrar. */
	
@Override

public void mostrarElemento(GrupoEjercicios elemento)
{
System.out.printf("Práctica #%d - %s\n", elemento.id, elemento.nombre);
}

}
