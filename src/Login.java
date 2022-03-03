import jdk.nashorn.internal.runtime.regexp.joni.exception.ErrorMessages;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JOptionPane;
public class Login extends JFrame{
    public JPanel panel;
    public JTextField texto;
    public JPasswordField texto1;
    int i=0;
    public Login(){
    this.setTitle("                                                                Login");
    this.setSize(500,500);
    this.setLocationRelativeTo(null);
    paneles();
    this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    this.setVisible(true);


}


    public void paneles() {
        panel = new JPanel();
        panel.setBackground(Color.white);
        this.getContentPane().add(panel);
        panel.setLayout(null);
    etiquetas();
    botones();
    textos();

    }

    public void etiquetas() {
        //etiqueta con imagen
        JLabel etiqueta0= new JLabel();
        etiqueta0.setHorizontalAlignment(SwingConstants.CENTER);
        etiqueta0.setBounds(180,50,140,140);
        etiqueta0.setOpaque(true);
        ImageIcon usuario= new ImageIcon("user-profile-icon-free-vector (1).jpg");
        etiqueta0.setIcon(usuario);
        panel.add(etiqueta0);

        JLabel etiqueta1= new JLabel();
        etiqueta1.setText("Usuario  ");
        etiqueta1.setBounds(80,230,90,20);
        etiqueta1.setFont(new Font("arial", Font.PLAIN, 15));
        panel.add(etiqueta1);

        JLabel etiqueta2= new JLabel();
        etiqueta2.setText("Contraseña  ");
        etiqueta2.setBounds(80,280,90,20);
        etiqueta2.setFont(new Font("arial", Font.PLAIN, 15));
        panel.add(etiqueta2);

    }


    public void textos(){
        texto= new JTextField();
        texto.setBounds(180,230,150,20);
        panel.add(texto);

        texto1= new JPasswordField();
        texto1.setBounds(180,280,150,20);
        panel.add(texto1);

    }

    public void botones() {
        JButton boton= new JButton();
        boton.setEnabled(true);
        boton.setText("Ingresar");
        boton.setBounds(100,380,100,25);
        boton.setBackground(new Color(215, 219, 221));
        boton.setFont(new Font("Georgia",Font.PLAIN,12));
        panel.add(boton);
        // BOTON 2

        JButton boton1= new JButton();
        boton1.setEnabled(true);
        boton1.setText("Cancelar");
        boton1.setBounds(280,380,100,25);
        boton1.setBackground(new Color(215, 219, 221));
        boton1.setFont(new Font("Georgia",Font.PLAIN,12));
        panel.add(boton1);

        ActionListener oyente = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
               if (texto.getText().equals("admin")&& texto1.getText().equals("password")){
Admin x= new Admin();
x.setVisible(true);
dispose();
               } else {
                   JOptionPane.showMessageDialog(null, "Credenciales inválidas intentelo nuevamente",
                           "ERROR", JOptionPane.WARNING_MESSAGE);
                   texto.setText(null);
                   texto1.setText(null);
               }
            }
        };
        boton.addActionListener(oyente);


        ActionListener oyente2= new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Inicio regreso= new Inicio();
                regreso.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                regreso.setVisible(true);
                dispose();
            }
        };
        boton1.addActionListener(oyente2);
    }
}
