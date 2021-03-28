package project;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class LEAP_YEAR extends JFrame implements ActionListener
{
	LEAP_YEAR() 
	{
	   getContentPane().setBackground(Color.DARK_GRAY);
//-------------------------------------------------------------------------------------	   
	   JLabel l = new JLabel();
	   l.setIcon(new ImageIcon("PROGRAM_IMG\\LEAP_YEAR_LEAPYEAR.PNG"));
	   l.setBounds(10, -15, 800, 800); 
	   getContentPane().add(l);
	
	   setSize(700,800);   // WIDTH, HEIGHT
	   getContentPane().setLayout(null);
	   setVisible(true);
	}	
//---------------------------------------------------------------------------------	
    public void actionPerformed(ActionEvent arg0) {}

    public static void main(String[] args) 
	{
	   new LEAP_YEAR();
	}
	
}