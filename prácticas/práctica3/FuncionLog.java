package com.programación2.prácticas.práctica3;

import com.fran_utils.ConsolaGenerica.EntradaDatos;
import com.programación2.Ejercicio;

import java.util.Scanner;

/** Ejercicio impropio #3 (6.3 del libro) */

public class FuncionLog extends Ejercicio
{
// Constructor por default
				
public FuncionLog()
{
id = 3;
nombre = "Validar función logarítmica usando bucle while";

esPropio = false;
}

/** Valida una función log el bucle while. */

@Override
			
public void ejecutar(Scanner lector)
{
double f, x = 0;
boolean xpositivo = false;

while(!xpositivo)
{
x = EntradaDatos.leerValor(lector, "Ingresa un valor para X", double.class);

xpositivo = (x > 0.0); //asigna true si x>0.0
}

f = x * Math.log(x);
System.out.printf("f(%d) = %df\n", x, f);
}

}
	