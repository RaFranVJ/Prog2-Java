package com.programación2.prácticas.práctica5.ejercicios;
import java.util.*;

import com.programación2.Ejercicio;
import com.programación2.prácticas.práctica5.clases.*;

/** Ejercicio propio #1. */

public class EjConClaseCarro extends Ejercicio
{
/** ctor Base */

public EjConClaseCarro()
{
id = 1;
nombre = "Declaración de la clase \"Carro\" ";
		        
esPropio = true;
}

@Override

public void ejecutar(Scanner lector)
{
Carro miCarro = new Carro("Ford", "Azul", 2016);

miCarro.mostrarInfo();
}

}