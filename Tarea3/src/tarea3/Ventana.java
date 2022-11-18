package tarea3;

import java.awt.Graphics;
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

        boton = new JButton("");
        boton.setBounds(517, 240, 45, 35);
        ImageIcon imagen6 = new ImageIcon("C:\\Users\\jorge\\Desktop\\Tarea3\\Tarea3\\src\\images\\1.png");
        ImageIcon icono6 = new ImageIcon(imagen6.getImage().getScaledInstance(boton.getWidth(), boton.getHeight(), Image.SCALE_SMOOTH));
       
        boton.setIcon(icono6);
        boton.setBorder(null);
        boton.setBorderPainted(false);
        boton.setContentAreaFilled(false);
        boton.setOpaque(false);
        
        boton2 = new JButton("");
        boton2.setBounds(564, 240, 45, 35);
        ImageIcon imagen7 = new ImageIcon("C:\\Users\\jorge\\Desktop\\Tarea3\\Tarea3\\src\\images\\2.png");
        ImageIcon icono7 = new ImageIcon(imagen7.getImage().getScaledInstance(boton2.getWidth(), boton2.getHeight(), Image.SCALE_SMOOTH));
       
        boton2.setIcon(icono7);
        boton2.setBorder(null);
        boton2.setBorderPainted(false);
        boton2.setContentAreaFilled(false);
        boton2.setOpaque(false);
        
        
        boton3 = new JButton("");
        boton3.setBounds(611, 240, 45, 35);
        ImageIcon imagen8 = new ImageIcon("C:\\Users\\jorge\\Desktop\\Tarea3\\Tarea3\\src\\images\\3.png");
        ImageIcon icono8 = new ImageIcon(imagen8.getImage().getScaledInstance(boton3.getWidth(), boton3.getHeight(), Image.SCALE_SMOOTH));
       
        boton3.setIcon(icono8);
        boton3.setBorder(null);
        boton3.setBorderPainted(false);
        boton3.setContentAreaFilled(false);
        boton3.setOpaque(false);
        
        
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
        
        JButton boton1 = new JButton("");//cien
        boton1.setBounds(40, 100, 50, 50);
        
        //boton1.addActionListener(this);
        ImageIcon imagen = new ImageIcon("C:\\Users\\jorge\\Desktop\\Tarea3\\Tarea3\\src\\images\\Moneda100.png");
        ImageIcon icono = new ImageIcon(imagen.getImage().getScaledInstance(boton1.getWidth(), boton1.getHeight(), Image.SCALE_SMOOTH));
       
        boton1.setIcon(icono);
        boton1.setBorder(null);
        boton1.setBorderPainted(false);
        boton1.setContentAreaFilled(false);
        boton1.setOpaque(false);

        add(boton1);
        //--------
        JButton boton2 = new JButton("");//cien
        boton2.setBounds(120, 100, 50, 50);
        
        //boton1.addActionListener(this);
        ImageIcon imagen2 = new ImageIcon("C:\\Users\\jorge\\Desktop\\Tarea3\\Tarea3\\src\\images\\Moneda500.png");
        ImageIcon icono2 = new ImageIcon(imagen2.getImage().getScaledInstance(boton1.getWidth(), boton1.getHeight(), Image.SCALE_SMOOTH));
       
        boton2.setIcon(icono2);
        boton2.setBorder(null);
        boton2.setBorderPainted(false);
        boton2.setContentAreaFilled(false);
        boton2.setOpaque(false);

        add(boton2);
   //--------
        JButton boton3 = new JButton("");//cien
        boton3.setBounds(200, 100, 50, 50);
        
        //boton1.addActionListener(this);
        ImageIcon imagen3 = new ImageIcon("C:\\Users\\jorge\\Desktop\\Tarea3\\Tarea3\\src\\images\\Moneda1000.png");
        ImageIcon icono3 = new ImageIcon(imagen3.getImage().getScaledInstance(boton1.getWidth(), boton1.getHeight(), Image.SCALE_SMOOTH));
       
        boton3.setIcon(icono3);
        boton3.setBorder(null);
        boton3.setBorderPainted(false);
        boton3.setContentAreaFilled(false);
        boton3.setOpaque(false);

        add(boton3);
   
    }
    public void RellenarBebida(){
        bebida1 = new JButton("");
        bebida1.setBounds(308, 420, 40, 30);
        ImageIcon imagen3 = new ImageIcon("C:\\Users\\jorge\\Desktop\\Tarea3\\Tarea3\\src\\images\\LlenarCoca.jpg");
        ImageIcon icono3 = new ImageIcon(imagen3.getImage().getScaledInstance(bebida1.getWidth(), bebida1.getHeight(), Image.SCALE_SMOOTH));
       
        bebida1.setIcon(icono3);
        bebida1.setBorder(null);
        bebida1.setBorderPainted(false);
        bebida1.setContentAreaFilled(false);
        bebida1.setOpaque(false);
        
        bebida2 = new JButton("");
        bebida2.setBounds(378, 420, 40, 30);
        ImageIcon imagen4 = new ImageIcon("C:\\Users\\jorge\\Desktop\\Tarea3\\Tarea3\\src\\images\\LLenarSprite.jpeg");
        ImageIcon icono4 = new ImageIcon(imagen4.getImage().getScaledInstance(bebida2.getWidth(), bebida2.getHeight(), Image.SCALE_SMOOTH));
       
        bebida2.setIcon(icono4);
        bebida2.setBorder(null);
        bebida2.setBorderPainted(false);
        bebida2.setContentAreaFilled(false);
        bebida2.setOpaque(false);
        
        bebida3 = new JButton("");
        bebida3.setBounds(448, 420, 40, 30);
        ImageIcon imagen5 = new ImageIcon("C:\\Users\\jorge\\Desktop\\Tarea3\\Tarea3\\src\\images\\LLenarFanta.png");
        ImageIcon icono5 = new ImageIcon(imagen5.getImage().getScaledInstance(bebida3.getWidth(), bebida3.getHeight(), Image.SCALE_SMOOTH));
       
        bebida3.setIcon(icono5);
        bebida3.setBorder(null);
        bebida3.setBorderPainted(false);
        bebida3.setContentAreaFilled(false);
        bebida3.setOpaque(false);
        
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