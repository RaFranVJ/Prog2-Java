package com.programación2.prácticas.práctica7;

import java.io.*;
import java.util.*;
import com.fran_utils.ManejoDeArchivos.*;

import com.programación2.*;

// Ejercicio impropio #3 (Ejemplo 17.3 del libro)

public class LeerTexto extends Ejercicio
{
// ctor

public LeerTexto()
{
id = 3;
nombre = "Leer texto de un archivo";

esPropio = false;
}

@Override

public void ejecutar(Scanner lector) 
{
File mf = UtilidadMenus.obtenerSistemaDeArchivos(true, FiltroDeArchivos.NoFiltrar, lector);

BufferedReader br = null;

String cd;

if(mf.exists() )
{
int k = 0;
	 
try
{ 
br = new BufferedReader(new FileReader(mf) );

// Leer el archivo linea por linea

while( (cd = br.readLine() ) != null)
{
System.out.println(cd);

if( (++k) % 21 == 0)
{
System.out.print("Pulse una tecla ...");
System.in.read();
}

}

br.close();
}

catch(IOException e)
{
System.out.println("Se produjo un error");
System.out.println(e.getMessage());
}

}

else 
System.out.println("El archivo no existe.");
	 
}

}