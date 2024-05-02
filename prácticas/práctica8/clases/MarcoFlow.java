package com.programación2.prácticas.práctica8.clases;

import javax.swing.*;

import com.fran_utils.InterfazGrafica.*;
import com.fran_utils.InterfazGrafica.Ventanas.*;

import java.awt.*;

//Clase impropia #4

public class MarcoFlow extends VentanaSimple
{ 
private static final long serialVersionUID = -2998270580577039942L;

static int ANCHO = 175;
static int ALTO = 100;
 
public MarcoFlow()
{
super("Mi marco");
 
setLayout( new FlowLayout() );

AdminDeComponentesGUI.agregarComponentes(this, new JLabel("Primera"), new JLabel("Segunda"),
new JLabel("Tercera"), new JLabel("Cuarta"), new JLabel("Quinta"), new JLabel("Sexta") ); 

setSize(175, 100);
setVisible(true);
} 

}