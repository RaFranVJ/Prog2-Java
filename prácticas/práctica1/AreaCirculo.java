package com.programación2.prácticas.práctica1;

import java.util.Scanner;

import com.fran_utils.ConsolaGenerica.EntradaDatos;
import com.programación2.Ejercicio;

//Ejercicio propio #1

public class AreaCirculo extends Ejercicio
{

public AreaCirculo()
{
id = 1;
nombre = "Área del círculo";

esPropio = true;
}

// Calcula el área del círculo con los datos ingresados por el usuario

@Override
	
public void ejecutar(Scanner lector)
{
float radio = EntradaDatos.leerValor(lector, "Introduce el valor del radio", float.class);

// Calcular el diametro (radio elevado al cuadrado)
double diametro = Math.pow(radio, 2);

// Hallar el area del circulo (Pi por diametro)
double area = Math.PI * diametro;

// Mostrar la fórmula a utilizar
System.out.println("Fórmula: A = \u03C0 x r\u00B2");

// Mostrar procedimiento y resultado ("N2" = primeras dos cifras del decimal)
System.out.println("A = " + Math.PI + " x " + radio + "\u00B2 = " + area);
}

}
	