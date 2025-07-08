// L I B R E R I A S
import javax.swing.*;
import java.awt.event.*;

public class Evaluacion extends JFrame{
    private JButton btnTijera, btnPiedra, btnPapel, btnSalir;
    private int cont;
    
    public Evaluacion(){
        // Caracteristicas de la ventana
        setTitle("Piedra, Papel o Tijera");
        setSize(480, 600);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        crearBotones();
    }
    
    public void crearBotones(){
        btnTijera = new JButton("TIJERA");
        btnTijera.setBounds(30, 450, 90, 30);
        add(btnTijera);
        
        btnPiedra = new JButton("PIEDRA");
        btnPiedra.setBounds(135, 450, 90, 30);
        add(btnPiedra);
        
        btnPapel = new JButton("PAPEL");
        btnPapel.setBounds(235, 450, 90, 30);
        add(btnPapel);
        
        btnSalir = new JButton("FINALIZAR");
        btnSalir.setBounds(340, 450, 100, 30);
        add(btnSalir);
    }
}
