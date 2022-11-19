package tarea3;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public final class Ventana extends JFrame{

    PanelPrincipal objeto = new PanelPrincipal();
    
    private JButton sacarBebida;
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
        BotonesExpendedor();
        RellenarBebida();
        TomarBebida();
        add(objeto);
        setSize(1000, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public void TomarBebida(){
        sacarBebida = new JButton("tomar bebida");
        sacarBebida.setBounds(770, 430, 120, 35);
        sacarBebida.setOpaque(false);
        add(sacarBebida);
        botonTomarBebida();
    }
    public void botonTomarBebida(){
        ActionListener OyendeDeAccion = (ActionEvent e) -> {
            objeto.TomarBebida();
            repaint();
        };
        sacarBebida.addActionListener(OyendeDeAccion);
    }
    public void BotonesExpendedor() {

        boton = new JButton("");
        boton.setBounds(517, 240, 45, 35);
        ImageIcon imagen6 = new ImageIcon("C:\\Users\\Sergio Opazo Z\\OneDrive\\Escritorio\\copy\\Tarea3\\src\\images\\1.png");
        ImageIcon icono6 = new ImageIcon(imagen6.getImage().getScaledInstance(boton.getWidth(), boton.getHeight(), Image.SCALE_SMOOTH));
       
        boton.setIcon(icono6);
        boton.setBorder(null);
        boton.setBorderPainted(false);
        boton.setContentAreaFilled(false);
        boton.setOpaque(false);
        
        boton2 = new JButton("");
        boton2.setBounds(564, 240, 45, 35);
        ImageIcon imagen7 = new ImageIcon("C:\\Users\\Sergio Opazo Z\\OneDrive\\Escritorio\\copy\\Tarea3\\src\\images\\2.png");
        ImageIcon icono7 = new ImageIcon(imagen7.getImage().getScaledInstance(boton2.getWidth(), boton2.getHeight(), Image.SCALE_SMOOTH));
       
        boton2.setIcon(icono7);
        boton2.setBorder(null);
        boton2.setBorderPainted(false);
        boton2.setContentAreaFilled(false);
        boton2.setOpaque(false);
        
        
        boton3 = new JButton("");
        boton3.setBounds(611, 240, 45, 35);
        ImageIcon imagen8 = new ImageIcon("C:\\Users\\Sergio Opazo Z\\OneDrive\\Escritorio\\copy\\Tarea3\\src\\images\\3.png");
        ImageIcon icono8 = new ImageIcon(imagen8.getImage().getScaledInstance(boton3.getWidth(), boton3.getHeight(), Image.SCALE_SMOOTH));
       
        boton3.setIcon(icono8);
        boton3.setBorder(null);
        boton3.setBorderPainted(false);
        boton3.setContentAreaFilled(false);
        boton3.setOpaque(false);
        
        
        add(boton);
        add(boton2);
        add(boton3);
        botonComprarCoca();
        botonComprarSprite();
        botonComprarFanta();
    }
    public void botonComprarCoca(){
        ActionListener OyendeDeAccion = (ActionEvent e) -> {
            objeto.ComprarBebida(1);
            repaint();
        };
        boton.addActionListener(OyendeDeAccion);
    }
    public void botonComprarSprite(){
        ActionListener OyendeDeAccion2 = (ActionEvent e) -> {
            objeto.ComprarBebida(2);
            repaint();
        };
        boton2.addActionListener(OyendeDeAccion2);
    }
    public void botonComprarFanta(){
        ActionListener OyendeDeAccion3 = (ActionEvent e) -> {
            objeto.ComprarBebida(3);
            repaint();
        };
        boton3.addActionListener(OyendeDeAccion3);
    }
    public void alExpendedorMoneda1000(){
        ActionListener OyendeDeMoneda = (ActionEvent e) -> {
            objeto.CrearMoneda1000(new Moneda1000(1));
            System.out.println("se creo la moneda de 1000");
            repaint();
        };
        boton1000.addActionListener(OyendeDeMoneda);
    }
    public void alExpendedorMoneda500(){
        ActionListener OyendeDeMoneda500 = (ActionEvent e) -> {
            Moneda500 m = new Moneda500(1);
            objeto.CrearMoneda500(m);
            System.out.println("se creo la moneda de 500");
            repaint();
        };
        boton500.addActionListener(OyendeDeMoneda500);
    }
    public void alExpendedorMoneda100(){
        ActionListener OyendeDeMoneda100 = (ActionEvent e) -> {
            objeto.CrearMoneda100(new Moneda100(1));
            System.out.println("se creo la moneda de 100");
            repaint();
        };
        boton100.addActionListener(OyendeDeMoneda100);
    }
    public void BotonMoneda(){
        
        boton100 = new JButton("");
        boton100.setBounds(40, 100, 50, 50);
        ImageIcon imagen = new ImageIcon("C:\\Users\\Sergio Opazo Z\\OneDrive\\Escritorio\\copy\\Tarea3\\src\\images\\Moneda100.png");
        ImageIcon icono = new ImageIcon(imagen.getImage().getScaledInstance(boton100.getWidth(), boton100.getHeight(), Image.SCALE_SMOOTH));
       
        boton100.setIcon(icono);
        boton100.setBorder(null);
        boton100.setBorderPainted(false);
        boton100.setContentAreaFilled(false);
        boton100.setOpaque(false);

        add(boton100);
        
        boton500 = new JButton("");
        boton500.setBounds(120, 100, 50, 50);
        ImageIcon imagen2 = new ImageIcon("C:\\Users\\Sergio Opazo Z\\OneDrive\\Escritorio\\copy\\Tarea3\\src\\images\\Moneda500.png");
        ImageIcon icono2 = new ImageIcon(imagen2.getImage().getScaledInstance(boton500.getWidth(), boton500.getHeight(), Image.SCALE_SMOOTH));
       
        boton500.setIcon(icono2);
        boton500.setBorder(null);
        boton500.setBorderPainted(false);
        boton500.setContentAreaFilled(false);
        boton500.setOpaque(false);

        add(boton500);
        
        boton1000 = new JButton("");
        boton1000.setBounds(200, 100, 50, 50);
        
        ImageIcon imagen3 = new ImageIcon("C:\\Users\\Sergio Opazo Z\\OneDrive\\Escritorio\\copy\\Tarea3\\src\\images\\Moneda1000.png");
        ImageIcon icono3 = new ImageIcon(imagen3.getImage().getScaledInstance(boton1000.getWidth(), boton1000.getHeight(), Image.SCALE_SMOOTH));
       
        boton1000.setIcon(icono3);
        boton1000.setBorder(null);
        boton1000.setBorderPainted(false);
        boton1000.setContentAreaFilled(false);
        boton1000.setOpaque(false);
        alExpendedorMoneda1000();
        alExpendedorMoneda500();
        alExpendedorMoneda100();
        add(boton1000);
   
    }
    public void RellenarBebida(){
        bebida1 = new JButton("");
        bebida1.setBounds(308, 420, 40, 30);
        ImageIcon imagen3 = new ImageIcon("C:\\Users\\Sergio Opazo Z\\OneDrive\\Escritorio\\copy\\Tarea3\\src\\images\\LlenarCoca.jpg");
        ImageIcon icono3 = new ImageIcon(imagen3.getImage().getScaledInstance(bebida1.getWidth(), bebida1.getHeight(), Image.SCALE_SMOOTH));
       
        bebida1.setIcon(icono3);
        bebida1.setBorder(null);
        bebida1.setBorderPainted(false);
        bebida1.setContentAreaFilled(false);
        bebida1.setOpaque(false);
        
        bebida2 = new JButton("");
        bebida2.setBounds(378, 420, 40, 30);
        ImageIcon imagen4 = new ImageIcon("C:\\Users\\Sergio Opazo Z\\OneDrive\\Escritorio\\copy\\Tarea3\\src\\images\\LlenarSprite.jpeg");
        ImageIcon icono4 = new ImageIcon(imagen4.getImage().getScaledInstance(bebida2.getWidth(), bebida2.getHeight(), Image.SCALE_SMOOTH));
       
        bebida2.setIcon(icono4);
        bebida2.setBorder(null);
        bebida2.setBorderPainted(false);
        bebida2.setContentAreaFilled(false);
        bebida2.setOpaque(false);
        
        bebida3 = new JButton("");
        bebida3.setBounds(448, 420, 40, 30);
        ImageIcon imagen5 = new ImageIcon("C:\\Users\\Sergio Opazo Z\\OneDrive\\Escritorio\\copy\\Tarea3\\src\\images\\LlenarFanta.png");
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
        ActionListener OyendeDeAccion = (ActionEvent e) -> {
            objeto.BebidaCoca();
            repaint();
        };
        bebida1.addActionListener(OyendeDeAccion);
    }
    public void RellenarSprite(){
        ActionListener OyendeDeAccion = (ActionEvent e) -> {
            objeto.BebidaSprite();
            repaint();
        };
        bebida2.addActionListener(OyendeDeAccion);
    }
    public void RellenarFanta(){
        ActionListener OyendeDeAccion = (ActionEvent e) -> {
            objeto.BebidaFanta();
            repaint();
        };
        bebida3.addActionListener(OyendeDeAccion);
    }
}