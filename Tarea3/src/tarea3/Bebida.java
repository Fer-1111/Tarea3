package tarea3;

import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public abstract class Bebida extends JLabel{
    private final int serie;
    public Bebida(int serie){
        this.serie = serie;
    }
    public int getSerie(){
        return serie;
    }
    public abstract String beber();
    public abstract void paint(Graphics g, int i);
}
class CocaCola extends Bebida {
    private ImageIcon coca;
    public CocaCola(int serie) {
        super(serie);
    }

    @Override
    public String beber() {
        return "coca";
    }
    @Override
    public void paint(Graphics g, int i){
        coca = new ImageIcon(getClass().getResource("/images/coca.png"));
        g.drawImage(coca.getImage(), 310, 45+i*(70), 30,50,this);
    }

}
class Sprite extends Bebida {
    private ImageIcon sprite;
    public Sprite(int serie) {
        super(serie);
    }

    @Override
    public String beber() {
        return "sprite";
    }
    @Override
    public void paint(Graphics g, int i){
        sprite = new ImageIcon(getClass().getResource("/images/sprite.png"));
        g.drawImage(sprite.getImage(), 380, 45+i*(70), 30,50,this);
    }

}
class Fanta extends Bebida {
    private ImageIcon fanta;
    public Fanta(int serie) {
        super(serie);
    }

    @Override
    public String beber() {
        return "fanta";
    }
    @Override
    public void paint(Graphics g, int i){
        fanta = new ImageIcon(getClass().getResource("/images/fanta.png"));
        g.drawImage(fanta.getImage(), 450, 45+i*(70), 30,50,this);
    }
}

