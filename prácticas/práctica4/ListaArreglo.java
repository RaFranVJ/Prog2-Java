
package com.programación2.prácticas.práctica4;

import java.util.*;
import com.fran_utils.ConsolaGenerica.*;

import com.programación2.Ejercicio;

/** Ejercicio impropio #11 (10.11 del libro). */

public class ListaArreglo extends Ejercicio
{
/** ctor Base */

public ListaArreglo()
{
id = 11;
nombre = "Modificar una lista de arreglos";
		        
esPropio = false;
}

@Override

public void ejecutar(Scanner lector)
{
ArrayList<String> av = new ArrayList<String>();
String cd;

System.out.println("====== Datos de entrada ======\n");

do
{
cd = EntradaDatos.leerValor(lector, "Ingresa una palabra (o \"adios\" para acabar)", String.class);

if(!cd.equalsIgnoreCase("adios") )
av.add(cd);
	 
else
break;

}

while(true);
	 
System.out.println("Lista de palabras: " + av);

// elimina una palabra 

cd = EntradaDatos.leerValor(lector, "Palabra a eliminar", String.class);

if(av.remove(cd) )
System.out.println("Palabra borrada, lista actual: + av"); 
	 
else 
System.out.println("No esta en la lista la palabra"); 

// reemplaza elemento que está en el centro

av.set(av.size()/2, "NuevaCadena");
System.out.println("Lista completa:" + av);

// busqueda de una palabra

cd = EntradaDatos.leerValor(lector, "Búsqueda de una palabra", String.class);
int k = av.indexOf(cd);
	 
if(k >= 0)
System.out.println("Cadena encontrada en la posición: " + k);
	 
else 
System.out.print("No se encuentra en el arreglo ");
	 
}

}