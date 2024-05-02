package com.programación2.prácticas.práctica7;

import java.io.*;
import java.nio.file.*;
import java.util.*;
import com.fran_utils.ConsolaGenerica.*;
import com.fran_utils.ManejoDeArchivos.*;

import com.programación2.*;

// Ejercicio propio #3

public class ManejarSistemasDeArchivos extends Ejercicio
{
// ctor

public ManejarSistemasDeArchivos()
{
id = 3;
nombre = "Administrador de archivos";

esPropio = true;
}

// Leer nuevo nombre

private String dialogNombre(Scanner lector)
{
String n = EntradaDatos.leerValor(lector, "Ingresa un nuevo nombre", String.class);

n = Objects.requireNonNullElse(n, "(Nuevo)");

return n;
}

// Leer tipo de sistema de archivo

private boolean dialogTipo(Scanner lector)
{
String encabezado = "Archivo o Carpeta";

String cuerpo = "Ingresa %d para trabajar directamente con archivos.\n"
+ "De lo contrario, ingresa %d para tratar el sistema de archivos como una carpeta.";

String msgSelec = "Elige un tipo";

return EntradaDatos.selecBooleana(encabezado, cuerpo, msgSelec, lector);
}

// Leer filtro de sistema de archivos

private FiltroDeArchivos dialogFiltro(Scanner lector)
{
return EntradaDatos.selecEnum("Selecciona una opción de filtrado", FiltroDeArchivos.class, lector);
}

// Leer opción de copiado para el sistema de archivos

private StandardCopyOption dialogOpcionCopiado(Scanner lector)
{
return EntradaDatos.selecEnum("Selecciona una opción de copiado", StandardCopyOption.class, lector);
}

// Dialogo usado para crear nuevos archivos

protected void dialogCrearNuevo(Scanner lector)
{
File ruta = UtilidadMenus.obtenerSistemaDeArchivos(true, FiltroDeArchivos.ObtenerCarpetas, lector);
String nombre = dialogNombre(lector);

String rutaCompleta = ruta.getAbsolutePath() + File.separatorChar + nombre;
boolean esDir = dialogTipo(lector);

AdminDeArchivos.crearNuevo(rutaCompleta, esDir);
}

// Dialogo usado para renombrar archivos

protected void dialogRenombrar(Scanner lector)
{
FiltroDeArchivos filtro = dialogFiltro(lector);
File ruta = UtilidadMenus.obtenerSistemaDeArchivos(true, filtro, lector);

String nuevoNombre = dialogNombre(lector);
AdminDeArchivos.renombrar(ruta, nuevoNombre);
}

// Dialogo usado para copiar archivos

protected void dialogCopiar(Scanner lector)
{
FiltroDeArchivos filtro = dialogFiltro(lector);
File origen = UtilidadMenus.obtenerSistemaDeArchivos(true, filtro, lector);

File destino = UtilidadMenus.obtenerSistemaDeArchivos(true, FiltroDeArchivos.ObtenerCarpetas, lector);
StandardCopyOption opcionCopiado = dialogOpcionCopiado(lector);

AdminDeArchivos.copiar(origen.toPath(), destino.toPath(), opcionCopiado);
}

// Dialogo usado para mover archivos

protected void dialogMover(Scanner lector)
{
FiltroDeArchivos filtro = dialogFiltro(lector);
File origen = UtilidadMenus.obtenerSistemaDeArchivos(true, filtro, lector);

File destino = UtilidadMenus.obtenerSistemaDeArchivos(true, FiltroDeArchivos.ObtenerCarpetas, lector);
StandardCopyOption opcionCopiado = dialogOpcionCopiado(lector);

AdminDeArchivos.mover(origen.toPath(), destino.toPath(), opcionCopiado);
}

// Dialogo usado para eliminar archivos

protected void dialogEliminar(Scanner lector)
{
FiltroDeArchivos filtro = dialogFiltro(lector);
File ruta = UtilidadMenus.obtenerSistemaDeArchivos(true, filtro, lector);

AdminDeArchivos.eliminar(ruta.toPath() );
}

// Llamar la opción seleccionado usando el switch-case

private void llamarOpcion(int opcion, Scanner lector)
{

switch(opcion)
{
case 1:
dialogCrearNuevo(lector);
break;
          
case 2:
dialogRenombrar(lector);
break;

case 3:
dialogCopiar(lector);
break;

case 4:
dialogRenombrar(lector);
break;

case 5:
dialogEliminar(lector);
break;
   
default:
System.out.println("Opción no disponible");
break;
}

}

@Override

public void ejecutar(Scanner lector) 
{
System.out.println("=========== Administrador de archivos ============\n");
    
System.out.println("1) Crear nuevo");
System.out.println("2) Renombrar");
System.out.println("3) Copiar");
System.out.println("4) Mover");
System.out.println("5) Eliminar\n");

int opcion = EntradaDatos.leerValor(lector, "Elije una opción", int.class);

System.out.println();

llamarOpcion(opcion, lector);
}

}