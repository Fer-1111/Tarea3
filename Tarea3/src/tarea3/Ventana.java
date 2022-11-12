package tarea3;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class Ventana extends JFrame{
    PanelPrincipal objeto = new PanelPrincipal();
    public Ventana(){
        //botones en el expendedor
            JButton boton = new JButton("c");
            boton.setBounds(517, 240,40, 30);
            JButton boton2 = new JButton("f");
            boton2.setBounds(564, 240, 40, 30);
            JButton boton3 = new JButton("s");
            boton3.setBounds(611, 240, 40, 30);
                add(boton);
                add(boton2);
                add(boton3);
                
        //monedas
            JButton moneda1 = new JButton("100");
            moneda1.setBounds(40, 100,60, 30);
            JButton moneda2 = new JButton("500");
            moneda2.setBounds(110, 100, 60, 30);
            JButton moneda3 = new JButton("1000");
            moneda3.setBounds(180, 100, 60, 30);
                add(moneda1);
                add(moneda2);
                add(moneda3);
                
         //rellenar bebidas
            JButton bebida1 = new JButton("x");
            bebida1.setBounds(308, 420,40, 30);
            JButton bebida2 = new JButton("x");
            bebida2.setBounds(378, 420, 40, 30);
            JButton bebida3 = new JButton("x");
            bebida3.setBounds(448, 420, 40, 30);
                add(bebida1);
                add(bebida2);
                add(bebida3);
                
                add(objeto);
                setSize(1000, 600);
                setLocationRelativeTo(null);
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                
                setVisible(true);
            }
            
        }