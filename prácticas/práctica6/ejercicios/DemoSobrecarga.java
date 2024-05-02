package com.programación2.prácticas.práctica6.ejercicios;

import java.util.*;

import com.programación2.Ejercicio;
import com.programación2.prácticas.práctica6.clases.*;

// Ejercicio impropio #7 (Ejemplo 9.7 del libro)

public class DemoSobrecarga extends Ejercicio
{

public DemoSobrecarga()
{
id = 7;
nombre = "Sobrecarga de parámetros en un método";

esPropio = false;
}

@Override

public void ejecutar(Scanner lector)
{
Sobrecarga objeto = new Sobrecarga();

 // llamada a los métodos sobrecargados

objeto.prueba();
objeto.prueba(29);
objeto.prueba(21, 19);
objeto.prueba(-2.5, 10.0, 5.1);
}

}