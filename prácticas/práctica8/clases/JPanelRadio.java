package com.programación2.prácticas.práctica8.clases;

import javax.swing.*;
import com.fran_utils.InterfazGrafica.Paneles.*;
import java.awt.*;

//Clase impropia #9

public class JPanelRadio extends PanelSimple
{ 
private static final long serialVersionUID = 4436163386497889884L;

private ButtonGroup grb;

private JRadioButton jr1, jr2, jr3;
	 
public JPanelRadio()
{
grb = new ButtonGroup();

setLayout( new GridLayout(4,1) );

add( new JLabel(" Selección excluyente") );

// se crea botón de radio, se añade al panel y a la agrupación

jr1 = new JRadioButton("Avión", false);
add(jr1);

grb.add(jr1);

// se crea botón de radio, se añade al panel y a la agrupación

jr2 = new JRadioButton("Tren", false);
add(jr2);

grb.add(jr2);

// se crea botón de radio, se añade al panel y a la agrupación

jr3 = new JRadioButton("Coche", false);
add(jr3);
	 
grb.add(jr3);
}

}