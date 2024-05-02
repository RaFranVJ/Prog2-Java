package com.programación2.prácticas.práctica1;

import com.fran_utils.ConsolaGenerica.*;

import com.programación2.Ejercicio;

import java.util.Scanner;

// Ejercicio impropio #11

public class EntradaTest extends Ejercicio
{
// Constructor por default

public EntradaTest()
{
id = 11;
nombre = "Test: entrada de datos con Scanner";

esPropio = false;
}

@Override

// Usa la clase Scanner para obtener los datos del usuario introducidos por el teclado

public void ejecutar(Scanner lector)
{
// Obtener la primera entrada (Nombre)

String nombreUsuario = EntradaDatos.leerValor(lector, "Introduce tu nombre", String.class);

// Obtener la segunda entrada (Apellido)

String apellidoUsuario = EntradaDatos.leerValor(lector, "Introduce tu apellido", String.class);

System.out.println("\nBuenos días, " + nombreUsuario +  " " + apellidoUsuario);
}

}