package com.programación2.prácticas.práctica7;

import java.io.*;
import java.util.*;

import com.programación2.*;

// Ejercicio impropio #4 (Ejemplo 17.4 del libro)

public class EscribeCamino extends Ejercicio
{
// ctor

public EscribeCamino()
{
id = 4;
nombre = "Validar y escribir datos según su tipo";

esPropio = false;
}

static boolean datosValidos(String cad) throws Exception
{
StringTokenizer cd;

boolean sw;

cd = new StringTokenizer(cad);
sw = cd.countTokens() == 3;

cd.nextToken(); 

sw = sw && (Integer.parseInt(cd.nextToken() ) > 0);

return sw;
}

@Override

public void ejecutar(Scanner lector) 
{
File mf = UtilidadMenus.obtenerSistemaDeArchivos(true, lector);

BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in) );
PrintWriter pw = null;

String cad;
	 
boolean modo = mf.exists();

try
{ 
pw = new PrintWriter( new DataOutputStream( new FileOutputStream(mf, modo) ) );

System.out.println("Pueblo_A distancia Pueblo_B");

while( ( ( cad = entrada.readLine() ) != null) && ( cad.length() > 0) )
{ 

if (datosValidos(cad)) 
pw.println(cad);

}

pw.close();
}

catch (Exception e)
{
System.out.println(e.getMessage() );
e.printStackTrace();
}

}

}