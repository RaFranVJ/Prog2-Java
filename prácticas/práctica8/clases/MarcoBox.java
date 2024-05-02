package com.programación2.prácticas.práctica8.clases;

import javax.swing.*;

import com.fran_utils.InterfazGrafica.*;
import com.fran_utils.InterfazGrafica.Paneles.*;
import com.fran_utils.InterfazGrafica.Ventanas.*;

//Clase impropia #6

public class MarcoBox extends VentanaSimple
{ 
private static final long serialVersionUID = 3234725730276955310L;

public MarcoBox()
{ 
super("Mi marco");

PanelGrafico panel = new PanelGrafico() ;

panel.setLayout( new BoxLayout(panel, BoxLayout.Y_AXIS) );

AdminDeComponentesGUI.agregarComponentes( panel, new JLabel("Primera"), new JLabel("Segunda"), new JLabel("Tercera"),
new JLabel("Tercera"), new JLabel("Cuarta"),  new JLabel("Quinta"), new JLabel("Sexta") );

add(panel); 

setSize(175, 150);
}

}