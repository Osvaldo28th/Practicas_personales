// L I B R E R I A S

import javax.swing.*;
import java.awt.event.*;


public class Evaluacion extends JFrame{
    private Opcion usuario;
    private int cont;
    private JButton btnTijera, btnPiedra, btnPapel, btnSalir;
    private JLabel lblInfo, lblCont;
    
    public Evaluacion(){
        // Caracteristicas de la ventana
        setTitle("Piedra, Papel o Tijera");
        setSize(480, 600);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        usuario = new Opcion(0);
        
        lblInfo = new JLabel("Elige una opcion para jugar o salir");
        lblInfo.setBounds(140, 50, 500, 30);
        add(lblInfo);
        
        lblCont = new JLabel("Contador: V = " +" D = " +" E =  ");
        lblCont.setBounds(175, 90, 500, 30);
        add(lblCont);
        
        crearBotones();
    }
    
    public void crearBotones(){
        btnTijera = new JButton("TIJERA");
        btnTijera.setBounds(30, 450, 90, 30);
        add(btnTijera);
       // Implementar ActionListener:
       btnTijera.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent e){
               usuario.setOpcion(1);
           }
       });
       
        
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
