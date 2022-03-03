import sun.rmi.runtime.Log;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Inicio extends JFrame {

    Border border = BorderFactory.createLineBorder(Color.BLACK);
    public JPanel panel;

    public Inicio(){



this.setTitle("                                                                                    Biblioteca facultad de Ingeniería usac");
this.setSize(1000,600);
this.setLocationRelativeTo(null);
paneles();
this.setVisible(true);


this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);


    }
    public void paneles() {
        panel = new JPanel();//creación de un panel
        //panel.setBackground(Color.green); le pone color al panel
        this.getContentPane().add(panel);// se hace visible el panel
        panel.setLayout(null);//desactivar el diseño
        etiquetas();
        botones();
    }


        public void etiquetas() {
            JLabel etiqueta = new JLabel();
            etiqueta.setBounds(100, 180, 800, 150);
            ImageIcon usac = new ImageIcon("unnamed.jpg");
            etiqueta.setIcon(new ImageIcon(usac.getImage().getScaledInstance(300, 150, Image.SCALE_AREA_AVERAGING)));
            etiqueta.setFont(new Font("arial black", Font.PLAIN, 12));
            etiqueta.setText("<html><tr>Vision<tr>" +
                    "Ser la unidad de información especializada y técnica con<tr>" +
                    "estándares de Biblioteca Universitaria, en beneficio del<tr>" +
                    "desarrollo de la ciencia y tecnología del país</p></tr>");
            etiqueta.setVerticalTextPosition(SwingConstants.TOP);
            etiqueta.setIconTextGap(100);
            panel.add(etiqueta);

            //etiqueta con imagen
            JLabel etiqueta2= new JLabel();
            etiqueta2.setBounds(40,20,900,80);
            etiqueta2.setBorder(border);
            etiqueta2.setBackground(Color.darkGray);
            etiqueta2.setOpaque(true);
            ImageIcon usuario= new ImageIcon("luis.png");
            etiqueta2.setIcon(usuario);
            panel.add(etiqueta2);
            /* tipo texto
        JLabel etiqueta= new JLabel(); //crea una etiqueta
        etiqueta.setText("Hola");
        etiqueta.setHorizontalAlignment(SwingConstants.CENTER);
        etiqueta.setBounds(200,20,200,70);//tamaño del label
        etiqueta.setOpaque(true);//pintar el fondo de la etiqueta
        etiqueta.setForeground(Color.BLACK);
        //etiqueta.setBackground(Color.BLACK);
        etiqueta.setFont(new Font("arial",Font.PLAIN,50));//se establece el tipo de fuente
        etiqueta.setBorder(border);
        panel.add(etiqueta);
*/
            //etiqueta 2 tipo imagen
        /*
        JLabel etiqueta2= new JLabel();
        ImageIcon imagen= new ImageIcon("Persona_5_Phantom_Thieves.jpg");

        etiqueta2.setBounds(10,100,300,300);
        etiqueta2.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(etiqueta2.getWidth(),etiqueta2.getHeight(),Image.SCALE_SMOOTH)));
        panel.add(etiqueta2);
         */
        }

        public void botones(){
        JButton boton= new JButton();
        boton.setEnabled(true);
        boton.setText("About");
        boton.setBounds(100,450,100,40);
        panel.add(boton);
        // BOTON 2

            JButton boton2= new JButton();
            boton2.setEnabled(true);
            boton2.setText("Login");
            boton2.setBounds(800,40,100,40);
            panel.add(boton2);
            ActionListener oyente= new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    Login luis= new Login();

luis.setVisible(true);
dispose();


                }

            };
boton2.addActionListener(oyente);

        }



    }

