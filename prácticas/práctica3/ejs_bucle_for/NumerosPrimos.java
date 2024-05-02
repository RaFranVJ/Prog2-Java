package com.programación2.prácticas.práctica3.ejs_bucle_for;

import com.fran_utils.ConsolaGenerica.EntradaDatos;
import com.programación2.Ejercicio;

import java.util.Scanner;

public class NumerosPrimos extends Ejercicio
{
    
// Constructor por defecto
	
public NumerosPrimos()
{
id = 4;
nombre = "Filtrar números primos";
        
esPropio = true;
}
    

@Override

public void ejecutar(Scanner lector)
{
int limite = EntradaDatos.leerNumEnRango(2, 200, "Ingresa un número", lector);

System.out.printf("Números primos de %d: ", limite);

for(int num = 2; limite > 0; num++) 
{
boolean esPrimo = true;

for(int i = 2; i <= Math.sqrt(num); i++)
{

if(num % i == 0)
{
esPrimo = false;
break;
}

}

if(esPrimo) 
{
System.out.printf("%s ", num);
limite--;
}

}
        
System.out.println();
}

}