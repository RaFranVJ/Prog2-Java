package com.programación2.prácticas.práctica8.clases;

import javax.swing.*;
import com.fran_utils.InterfazGrafica.Ventanas.*;

import java.awt.*;

//Clase impropia #8

public class GestorDeMarcos extends VentanaSimple
{ 
private static final long serialVersionUID = 560131133550085448L;

public GestorDeMarcos()
{
JPanel pa1 = new JPanel( new FlowLayout() );
JPanel pa2 = new JPanel( new BorderLayout() );
JPanel pa3 = new JPanel();

pa3.setLayout( new BoxLayout(pa3, BoxLayout.Y_AXIS) );

// componentes del panel 1

String [] opc = { "Marea alta", "Bajamar", " Montaña" };

pa1.add( new JLabel ("Elegir", JLabel.CENTER) );
pa1.add( new JList<String>(opc) );
pa1.add( new JButton("Pulsar") );

// componentes del panel 2

JTextField j = new JTextField("Razones"); 
j.setEditable(false);

pa2.add(j,BorderLayout.WEST);
pa2.add( new JButton("Boton"), BorderLayout.EAST);

// componentes del panel 3

pa3.add( new JCheckBox("Box ",false) );
pa3.add( new JLabel ("Calendario", JLabel.CENTER) );
pa3.add( new JRadioButton("Bot Radio", true) );

// asigna layout al marco y se ponen los paneles 
	 
setLayout( new BorderLayout(10, 15) );

add(pa1,BorderLayout.NORTH);
add(pa2,BorderLayout.CENTER);
add(pa3,BorderLayout.SOUTH); 
}

}