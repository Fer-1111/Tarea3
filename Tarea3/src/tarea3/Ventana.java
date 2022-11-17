package tarea3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
        
        JButton moneda1 = new JButton("100");
        moneda1.setBounds(40, 100, 60, 30);
        JButton moneda2 = new JButton("500");
        moneda2.setBounds(110, 100, 60, 30);
        JButton moneda3 = new JButton("1000");
        moneda3.setBounds(180, 100, 60, 30);
        add(moneda1);
        add(moneda2);
        add(moneda3);
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