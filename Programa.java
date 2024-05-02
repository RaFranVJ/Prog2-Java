package com.programación2;

import com.fran_utils.ConsolaGenerica.*;
import java.util.*;

/** Clase principal del programa. */

public class Programa
{
/** Método principal de la clase. Solo puede haber uno en todo el programa.

@param args Los argumentos pasados al programa en su ejecución 

 @throws InterruptedException El hilo es interrumpido mientras está ocupado */

public static void main(String[] args) throws InterruptedException
{
System.out.println("=========== Prácticas de Programación II ==========\n");

System.out.println("Todas las prácticas de este proyecto han sido realizadas por Francisco Villanueva, estudiante de UTESA (1-23-6951).\n");

Scanner lector = new Scanner(System.in);

List<GrupoEjercicios> practicas = obtenerPracticasEnOrden();
GrupoEjercicios grupoEjs = UtilidadMenus.selecPractica(practicas, lector);

Ejercicio ej = UtilidadMenus.selecEj(grupoEjs, lector);

// Ejecutar el ejercicio si no es null

if(ej != null)
ej.ejecutar(lector);

boolean terminarProg = cerrarOVolverAlProg(lector);

// Volver al inicio si no se desea cerrar el programa

if(!terminarProg)
main(args);

lector.close();
}

/** Obtiene una lista de objetos del tipo 'GrupoEjercicios', y los ordena por ID en orden ascendente.
@return La lista de prácticas ordenadas por ID. */

private static List<GrupoEjercicios> obtenerPracticasEnOrden()
{
List<GrupoEjercicios> practicas = AnalistaDePaquetes.obtenerInstancias("com.programación2.grupos_ej", GrupoEjercicios.class);
Collections.sort(practicas);

return practicas;
}

/** Obtiene un booleano que determina si se debería cerrar el programa o si se debería volver al inicio.

@param lector Una instancia del Scanner usada para leer la entrada del usuario.

@return El booleano obtenido. */

private static boolean cerrarOVolverAlProg(Scanner lector)
{
System.out.println();

String encabezado = "Terminar ejecución";

String cuerpo = "Ingresa '%d' para regresar al menú principal del programa.\n"
+ "De lo contrario, ingresa '%d' para terminar la ejecución del programa";

String msgSelec = "Escoge una acción";

return EntradaDatos.selecBooleana(encabezado, cuerpo, msgSelec, lector);
}

}