package com.programación2.prácticas.práctica7;

import java.io.*;
import java.nio.file.*;
import java.nio.file.attribute.*;
import java.util.*;
import com.fran_utils.ManejoDeArchivos.*;

import com.programación2.*;

// Ejercicio propio #1

public class PropiedadesArchivo extends Ejercicio
{
// ctor

public PropiedadesArchivo()
{
id = 1;
nombre = "Obtener propiedades de un archivo";

esPropio = true;
}

@Override

public void ejecutar(Scanner lector) 
{
File miArchivo = UtilidadMenus.obtenerSistemaDeArchivos(true, lector);

try
{
System.out.println("========== Propiedades del archivo =========\n");

BasicFileAttributes attrs = Files.readAttributes(miArchivo.toPath(), BasicFileAttributes.class);

String nombreArchivo = miArchivo.getName();
String rutaBase = miArchivo.getParent();
String rutaAbsoluta = miArchivo.getAbsolutePath();

String tamañoReal = AdminDeArchivos.obtenerTamañoReal(miArchivo.length() );

FileTime fechaCreacion = attrs.creationTime();
FileTime ultimoAcceso = attrs.lastAccessTime();
FileTime ultimaMod = attrs.lastModifiedTime();

System.out.printf("Nombre: %s\n", nombreArchivo);
System.out.printf("Ruta base: %s\n", rutaBase);
System.out.printf("Ruta absoluta: %s\n", rutaAbsoluta);
System.out.printf("Tamaño: %s\n",  tamañoReal);
System.out.printf("Fecha de creación: %s\n", fechaCreacion);
System.out.printf("Último acceso: %s\n", ultimoAcceso);
System.out.printf("Última modificación: %s\n", ultimaMod);
}

catch(IOException error)
{
System.out.println("Error al obtener las propiedades del archivo:\n");
error.printStackTrace();
}

}

}