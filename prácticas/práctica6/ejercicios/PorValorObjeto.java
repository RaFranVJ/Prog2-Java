package com.programación2.prácticas.práctica6.ejercicios;

import java.util.*;

import com.programación2.Ejercicio;
import com.programación2.prácticas.práctica6.clases.*;

// Ejercicio impropio #5 (Ejemplo 9.5 del libro)

public class PorValorObjeto extends Ejercicio
{

public PorValorObjeto()
{
id = 5;
nombre = "Paso de objetos por referencia a un método";

esPropio = false;
}

static void modifica(Julian obj)
{
// se modifican las variables instancia de obj

obj.fecha = "01-Feb-2001";
obj.dias = 32;
}

@Override

public void ejecutar(Scanner lector)
{
Julian jan = new Julian();

// muestra valores actuales

System.out.println("Propiedades del objeto en la creación."); 
jan.mostrar();

// llamada a método que modifica el objeto

modifica(jan);

System.out.println("Propiedades del objeto modificado."); 
jan.mostrar();
}

}