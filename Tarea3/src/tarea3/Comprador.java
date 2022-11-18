package tarea3;

import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

class Comprador extends JLabel{
    
    private String tipoBebida;
    private int cuantoVuelto;
    private int serie;
    public Comprador(){

    }
    public int cuantoVuelto(){        
        return cuantoVuelto;
    }
    public String queBebiste(){
        return tipoBebida;
    }
    public int SerieBebida(){
        return serie;
    }
    public void paint(Graphics g){
        ImageIcon ManoI = new ImageIcon(getClass().getResource("/images/ManoIzquierda.png"));
        g.drawImage(ManoI.getImage(), 20, 330, 250,250,this); 
        ImageIcon ManoD = new ImageIcon(getClass().getResource("/images/ManoDerecha.png"));
        g.drawImage(ManoD.getImage(), 700, 330, 250,250,this); 
    }
}