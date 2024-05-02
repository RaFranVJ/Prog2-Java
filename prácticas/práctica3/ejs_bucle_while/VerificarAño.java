package com.programación2.prácticas.práctica3.ejs_bucle_while;

import java.util.Scanner;

import com.programación2.Ejercicio;

/** Ejercicio propio #2 usando el bucle while. */

public class VerificarAño extends Ejercicio
{
/** ctor Base */

public VerificarAño()
{
id = 2;
nombre = "Verificar si un año es bisiesto";
					        
esPropio = true;
}

@Override

public void ejecutar(Scanner lector)
{
boolean entradaValida = false;
int año = 0;

while(!entradaValida)
{
System.out.print("Ingresa un año en formato numérico: ");

if(lector.hasNextInt() )
{
año = lector.nextInt();
entradaValida = true;
} 
            
else
{
System.out.println("Formato incorrecto. Solo se aceptan valores numéricos en la entrada.");
lector.next(); // Limpiar el búfer de entrada
}

}

boolean esBisiesto = (año % 4 == 0 && año % 100 != 0) || (año % 400 == 0);

if(esBisiesto) 
System.out.println(año + " es bisiesto.");
            
else 
System.out.println(año + " no es un año bisiesto.");
     
}

}