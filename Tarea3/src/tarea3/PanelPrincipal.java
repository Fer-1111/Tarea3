package tarea3;

import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class PanelPrincipal extends JPanel{
    private final Expendedor exp;
    private final Comprador com;
    
    public PanelPrincipal(){
        exp = new Expendedor();
        com = new Comprador();
    }
    public void paint(Graphics g){
        super.paint(g);
        ImageIcon Fondo = new ImageIcon(getClass().getResource("/images/fondo.jpg"));
        g.drawImage(Fondo.getImage(), 0, 0, 1000,600,this); 
        exp.paint(g);
        com.paint(g);
        
    }
    public void ComprarBebida(int cualBebida){
        if(cualBebida == 1){
            try{
                Moneda m = new Moneda1000();
                Bebida b = exp.comprarBebida(m,1);
                System.out.println("quedan: "+exp.BebidaQueQueda(1));
            } 
            catch(PagoIncorrectoException ex){
                System.out.println("error: "+ex.getMessage());
            }
            catch(PagoInsuficienteException | NoHayBebidaException ex){
                System.out.println("error: "+ex.getMessage());
            }
        }
        if(cualBebida == 2){
            try{
                Moneda m = new Moneda1000();
                Bebida b = exp.comprarBebida(m,2);
                System.out.println("quedan: "+exp.BebidaQueQueda(2));
            } 
            catch(PagoIncorrectoException ex){
                System.out.println("error: "+ex.getMessage());
            }
            catch(PagoInsuficienteException | NoHayBebidaException ex){
                System.out.println("error: "+ex.getMessage());
            }
        }
        if(cualBebida == 3){
            try{
                Moneda m = new Moneda1000();
                Bebida b = exp.comprarBebida(m,3);
                System.out.println("quedan: "+exp.BebidaQueQueda(3));
            } 
            catch(PagoIncorrectoException ex){
                System.out.println("error: "+ex.getMessage());
            }
            catch(PagoInsuficienteException | NoHayBebidaException ex){
                System.out.println("error: "+ex.getMessage());
            }
        }
    }
         public void BebidaCoca(){         
             if(exp.coca.arrayLong()==0){
                 for (int serie = 0; serie < 5; serie++) {
                     
                     exp.coca.addBebida(new CocaCola(100 + serie));
                 }
             } 
    }
         public void BebidaSprite(){         
             if(exp.sprite.arrayLong()==0){
                 for (int serie = 0; serie < 5; serie++) {
                     
                     exp.sprite.addBebida(new Sprite(100 + serie));
                 }
             } 
    }
         public void BebidaFanta(){         
             if(exp.fanta.arrayLong()==0){
                 for (int serie = 0; serie < 5; serie++) {
                     
                     exp.fanta.addBebida(new Fanta(100 + serie));
                 }
             } 
    }
}