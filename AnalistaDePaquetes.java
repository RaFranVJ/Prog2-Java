package com.programación2;

import java.io.*;
import java.lang.reflect.*;
import java.util.*;
import java.util.stream.*;

/** Permite analizar paquetes de Java y obtener instancias de sus clases. */

public final class AnalistaDePaquetes
{
/** Obtiene una instancia de una clase basándose en el nombre y tipo dados */

@SuppressWarnings("unchecked")

private static <T> T iniciarClase(String nombre, Class<T> tipo)
{
System.out.printf("Obteniendo instancia de la clase \"%s\"...\n\n", nombre);

T instancia = null;

try
{
Class<?> claseJava = Class.forName(nombre);

if(tipo.isAssignableFrom(claseJava) )
{
Constructor<?> ctorBase = claseJava.getDeclaredConstructor();
instancia = (T) ctorBase.newInstance();
}

}

// Capturar errores producidos al inicializar las Instancias

catch(ClassNotFoundException | NoSuchMethodException |InstantiationException | IllegalAccessException |InvocationTargetException error)
{
System.out.println("Error al obtener una instancia de la clase:\n");
error.printStackTrace();
}

System.out.println("Clase iniciada con éxito.");
return instancia;
}

/** Obtiene una lista de instancias definidas por el tipo 'T' dentro de un paquete específico.

@param nombrePaquete El nombre del paquete de donde se obtendrá la lista de instancias.
@param tipoClase El tipo de clase a obtener.

@return La lista de instancias obtenidas. */

public static <T> List<T> obtenerInstancias(String nombrePaquete, Class<T> tipoClase)
{
System.out.printf("$ Análisis del paquete <%s>\n\n", nombrePaquete);

List<T> listaInstancias = new ArrayList<>();

try
{
String rutaPaquete = nombrePaquete.replace('.', '/');
ClassLoader cargadorDeClases = Thread.currentThread().getContextClassLoader();

// Verificar si el paquete existe

if(cargadorDeClases.getResource(rutaPaquete) == null) 
{
System.out.printf("\u26A0 El paquete '%s' no existe.\n", nombrePaquete);
System.out.println("Esto podría desencadenar futuras excepciones más adelante.\n");
}

try(InputStream flujoEntrada = cargadorDeClases.getResourceAsStream(rutaPaquete);
BufferedReader lectorEnBufer = new BufferedReader(new InputStreamReader(flujoEntrada) ) ) 
{
List<String> nombresFiltrados = lectorEnBufer.lines()
.filter(nombre -> nombre.endsWith(".class") )
.map(nombre -> nombre.substring(0, nombre.lastIndexOf('.') ) )
.collect(Collectors.toList() );

if(nombresFiltrados == null || nombresFiltrados.isEmpty() )
System.out.println("No se encontraron archivos en el paquete");

else
{

for(String nombreClase : nombresFiltrados)
{
String nombreCompleto = nombrePaquete + "." + nombreClase;

T instancia = iniciarClase(nombreCompleto, tipoClase);
listaInstancias.add(instancia);
}

}

}

}

// Capturar otros errores que puedan lanzarse

catch(Exception otroError)
{
otroError.printStackTrace();
}

return listaInstancias;
}

}
