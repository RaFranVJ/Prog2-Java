package com.programación2;

import com.fran_utils.ConsolaGenerica.*;
import com.fran_utils.ManejoDeArchivos.*;

import com.programación2.menus.*;
import java.io.File;
import java.util.*;


/** Maneja las diferentes entradas que el usuario puede hacer en los menús por teclado */

public final class UtilidadMenus
{
/** Inicializa una nueva instancia del Menu de Grupo de Ejercicios. */
	
private static MenuGrupoEjs menuPracticas = new MenuGrupoEjs();

/** Inicializa una nueva instancia del Menu de Ejercicios. */

private static MenuEjercicios menuEjs = new MenuEjercicios();

/** Inicializa una nueva instancia del Menu de Archivos. */

private static MenuArchivos menuArchivos = new MenuArchivos();

/** Realiza la selección de prácticas usando una instancia del Menu de Grupo de Ejercicios.

@param practicas La lista de prácticas donde se realiza la selección.
@param lector Una instancia del Scanner usada para leer la entrada del usuario.

@return La práctica seleccionada por el usuario. */

public static GrupoEjercicios selecPractica(List<GrupoEjercicios> practicas, Scanner lector)
{
GrupoEjercicios practica = menuPracticas.guardarOpcion(practicas, "Prácticas", "Selecciona una práctica", lector);

if(practica.usarSubGrupos)
practica.obtenerSubGrupos();

return practica;
}

/** Realiza la selección de ejercicios creando una instancia del Menu de Ejercicios.

@param grupoEjs El grupo de ejercicios donde se realiza la selección.
@param lector Una instancia del Scanner usada para leer la entrada del usuario.

@return El ejercicio seleccionado por el usuario. */

public static Ejercicio selecEj(GrupoEjercicios grupoEjs, Scanner lector)
{
Ejercicio ej;

// Mostrar advertencia si no hay ejercicios ni sub-grupos disponibles

if(grupoEjs.listaEjs == null && grupoEjs.listaSubGrupos == null)
{
System.out.printf("\u26A0 '%s' no tiene ejercicios ni sub-grupos disponibles.\n", grupoEjs.nombre);
ej = null;
}

// Obtener directamente un ejercicio de la lista si no hay sub-grupos pero sí ejercicios (propios o impropios)

else if(grupoEjs.listaEjs != null && grupoEjs.listaSubGrupos == null)
{
boolean propiedad = obtenerPropiedadEjs(lector);
ej = obtenerEjDeGrupo(grupoEjs, propiedad, lector);
}

// Hacer una selección entre lista de ejercicios y sub-grupos

else
{
boolean esModoDirecto = obtenerModoSelec(lector);
ej = obtenerEjDeSubGrupo(esModoDirecto, grupoEjs, lector);
}

return ej;
}

// Determinar si seguir explorando los elementos de una sub-carpeta o no

private static boolean explorarSubCarpetas(Scanner lector)
{
String encabezado = "Explorar sub-carpetas";

String cuerpo = "Ingresa %d para seleccionar la sub-carpeta actual.\n"
+ "De lo contrario, ingresa %d visualizar los contenidos de la sub-carpeta.";

String msgSelec = "Elije una acción";

return EntradaDatos.selecBooleana(encabezado, cuerpo, msgSelec, lector);
}

// Entrada a archivos o carpetas

public static File obtenerSistemaDeArchivos(boolean usarRecursividad, Scanner lector)
{
SistemaDeArchivos dirUsuario = new SistemaDeArchivos();
SistemaDeArchivos entrada = selecEntrada(dirUsuario, FiltroDeArchivos.NoFiltrar, lector);

while(entrada.obtenerAtributo() == AtributoDeArchivo.Directorio && usarRecursividad)
entrada = selecEntrada(entrada, FiltroDeArchivos.NoFiltrar, lector);

return new File(entrada.ruta.toString() );
}

// Entrada a archivos o carpetas usando un filtro específico

public static File obtenerSistemaDeArchivos(boolean usarRecursividad, FiltroDeArchivos filtro, Scanner lector)
{
SistemaDeArchivos dirUsuario = new SistemaDeArchivos();
SistemaDeArchivos entrada = selecEntrada(dirUsuario, filtro, lector);

while(entrada.obtenerAtributo() == AtributoDeArchivo.Directorio && usarRecursividad)
{
boolean explorarSubDir = explorarSubCarpetas(lector);

if(!explorarSubDir)
break;

entrada = selecEntrada(entrada, filtro, lector);
}

return new File(entrada.ruta.toString() );
}

/** Obtiene un booleano usado más adelante para filtrar los ejercicios por propiedad.

@param lector Una instancia del Scanner usada para leer la entrada del usuario.

@return El booleano obtenido. */

private static boolean obtenerPropiedadEjs(Scanner lector)
{
String encabezado = "Ejercicios propios o impropios";

String cuerpo = "Ingresa '%d' para filtrar los ejercicios impropios.\n"
+ "De lo contrario, ingresa '%d' para solo obtener los ejercicios propios";

String msgSelec = "Selecciona propiedad de ejercicios";

return EntradaDatos.selecBooleana(encabezado, cuerpo, msgSelec, lector);
}

/** Obtiene el ejercicio seleccionado por el usuario dentro de un grupo específico de ejercicios

@param grupoEjs El grupo de ejercicios donde se realiza la selección.
// 2 propiedad
@param lector Una instancia del Scanner usada para leer la entrada del usuario.

@return El booleano obtenido. */

private static Ejercicio obtenerEjDeGrupo(GrupoEjercicios grupoEjs, boolean propiedad, Scanner lector)
{
grupoEjs.filtrarEjs(propiedad);

Collections.sort(grupoEjs.listaEjs);

return menuEjs.guardarOpcion(grupoEjs.listaEjs, "Ejercicios", "Selecciona un ejercicio", lector);
}

/** Obtiene un booleano de dónde debería hacerse la selección (si de la lista de ej. de un grupo o de un sub-grupo)

@param lector Una instancia del Scanner usada para leer la entrada del usuario.

@return El booleano obtenido. */

private static boolean obtenerModoSelec(Scanner lector)
{
String encabezado = "Selección por grupos o directa";

String cuerpo = "La práctica parece estar dividida en sub-grupos.\n\n"

+ "Ingresa '%d' para elegir un sub-grupo. Luego tendrás que escoger un ejercicio propio del sub-grupo.\n"
+ "Ingresa '%d' para seleccionar únicamente los ejercicios impropios del grupo";

String msgSelec = "Determina el modo de selección";

return EntradaDatos.selecBooleana(encabezado, cuerpo, msgSelec, lector);
}

/** Realiza la selección de sub-grupos usando una instancia del Menu de Grupo de Ejercicios.

@param subGrupos La lista de sub-grupos donde se realiza la selección.
@param lector Una instancia del Scanner usada para leer la entrada del usuario.

@return El sub-grupo seleccionado por el usuario. */

private static GrupoEjercicios selecSubGrupo(List<GrupoEjercicios> subGrupos, Scanner lector)
{
Collections.sort(subGrupos);
return menuPracticas.guardarOpcion(subGrupos, "Sub-grupos de ejercicios", "Selecciona un sub-grupo", lector);
}

private static Ejercicio obtenerEjDeSubGrupo(boolean esModoDirecto, GrupoEjercicios grupoEjs, Scanner lector)
{
Ejercicio ej;

// Si el modo no es directo, hacer la selección de sub-grupos y luego la de ejercicios (todos son propios)

if(!esModoDirecto)
{
GrupoEjercicios subGrupo = selecSubGrupo(grupoEjs.listaSubGrupos, lector);
ej = obtenerEjDeGrupo(subGrupo, true, lector);
}

// De lo contrario, hacer la selección directa de ejercicios (todos son impropios)

else
ej = obtenerEjDeGrupo(grupoEjs, false, lector);

return ej;
}

//obtener una entrada de archivos dentro de una existente usando un filtro específico

private static SistemaDeArchivos selecEntrada(SistemaDeArchivos entradaBase, FiltroDeArchivos filtro, Scanner lector)
{
entradaBase.asignarSubSistemas(filtro);
return menuArchivos.guardarOpcion(entradaBase.obtenerSubSistemas(), "Sistemas de archivos", "Selecciona una entrada", lector);
}

}