package com.programación2.prácticas.práctica1;

import com.fran_utils.ConsolaGenerica.EntradaDatos;
import com.programación2.Ejercicio;

import java.util.Scanner;

public class AreaTriangulo extends Ejercicio
{
// Constructor por default

public AreaTriangulo()
{
id = 5;
nombre = "Calcular área de un triángulo";

esPropio = true;
}

// Calcula el área de un triángulo con los datos ingresados por el usuario

@Override

public void ejecutar(Scanner lector)
{
float b = EntradaDatos.leerValor(lector, "Introduce el valor de la base", float.class);
float h = EntradaDatos.leerValor(lector, "Introduce el valor de la altura", float.class);

// Calcular el área del triángulo (base por altura entre 2)
float area = b * h / 2;

// Mostrar la fórmula utilizada
System.out.println("Fórmula: A = (b x h) ÷ 2");

// Mostrar procedimientos y resultado
System.out.printf("A = (%.2f x %.2f) ÷ 2 = %.2f\n", b, h, area);
}

}