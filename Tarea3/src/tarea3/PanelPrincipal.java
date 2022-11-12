package tarea3;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelPrincipal extends JPanel{
    public PanelPrincipal(){
        
    }
    public void paint(Graphics g){
        super.paint(g);
        ImageIcon Fondo = new ImageIcon(getClass().getResource("/images/fondo.jpg"));
        g.drawImage(Fondo.getImage(), 0, 0, 1000,600,this);
        Expendedor exp = new Expendedor();
        exp.paint(g);
        Comprador com = new Comprador();
        com.paint(g);
        //Moneda1000.paint(g);
        //super.paint(g);
        //com.paint(g);
        //exp.paint(g);
        /*
        
        */   
    }
}