package com.programación2.prácticas.práctica6.ejercicios;

import java.util.*;

import com.programación2.Ejercicio;
import com.programación2.prácticas.práctica6.clases.dolmen.*;

// Ejercicio impropio #1 (Ejemplo 9.1 del libro)

public class Prueba extends Ejercicio
{

public Prueba()
{
id = 3;
nombre = "Acceso a métodos";

esPropio = false;
}

@Override

public void ejecutar(Scanner lector)
{
Segunda st = new Segunda(); // crea un objeto
Primera pt = new Primera(); // crea objeto

st.balsas(); // llamada correcta por tener acceso público
pt.homero(); // llamada correcta por tener acceso público
	 
// pt.salustio(); --> error, el acceso es el paquete dolmen
}

}