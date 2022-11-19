package tarea3;

import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

class Expendedor extends JPanel{
    public Deposito coca;
    public Deposito sprite;
    public Deposito fanta;
    private int vuelto;
    private final int precio;
    private int saca;
    private int serieMoneda;
    private int serieBebida;
    private int bebidaComprada;

    public Expendedor(){
        coca = new Deposito();
        sprite = new Deposito();
        fanta = new Deposito();
        precio = 900;
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
         
        if(saca == 1 && bebidaComprada == 1){
            getBebidaExp(bebidaComprada).paint(g, 6);
            repaint();
        }
        if(saca == 1 && bebidaComprada == 2){
            getBebidaExp(bebidaComprada).paint(g, 6);
            repaint();
        }
        if(saca == 1 && bebidaComprada == 3){
            getBebidaExp(bebidaComprada).paint(g, 6);
            repaint();
        }
        if(saca == 0){
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
                getBebidaExp(1);
                saca = 1;
            }
            if (cualBebida == 2) {
                sprite.getBebida();
                getBebidaExp(2);
                saca = 1;
            }
            if (cualBebida == 3) {
                fanta.getBebida();
                getBebidaExp(3);
                saca = 1;
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
        serieMoneda++;
        if(vuelto == 0){
            return null;
        }
        else{
            Moneda m = new Moneda100(100+serieMoneda);
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
        return 0;
    }
    public int cantMonedas100(){
        return vuelto/100;
    }
    public int vueltoCliente(){
        return vuelto;
    }
    public Bebida getBebidaExp(int cualBebida){
        serieBebida++;
        switch (cualBebida) {
            case 1 -> {
                bebidaComprada = 1;
                Bebida a = new CocaCola(100+serieBebida);
                return a;
            }
            case 2 -> {
                bebidaComprada = 2;
                Bebida b = new Sprite(200+serieBebida);
                return b;
            }
            case 3 -> {
                bebidaComprada = 3;
                Bebida c = new Fanta(300+serieBebida);
                return c;
            }
            default -> {
            }
        }
        return null;
    }
}