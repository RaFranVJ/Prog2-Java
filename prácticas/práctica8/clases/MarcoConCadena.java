package com.programación2.prácticas.práctica8.clases;

import java.awt.Font;
import com.fran_utils.InterfazGrafica.Ventanas.*;

// Clase impropia #2

public class MarcoConCadena extends VentanaConTexto2
{
private final int ANCHO = 300, ALTO = 150;

private static final long serialVersionUID = -65075353766465791L;

public MarcoConCadena(String c) 
{
setTitle(c);

setSize(ANCHO, ALTO);
setResizable(false);

asignarTexto("Courier", Font.BOLD, 14, "Bienvenido al mundo del swing", ANCHO/10, 70);
asignarLinea(ANCHO/10, 80, ANCHO/10 + 225, 80);
}

}