// L I B R E R I A S

import javax.swing.*;
import java.awt.event.*;


public class Evaluacion extends JFrame{
    private Opcion usuario;
    private int cont, V, D , E;
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
        
        lblCont = new JLabel("Contador: V = 0" +" D = 0" +" E =  0");
        lblCont.setBounds(160, 90, 500, 30);
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
               evaluarJugada();
               actualizarEtiqueta();
           }
       });
       
        
        btnPiedra = new JButton("PIEDRA");
        btnPiedra.setBounds(135, 450, 90, 30);
        add(btnPiedra);
        btnPiedra.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                usuario.setOpcion(2);
                evaluarJugada();
                actualizarEtiqueta();
            }
        }); 
        
        btnPapel = new JButton("PAPEL");
        btnPapel.setBounds(235, 450, 90, 30);
        add(btnPapel);
        btnPapel.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                usuario.setOpcion(3);
                evaluarJugada();
                actualizarEtiqueta();
            }
        });
        
        btnSalir = new JButton("FINALIZAR");
        btnSalir.setBounds(340, 450, 100, 30);
        add(btnSalir);
        btnSalir.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.exit(0);
            }
        });
    }
    
    public void evaluarJugada(){
        // Variable que guarda la jugada de la pc
        int jugPc = (int)(Math.random()*3)+1;
        
        // Jugada de la pc
        if(jugPc==1){
            JOptionPane.showMessageDialog(null, "Jugada de la PC: Tijera");
        } else if(jugPc==2){
            JOptionPane.showMessageDialog(null, "Jugada de la PC: Piedra");
        } else{
            JOptionPane.showMessageDialog(null, "Jugada de la PC: Papel");
        }
        
        // Evaluacion de la jugada de la pc y el usuario
        if(usuario.getOpcion() == jugPc){
            E++;
            JOptionPane.showMessageDialog(null, "Empate");
        } else if((usuario.getOpcion()==1 && jugPc==3) || 
                  (usuario.getOpcion()==2 && jugPc==1) ||
                  (usuario.getOpcion()==3 && jugPc==2)){
            V++;
            JOptionPane.showMessageDialog(null, "Victoria");
        } else{
            D++;
            JOptionPane.showMessageDialog(null, "Derrota");
        }   
    }
    
    public void actualizarEtiqueta(){
            lblCont.setText("Contador: V = " + V +" D = "+D +" E = "+E);
    }
    
}
