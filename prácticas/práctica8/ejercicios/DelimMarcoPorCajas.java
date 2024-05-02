package com.programación2.prácticas.práctica8.ejercicios;

import java.util.*;

import com.programación2.Ejercicio;
import com.programación2.prácticas.práctica8.clases.*;

//Ejercicio impropio #6 (Ejemplo 20.6 del libro)

public class DelimMarcoPorCajas extends Ejercicio
{
// ctor

public DelimMarcoPorCajas()
{
id = 6;
nombre = "Delimitar marco por cajas usando BoxLayout";

esPropio = false;
}

@Override
	
public void ejecutar(Scanner lector)
{
MarcoBox miMarco = new MarcoBox();

miMarco.setVisible(true);
}

}