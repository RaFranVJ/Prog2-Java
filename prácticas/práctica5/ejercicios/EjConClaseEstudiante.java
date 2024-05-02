
package com.programación2.prácticas.práctica5.ejercicios;

import java.util.*;
import com.fran_utils.ConsolaGenerica.*;

import com.programación2.Ejercicio;
import com.programación2.prácticas.práctica5.clases.*;

/** Ejercicio propio #2. */

public class EjConClaseEstudiante extends Ejercicio
{
/** ctor Base */

public EjConClaseEstudiante()
{
id = 5;
nombre = "Lista de objetos del tipo \"Estudiante\" ";
		        
esPropio = true;
}

// Asignar datos a un nuevo estudiante

private Estudiante registrarEstudiante(int ind, int max, Scanner lector)
{
System.out.printf("=========== Registro del estudiante #%d de %d ==========\n\n", ind+1, max);

Estudiante nuevoEstudiante = new Estudiante();

String n = EntradaDatos.leerValor(lector, "Ingresa el nombre del estudiante", String.class);
String m = EntradaDatos.leerValor(lector, "Ingresa la matricula del estudiante", String.class);
float i = EntradaDatos.leerValor(lector, "Introduce el índice del alumno", float.class);

nuevoEstudiante.asignarDatos(n, m, i);

return nuevoEstudiante;
}

@Override

public void ejecutar(Scanner lector)
{
int cant = EntradaDatos.leerValor(lector, "Introduce la cantidad de estudiantes", int.class);

ArrayList<Estudiante> listaEstudiantes = new ArrayList<>(cant);

// Procesar cada estudiante

for(int i = 0; i < cant; i++)
{
Estudiante est = registrarEstudiante(i, cant, lector);
listaEstudiantes.add(est);
}

Estudiante estudianteMayorInd = listaEstudiantes.stream().max( (a, b) -> Double.compare(a.obtenerInd(), b.obtenerInd() ) ).get(); // error

System.out.printf("El mayor índice (%.2f) le corresponde a %s", estudianteMayorInd.obtenerInd(), estudianteMayorInd.obtenerNombre() );
}

}