
package com.programación2.prácticas.práctica4;

import java.util.*;

import com.programación2.Ejercicio;
import com.programación2.prácticas.práctica5.clases.*;

/** Ejercicio impropio #10 (10.10 del libro). */

public class VectorNumero extends Ejercicio
{
/** ctor Base */

public VectorNumero()
{
id = 10;
nombre = "Vector de números racionales";
		        
esPropio = false;
}

@SuppressWarnings( { "rawtypes", "unchecked" } )

@Override

public void ejecutar(Scanner lector)
{
int N = 3;

Vector num = new Vector(N);

for(int i = 0; i < N; i++)
{
Racional q = new Racional(3 * i, 3 * i % 7 + 1);
num.addElement(q);
}

 // recuperación de los elementos

int k = num.size(); // número de elementos

for(int i = 0; i < k; i++)
{
Racional q = (Racional)num.elementAt(i);
q.mostrar();
}

}

}