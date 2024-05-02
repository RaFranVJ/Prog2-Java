package com.programación2.menus;

import com.fran_utils.*;
import com.fran_utils.ManejoDeArchivos.*;

/** Menú usado para seleccionar archivos y carpetas. */

public class MenuArchivos extends MenuGenerico<SistemaDeArchivos>
{
/** Muestra el ejercicio actual seleccionado.
@param elemento El ejercicio a mostrar. */

@Override

public void mostrarElemento(SistemaDeArchivos elemento)
{
AtributoDeArchivo atr = elemento.obtenerAtributo();
System.out.printf("%d. %s (%s)\n", elemento.id, elemento.nombre, atr);
}

}