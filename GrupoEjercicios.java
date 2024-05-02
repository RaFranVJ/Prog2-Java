package com.programación2;

import java.util.*;
import com.fran_utils.*;

/** Clase base usada para agrupar Ejercicios de un paquete y filtrarlos por propiedad usando Reflection. */

public abstract class GrupoEjercicios extends ClaseOrdenable
{
/** Obtiene o asigna el nombre del Paquete de donde se van a extraer los ejercicios.
@return El nombre del paquete de ejercicios. */

protected String paqueteDeEjs;

/** Crea u obtiene una lista de ejercicios que pertenecen al grupo
@return La lista de ejercicios. */

public List<Ejercicio> listaEjs;

/** Obtiene o asigna un booleano que determina si se deberían usar sub-grupos en el grupo
@return <b>true</b> si se usarán sub-grupos; de lo contrario, <b>false</b>. */

public boolean usarSubGrupos;

/** Obtiene o asigna el nombre del Espacio de donde se van a extraer los sub-grupos. <br>
(El campo se ignora si <c>usarSubGrupos</c> es <b>false</b>). <br> <br>

Debe ser únicamente el nombre corto del espacio de nombres donde se encuentran los sub-grupos.<br>
(Este se concatenará con el nombre del paquete de ejercicios).

@return El nombre del espacio de sub-grupos. */

protected String espacioSubGrupos;

/** Crea u obtiene una lista de sub-grupos de ejercicios
@return La lista de sub-grupos. */

public List<GrupoEjercicios> listaSubGrupos;

/** Crea una nueva instancia de la clase 'GrupoEjercicios' */

public GrupoEjercicios()
{
id = 0;
nombre = "<MiGrupo>";

paqueteDeEjs = "com";
listaEjs = new ArrayList<>();

usarSubGrupos = false;
espacioSubGrupos = "sub_grupos";

listaSubGrupos = null;
}

/** Filtra la lista de ejercicios por propiedad (propios o impropios). */

public void filtrarEjs(boolean propiedad)
{
List<Ejercicio> todosLosEjs = AnalistaDePaquetes.obtenerInstancias(paqueteDeEjs, Ejercicio.class);

for(int i = 0; i < todosLosEjs.size(); i++) 
{
Ejercicio ej = todosLosEjs.get(i);

if(ej.esPropio == propiedad)
listaEjs.add(ej);

}

}

/** Obtiene los sub-grupos dentro de este grupo. */

public void obtenerSubGrupos()
{
String nombreCompleto = paqueteDeEjs + "." + espacioSubGrupos;
listaSubGrupos =  AnalistaDePaquetes.obtenerInstancias(nombreCompleto, GrupoEjercicios.class);
}

}