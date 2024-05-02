package com.programación2.prácticas.práctica6.ejercicios;

import java.util.*;
import com.fran_utils.ConsolaGenerica.*;

import com.programación2.Ejercicio;
import com.programación2.prácticas.práctica6.clases.*;

// Ejercicio propio #4

public class Factura extends Ejercicio
{

public Factura()
{
id = 4;
nombre = "Factura de varios productos";

esPropio = true;
}

// Registrar producto

private Producto registrarProd(int i, int q, Scanner lector)
{
System.out.printf("=========== Entrada #%d de %d ==========\n\n", i+1, q);

Producto nuevoProd = new Producto();

String desc = EntradaDatos.leerValor(lector, "Ingresa el nombre del producto", String.class);
double precio = EntradaDatos.leerValor(lector, "Introduce su precio", double.class);
int cant = EntradaDatos.leerValor(lector, "Introduce la cantidad comprada", int.class);

nuevoProd.asignarDatos(desc, precio, cant);

System.out.println();

return nuevoProd;
}

// Mostrar datos de la factura

private void mostrarDatos(ArrayList<Producto> productos)
{
System.out.println("=========== SU FACTURA ==========\n\n");

double total = 0.0;

for(Producto producto : productos)
{
System.out.printf("%s\n", producto);

total += producto.getPrecio() * producto.obtenerCant();
}

System.out.println();

System.out.printf("Total de la compra: %.2f RD$\n", total);
}

@Override

public void ejecutar(Scanner lector)
{
int q = EntradaDatos.leerValor(lector, "Ingresa la cantidad de productos", int.class);

ArrayList<Producto> listaProds = new ArrayList<>(q);

// Procesar cada producto

for(int i = 0; i < q; i++)
{
Producto prod = registrarProd(i, q, lector);
listaProds.add(prod);
}

mostrarDatos(listaProds);
}

}