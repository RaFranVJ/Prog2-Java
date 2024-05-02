package com.programación2.prácticas.práctica7;

import java.io.*;
import java.util.*;
import com.fran_utils.ManejoDeArchivos.*;

import com.programación2.*;

//Ejercicio impropio #1 (Ejemplo 17.1 del libro)

public class Directorio extends Ejercicio
{
// ctor

public Directorio()
{
id = 1;
nombre = "Ver contenido de un directorio";

esPropio = false;
}

@Override

public void ejecutar(Scanner lector) 
{
File dir = UtilidadMenus.obtenerSistemaDeArchivos(false, FiltroDeArchivos.NoFiltrar, lector);

// Debe ser un directorio

if(dir.exists() && dir.isDirectory() )
{
String[] cd = dir.list(); // se obtiene la lista de elementos
 
System.out.printf("Elementos del directorio: \"%s\":\n\n", dir.getName() );

// Hay elementos en el directorio

if(cd.length > 0)
{
// Iterar entre los elementos del directorio

for(int i = 0; i < cd.length; i++)	  
System.out.println(cd[i]);

}

// No hay elementos

else 
System.out.println("Directorio vacío");

}

// El directorio no existe

else 
System.out.println("No se ha especificado directorio ");

}
	
}