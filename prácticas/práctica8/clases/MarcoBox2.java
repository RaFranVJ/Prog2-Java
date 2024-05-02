package com.programación2.prácticas.práctica8.clases;

import java.awt.*;
import javax.swing.*;

import com.fran_utils.InterfazGrafica.AdminDeComponentesGUI;
import com.fran_utils.InterfazGrafica.Ventanas.*;

//Clase impropia #7

public class MarcoBox2 extends VentanaSimple
{ 
private static final long serialVersionUID = -6309268465517060256L;

static int ANCHO = 275;
static int ALTO = 175;

public MarcoBox2()
{ 
super("Mi marco");

JButton b1 = new JButton("Boton 1");
JButton b2 = new JButton("Boton 2");
JButton b3 = new JButton("Boton 3");
JButton b4 = new JButton("Boton 4");
JButton b5 = new JButton("Boton 5");
JButton b6 = new JButton("Boton 6");
	 
Box cajaH = Box.createHorizontalBox(); // método factoría

// separacion vertical, 10 pixeles
AdminDeComponentesGUI.agregarComponentes(cajaH, 10, b1, b2);

//zona rígida, separación horizontal 
AdminDeComponentesGUI.agregarComponentes(cajaH, Box.createRigidArea( new Dimension(5,5) ), b3); 

add(cajaH, BorderLayout.NORTH);

Box cajaV = Box.createVerticalBox();

AdminDeComponentesGUI.agregarComponentes(cajaV, Box.createHorizontalStrut(70), b4);

// separación horizontal 10 pixeles
AdminDeComponentesGUI.agregarComponentes(cajaV, Box.createVerticalStrut(10), b5);

AdminDeComponentesGUI.agregarComponentes(cajaV, Box.createRigidArea( new Dimension(5,5) ), b6);

add(cajaV, BorderLayout.CENTER);
 
setSize(ANCHO, ALTO);
setVisible(true);
}

}