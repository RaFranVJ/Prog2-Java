package com.programación2.prácticas.práctica6.clases;

public class Producto
{
private String descripcion;

private double precio;

private int cantidad;

public Producto()
{
descripcion = "<Nuevo producto>";
precio = 0.0;

cantidad = 0;
}

public Producto(String desc, double p, int cant)
{
descripcion = desc;
precio = p;

cantidad = cant;
}

public void asignarDatos(String desc, double p, int cant)
{
descripcion = desc;
precio = p;

cantidad = cant;
}

public String leerDesc()
{
return descripcion;
}

public void asignarDesc(String desc)
{
descripcion = desc;
}

public double getPrecio()
{
return precio;
}

public int obtenerCant()
{
return cantidad;
}

public void asignarCant(int cant)
{
cantidad = cant;
}

public String toString()
{
return String.format("%s ............ %.2f RD$ x%d", descripcion, precio, cantidad);
}

}