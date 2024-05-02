package com.programación2.prácticas.práctica3.ejs_bucle_while;

import java.util.Scanner;

import com.programación2.Ejercicio;

/** Ejercicio propio #1 usando el bucle while */

public class DigitosDeUnNum extends Ejercicio
{
/** ctor Base */

public DigitosDeUnNum()
{
id = 1;
nombre = "Contar dígitos de un número";
				        
esPropio = true;
}

@Override
	
public void ejecutar(Scanner lector)
{
System.out.print("Ingresa un número: ");
int numero = lector.nextInt();

int cantDigitos = 0;
int numeroTemporal = numero;

while(numeroTemporal != 0)
{
cantDigitos++;
numeroTemporal /= 10; // Dividir el número por 10 para eliminar el último dígito
}

System.out.printf("'%d' tiene %d dígitos.\n", numero, cantDigitos);
}

}