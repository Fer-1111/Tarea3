package tarea3;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Ventana extends JFrame{

    PanelPrincipal objeto = new PanelPrincipal();
    Expendedor exp = new Expendedor();
    private JButton boton;
    private JButton boton2;
    private JButton boton3;
    private JButton bebida1;
    private JButton bebida2;
    private JButton bebida3;
     private JButton boton100;
    private JButton boton500;
    private JButton boton1000;

    public Ventana() {
       
        BotonMoneda();
        BotonExpendedor();
        RellenarBebida();
        add(objeto);
        setSize(1000, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
 
    public void BotonExpendedor() {

        boton = new JButton("1");
        boton.setBounds(517, 240, 45, 35);
        boton2 = new JButton("2");
        boton2.setBounds(564, 240, 45, 35);
        boton3 = new JButton("3");
        boton3.setBounds(611, 240, 45, 35);
        add(boton);
        add(boton2);
        add(boton3);
        accionBoton0();
        accionBoton1();
        accionBoton2();
    }
    public void accionBoton0(){
        ActionListener OyendeDeAccion = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                objeto.ComprarBebida(1);
                repaint();
            }
        };
        boton.addActionListener(OyendeDeAccion);
    }
    public void accionBoton1(){
        ActionListener OyendeDeAccion2 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                objeto.ComprarBebida(2);
                repaint();
                
            }
        };
        boton2.addActionListener(OyendeDeAccion2);
    }
    public void accionBoton2(){
        ActionListener OyendeDeAccion3 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                objeto.ComprarBebida(3);
                repaint();
                
            }
        };
        boton3.addActionListener(OyendeDeAccion3);
    }
    
    public void BotonMoneda(){
        
        boton100 = new JButton("");//cien
        boton100.setBounds(40, 100, 50, 50);
        
        //boton1.addActionListener(this);
        ImageIcon imagen = new ImageIcon("C:\\Users\\ferno\\Desktop\\pruebaventana\\src\\images\\Moneda100.png");
        ImageIcon icono = new ImageIcon(imagen.getImage().getScaledInstance(boton100.getWidth(), boton100.getHeight(), Image.SCALE_SMOOTH));
       
        boton100.setIcon(icono);
        boton100.setBorder(null);
        boton100.setBorderPainted(false);
        boton100.setContentAreaFilled(false);
        boton100.setOpaque(false);

        add(boton100);
        //--------
        boton500 = new JButton("");//500
        boton500.setBounds(120, 100, 50, 50);
        
        //boton1.addActionListener(this);
        ImageIcon imagen2 = new ImageIcon("C:\\Users\\ferno\\Desktop\\pruebaventana\\src\\images\\Moneda500.png");
        ImageIcon icono2 = new ImageIcon(imagen2.getImage().getScaledInstance(boton500.getWidth(), boton500.getHeight(), Image.SCALE_SMOOTH));
       
        boton500.setIcon(icono2);
        boton500.setBorder(null);
        boton500.setBorderPainted(false);
        boton500.setContentAreaFilled(false);
        boton500.setOpaque(false);

        add(boton500);
   //--------
        boton1000 = new JButton("");//1000
        boton1000.setBounds(200, 100, 50, 50);
        
        //boton1.addActionListener(this);
        ImageIcon imagen3 = new ImageIcon("C:\\Users\\ferno\\Desktop\\pruebaventana\\src\\images\\Moneda1000.png");
        ImageIcon icono3 = new ImageIcon(imagen3.getImage().getScaledInstance(boton1000.getWidth(), boton1000.getHeight(), Image.SCALE_SMOOTH));
       
        boton1000.setIcon(icono3);
        boton1000.setBorder(null);
        boton1000.setBorderPainted(false);
        boton1000.setContentAreaFilled(false);
        boton1000.setOpaque(false);

        add(boton1000);
        
        accionBoton100();
        accionBoton500();
        accionBoton1000();
   
    }
    public void accionBoton100(){
        ActionListener click100 = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                System.out.println("click");
            }
        };
        boton100.addActionListener(click100);
    }
        public void accionBoton500(){
        ActionListener click500 = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                System.out.println("click");
            }
        };
        boton500.addActionListener(click500);
    }
        public void accionBoton1000(){
        ActionListener click1000 = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                System.out.println("click");
            }
        };
        boton1000.addActionListener(click1000);
    }
        
    public void RellenarBebida(){
        bebida1 = new JButton("x");
        bebida1.setBounds(308, 420, 40, 30);
        bebida2 = new JButton("x");
        bebida2.setBounds(378, 420, 40, 30);
        bebida3 = new JButton("x");
        bebida3.setBounds(448, 420, 40, 30);
        add(bebida1);
        add(bebida2);
        add(bebida3);
        RellenarCoca();
        RellenarSprite();
        RellenarFanta();
        
    }
    public void RellenarCoca(){
        ActionListener OyendeDeAccion = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                objeto.BebidaCoca();
                repaint();
            }
        };
        bebida1.addActionListener(OyendeDeAccion);
    }
    public void RellenarSprite(){
        ActionListener OyendeDeAccion = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                objeto.BebidaSprite();
                repaint();
            }
        };
        bebida2.addActionListener(OyendeDeAccion);
    }
    public void RellenarFanta(){
        ActionListener OyendeDeAccion = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                objeto.BebidaFanta();
                repaint();
            }
        };
        bebida3.addActionListener(OyendeDeAccion);
    }
   
}