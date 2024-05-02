package com.programación2.prácticas.práctica8.ejercicios;

import java.util.*;
import javax.swing.*;

import com.programación2.Ejercicio;
import com.programación2.prácticas.práctica8.clases.*;

//Ejercicio impropio #7 (Ejemplo 20.7 del libro)

public class DelimMarcoPorCajas2 extends Ejercicio
{
// ctor

public DelimMarcoPorCajas2()
{
id = 7;
nombre = "Delimitar marco por cajas usando el componente Box";

esPropio = false;
}

@Override
	
public void ejecutar(Scanner lector)
{
MarcoBox2 miMarco = new MarcoBox2();

miMarco.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
}

}