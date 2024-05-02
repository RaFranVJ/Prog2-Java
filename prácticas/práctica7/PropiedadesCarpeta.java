package com.programación2.prácticas.práctica7;

import java.io.*;
import java.nio.file.*;
import java.nio.file.attribute.*;
import java.util.*;
import com.fran_utils.ManejoDeArchivos.*;

import com.programación2.*;

// Ejercicio propio #2

public class PropiedadesCarpeta extends Ejercicio
{
// ctor

public PropiedadesCarpeta()
{
id = 2;
nombre = "Obtener propiedades de una carpeta";

esPropio = true;
}

@Override

public void ejecutar(Scanner lector) 
{
File miCarpeta = UtilidadMenus.obtenerSistemaDeArchivos(true, FiltroDeArchivos.ObtenerCarpetas, lector);

try
{
System.out.println("========== Propiedades de la carpeta =========\n");

BasicFileAttributes attrs = Files.readAttributes(miCarpeta.toPath(), BasicFileAttributes.class);

String nombreCarpeta = miCarpeta.getName();
String rutaRaiz = miCarpeta.getParent();
String rutaAbsoluta = miCarpeta.getAbsolutePath();

int cantArchivos = AdminDeArchivos.contarEntradas(miCarpeta, false);
int cantSubCarpetas = AdminDeArchivos.contarEntradas(miCarpeta, true);

long tamañoEnBytes = AdminDeArchivos.obtenerTamañoCarpeta(miCarpeta);
String tamaño = AdminDeArchivos.obtenerTamañoReal(tamañoEnBytes);

FileTime fechaCreacion = attrs.creationTime();
FileTime ultimoAcceso = attrs.lastAccessTime();
FileTime ultimaMod = attrs.lastModifiedTime();

System.out.printf("Nombre: %s\n", nombreCarpeta);
System.out.printf("Ruta base: %s\n", rutaRaiz);
System.out.printf("Ruta absoluta: %s\n", rutaAbsoluta);
System.out.printf("Cantidad de archivos: %d\n", cantArchivos);
System.out.printf("Cantidad de sub-carpetas: %d\n", cantSubCarpetas);
System.out.printf("Tamaño: %s\n",  tamaño);
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