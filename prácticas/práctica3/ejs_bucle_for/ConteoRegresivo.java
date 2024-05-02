package com.programación2.prácticas.práctica3.ejs_bucle_for;

import com.fran_utils.ConsolaGenerica.*;

import com.programación2.Ejercicio;

import java.util.Scanner;

/** Ejercicio propio #2 usando el bucle for. */

public class ConteoRegresivo extends Ejercicio
{
// Constructor por defecto

public ConteoRegresivo()
{
id = 2;
nombre = "Iniciar cuenta regresiva";
        
esPropio = true;
}

/** Inicia una cuenta regresiva usando el bucle for y el operador de decremento (i--). */

@Override

public void ejecutar(Scanner lector)
{
int contarDesde = EntradaDatos.leerNumEnRango(3, 10, "Ingresa un número desde donde contar", lector);

// Iterar X veces usando el operador de decremento (i--) para la cuenta regresiva
	
for (int i = contarDesde; i <= 1; i--) 
System.out.print(i + " "); // Imprimir el número actual (i)

System.out.println();
}

}
