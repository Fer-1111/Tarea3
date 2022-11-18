package tarea3;

import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class PanelPrincipal extends JPanel{
    private final Expendedor exp;
    private final Comprador com;
    private Moneda M1000;
    private Moneda M500;
    private Moneda M100;
    
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
                if(M1000 != null && M500 == null && M100 == null){
                    exp.comprarBebida(CrearMoneda1000(M1000),1); 
                }
                else if(M1000 == null && M500 != null && M100 == null){
                    exp.comprarBebida(CrearMoneda500(M500),1);
                }
                else if(M1000 == null && M500 == null && M100 != null){
                    exp.comprarBebida(CrearMoneda100(M100),1);
                }
            } 
            catch(PagoIncorrectoException ex){
                System.out.println("error: "+ex.getMessage());
            }
            catch(PagoInsuficienteException ex){
                System.out.println("error: "+ex.getMessage());
            }
            catch(NoHayBebidaException ex){
                System.out.println("error: "+ex.getMessage());
            }
            finally{
                M100 = null;
                M500 = null;
                M1000 = null;
                System.out.println("error, estas intentando comprar sin dinero");
            }
        }
        if(cualBebida == 2){
            try{
                if(M1000 != null && M500 == null && M100 == null){
                    exp.comprarBebida(CrearMoneda1000(M1000),2); 
                }
                else if(M1000 == null && M500 != null && M100 == null){
                    exp.comprarBebida(CrearMoneda500(M500),2);
                }
                else if(M1000 == null && M500 == null && M100 != null){
                    exp.comprarBebida(CrearMoneda100(M100),2);
                }
            } 
            catch(PagoIncorrectoException ex){
                System.out.println("error: "+ex.getMessage());
            }
            catch(PagoInsuficienteException ex){
                System.out.println("error: "+ex.getMessage());
            }
            catch(NoHayBebidaException ex){
                System.out.println("error: "+ex.getMessage());
            }
            finally{
                M100 = null;
                M500 = null;
                M1000 = null;
                System.out.println("error, estas intentando comprar sin dinero");
            }
        }
        if(cualBebida == 3){
            try{
                if(M1000 != null && M500 == null && M100 == null){
                    exp.comprarBebida(CrearMoneda1000(M1000),3); 
                }
                else if(M1000 == null && M500 != null && M100 == null){
                    exp.comprarBebida(CrearMoneda500(M500),3);
                }
                else if(M1000 == null && M500 == null && M100 != null){
                    exp.comprarBebida(CrearMoneda100(M100),3);
                }
            } 
            catch(PagoIncorrectoException ex){
                System.out.println("error: "+ex.getMessage());
            }
            catch(PagoInsuficienteException ex){
                System.out.println("error: "+ex.getMessage());
            }
            catch(NoHayBebidaException ex){
                System.out.println("error: "+ex.getMessage());
            }
            finally{
                M100 = null;
                M500 = null;
                M1000 = null;
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
    public Moneda CrearMoneda1000(Moneda M){
        if(M != null){
            return M1000 = new Moneda1000(1);
        }
        return null;
    }
    public Moneda CrearMoneda500(Moneda M){
        if(M != null){
            return M500 = new Moneda500(1);
        }
        return null;
    }
    public Moneda CrearMoneda100(Moneda M){
        if(M != null){
            return M100 = new Moneda100(1);
        }
        return null;
    }
         
}