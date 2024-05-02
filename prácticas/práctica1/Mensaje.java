package com.programación2.prácticas.práctica1;

import java.util.Scanner;

import com.programación2.Ejercicio;

// Ejercicio impropio #5 (Ejemplo 3.2 del libro)

public class Mensaje extends Ejercicio
{
// Constructor por default
	
public Mensaje()
{
id = 5;
nombre = "Mensaje personalizado (Ejemplo 3.2)";

esPropio = false;
}

@Override

// Muestra un mensaje personalizado según el nombre de usuario actual

public void ejecutar(Scanner lector)
{
String mensaje = "Tardes de Domingo con ";
String nombreUsuario = System.getProperty("user.name");

System.out.println(mensaje + nombreUsuario);
}

}