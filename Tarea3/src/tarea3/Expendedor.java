package tarea3;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

class Expendedor extends JPanel{
    public void paint(Graphics g){
        super.paint(g);
        ImageIcon ExpendedorImagen = new ImageIcon(getClass().getResource("/images/Expendedor.png"));
        g.drawImage(ExpendedorImagen.getImage(), 280, 20, 380,530,this);
    }  
}
