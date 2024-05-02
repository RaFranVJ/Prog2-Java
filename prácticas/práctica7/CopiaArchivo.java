package com.programación2.prácticas.práctica7;

import java.io.*;
import java.util.*;

import com.programación2.Ejercicio;

//Ejercicio impropio #2 (Ejemplo 17.2 del libro)

public class CopiaArchivo extends Ejercicio
{
// ctor

public CopiaArchivo()
{
id = 2;
nombre = "Copiar un archivo";

esPropio = false;
}

@Override

public void ejecutar(Scanner lector) 
{
FileInputStream origen = null;
FileOutputStream destino = null;
	 
File f1 = new File("jardines.txt");
File f2 = new File("jardinOld.txt");

try
{
origen = new FileInputStream(f1);
destino = new FileOutputStream(f2);
	 
int c;

while ( (c = origen.read() ) != -1)
destino.write( (byte)c);

}

catch(IOException er)
{
System.out.println("Excepción en los flujos " 
+ er.getMessage() );
}

finally
{

try 
{
origen.close();
destino.close();
}

catch (IOException er)
{
er.printStackTrace();
}

}

}

}