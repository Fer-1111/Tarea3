package tarea3;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

class Expendedor extends JLabel implements MouseListener{
    public Deposito coca;
    public Deposito sprite;
    public Deposito fanta;
    private int vuelto;
    private final int precio;
    private boolean saca;

    public Expendedor(){
        coca = new Deposito();
        sprite = new Deposito();
        fanta = new Deposito();
        precio = 900;
        saca = false;
        this.addMouseListener(this);
        for (int serie = 0; serie < 5; serie++) {
            coca.addBebida(new CocaCola(100 + serie));
            sprite.addBebida(new Sprite(200 + serie));
            fanta.addBebida(new Fanta(300 + serie));
        }
    }
    @Override
    public void paint(Graphics g){
        ImageIcon ExpendedorImagen = new ImageIcon(getClass().getResource("/images/Expendedor.png"));
        g.drawImage(ExpendedorImagen.getImage(), 280, 20, 380,530,this);
        coca.paint(g);
        sprite.paint(g);
        fanta.paint(g);
        if(saca == true){
            getBebida().paint(g, 6);
            repaint();
        }
    }
        public void comprarBebida(Moneda m, int cualBebida)throws PagoIncorrectoException , PagoInsuficienteException, NoHayBebidaException{
        
        if (m == null) {
            throw new PagoIncorrectoException("Error, estas intentando comprar sin dinero");
        }
        else if (m.getValor() < precio) {
            throw new PagoInsuficienteException("Error su moneda ingresada es inferior al precio");
        }
        else if(m.getValor() >= precio && coca.arrayLong()<1 && cualBebida == 1){ 
            throw new NoHayBebidaException("Error, no hay existencia de la bebida seleccionada(coca)");
        }
        
        else if(m.getValor() >= precio && sprite.arrayLong()<1 && cualBebida == 2){
            throw new NoHayBebidaException("Error, no hay existencia de la bebida seleccionada(sprite)");
        }
        
        else if(m.getValor() >= precio && fanta.arrayLong()<1 && cualBebida == 3){
            throw new NoHayBebidaException("Error, no hay existencia de la bebida seleccionada(fanta)");
        }
        else if(m.getValor()>=precio){
            vuelto=m.getValor()-precio;
            ArrayMonedas MonedasDelExp = new ArrayMonedas();
            for(int i = 0 ; i < cantMonedas100(); i++){
                MonedasDelExp.addMoneda(getVuelto());
            }
            if (cualBebida == 1) {           
                coca.getBebida();
                getBebida(1);
                saca = true;
            }
            if (cualBebida == 2) {
                sprite.getBebida();
                getBebida(2);
                saca = true;
            }
            if (cualBebida == 3) {
                fanta.getBebida();
                getBebida(3);
                saca = true;
            }
        }
    }
    public Bebida getBebida(int cualBebida){
        if(cualBebida == 1){
            Bebida b = new CocaCola(0);
            return b;
        }
        if(cualBebida == 2){
            Bebida b = new Sprite(0);
            return b;
        }
        if(cualBebida == 3){
            Bebida b = new Fanta(0);
            return b;
        }
        return null;
    }
    public Moneda getVuelto(){
        
        if(vuelto == 0){
            return null;
        }
        else{
            Moneda m = new Moneda100(200);
            return m;
        }
    }
    public int BebidaQueQueda(int i){
        switch (i) {
            case 1 -> {return coca.arrayLong();}
            case 2 -> {return sprite.arrayLong();}
            case 3 -> {return fanta.arrayLong();}
            default -> {}
        }
        System.out.println("no esta esa opcion");
        return 0;
    }
    public int cantMonedas100(){
        return vuelto/100;
    }
    public int vueltoCliente(){
        return vuelto;
    }
    public Bebida getBebida(){
        Bebida b = new CocaCola(9);
        return b;
    }
    @Override
    public void mouseClicked(MouseEvent e){
        getBebida();
        System.out.println("se hizo click aki");
        saca = false;
    }
    @Override
    public void mousePressed(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mouseExited(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}