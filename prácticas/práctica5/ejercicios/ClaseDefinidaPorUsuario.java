
package com.programación2.prácticas.práctica5.ejercicios;

import java.util.*;
import com.fran_utils.ConsolaGenerica.*;

import com.programación2.Ejercicio;
import com.programación2.prácticas.práctica5.clases.*;

/** Ejercicio impropio #10 (8.10 del libro). */

public class ClaseDefinidaPorUsuario extends Ejercicio
{
/** ctor Base */

public ClaseDefinidaPorUsuario()
{
id = 10;
nombre = "Clase definida por el usuario";
		        
esPropio = false;
}

@Override

public void ejecutar(Scanner lector)
{
String n = EntradaDatos.leerValor(lector, "Ingrese su nombre", String.class);

Empleado nuevoEmpleado = new Empleado(n);

nuevoEmpleado.mostrarDatos();
}

}