package tarea3;

import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

class Comprador extends JPanel{
    public void paint(Graphics g){
        super.paint(g);
        ImageIcon ManoI = new ImageIcon(getClass().getResource("/images/ManoIzquierda.png"));
        g.drawImage(ManoI.getImage(), 20, 330, 250,250,this); 
        ImageIcon ManoD = new ImageIcon(getClass().getResource("/images/ManoDerecha.png"));
        g.drawImage(ManoD.getImage(), 700, 330, 250,250,this); 
    }
}
