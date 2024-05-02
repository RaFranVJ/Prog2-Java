package com.programación2.prácticas.práctica8.clases;

import javax.swing.*;
import java.awt.*;

//Clase impropia #10

public class JPanelCombo extends JPanel
{ 
private static final long serialVersionUID = 5559063979852447247L;

private JComboBox<String> jcb;

public JPanelCombo()
{ 
jcb = new JComboBox<String>();
	 
setLayout( new BorderLayout() );

jcb.addItem("MAD - BCN"); 
jcb.addItem("MAD - AGP");
jcb.addItem("MAD - XRY");
jcb.addItem("BRU - TFN"); 
jcb.addItem("LEN - BCN");
jcb.addItem("ROM - BCN");

jcb.setMaximumRowCount(4);

add(jcb, BorderLayout.NORTH);
} 

}