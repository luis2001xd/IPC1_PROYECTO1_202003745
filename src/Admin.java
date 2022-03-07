import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Admin extends JFrame {
VerBiblio j;
    Border border = BorderFactory.createMatteBorder(3,3,3,3,Color.LIGHT_GRAY);
public JPanel panel;
public VerUsuarios Tabla;
public VerBiblio Tabla2;
    public Admin (){
        this.setSize(1150,700);
        this.setTitle("                                                                                      Administrador");
        paneles();
        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

    }
    public void paneles(){
         panel= new JPanel();
       panel.setBackground(Color.white);
        this.getContentPane().add(panel);
        panel.setLayout(null);
        etiquetas();
        BotonesUsuarios();
        BotonesBiblio();
        Botonesreportes();

    }
    public void etiquetas (){
        JLabel etiqueta1= new JLabel();
        etiqueta1.setBounds(60,50,500,200);
        etiqueta1.setText("1");
        ImageIcon usac= new ImageIcon("usac2 (1).jpg");
        etiqueta1.setBorder(border);
        etiqueta1.setIcon(usac);
        panel.add(etiqueta1);

        JLabel etiqueta2= new JLabel();
        etiqueta2.setBounds(60,315,500,300);
        etiqueta2.setBorder(border);
        etiqueta2.setVerticalAlignment(JLabel.TOP);
        etiqueta2.setFont(new Font("arial",Font.BOLD,20));
        etiqueta2.setText("  Usuarios");
        panel.add(etiqueta2);

        JLabel etiqueta3= new JLabel();
        etiqueta3.setBounds(590,50,500,100);
        etiqueta3.setBorder(border);
        panel.add(etiqueta3);


        JLabel etiqueta4= new JLabel();
        etiqueta4.setBounds(590,160,500,100);
        etiqueta4.setBorder(border);
        etiqueta4.setVerticalAlignment(JLabel.TOP);
        etiqueta4.setFont(new Font("arial",Font.BOLD,16));
        etiqueta4.setText("  Reportes");
        panel.add(etiqueta4);

        JLabel etiqueta5= new JLabel();
        etiqueta5.setBounds(590,315,500,300);
        etiqueta5.setBorder(border);
        etiqueta5.setVerticalAlignment(JLabel.TOP);
        etiqueta5.setFont(new Font("arial",Font.BOLD,20));
        etiqueta5.setText("  Bibliografía");
        panel.add(etiqueta5);

        JLabel etiqueta6= new JLabel();
        etiqueta6.setBounds(620,60,85,85);
        ImageIcon profile= new ImageIcon("rigby (1).jpg");
        etiqueta6.setIcon(profile);
        panel.add(etiqueta6);
    }

    public void BotonesUsuarios(){
        JButton crear= new JButton();
        crear.setBounds(150,400,100,40);
        crear.setText("Crear ");
        crear.setBackground(new Color(214, 219, 223));
        crear.setBorder(border);
        crear.setFont(new Font("Georgia",Font.PLAIN,18));
        panel.add(crear);

        ActionListener oyente= new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CrearUsuarios x= new CrearUsuarios();
                dispose();
                x.setVisible(true);

            }
        };
        crear.addActionListener(oyente);

        JButton modificar= new JButton();
        modificar.setBounds(150,490,100,40);
        modificar.setText("Modificar ");
        modificar.setBackground(new Color(214, 219, 223));
        modificar.setBorder(border);
        modificar.setFont(new Font("Georgia",Font.PLAIN,18));
        panel.add(modificar);

        ActionListener oyente3= new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
EditarUsuarios x= new EditarUsuarios();
x.setVisible(true);
dispose();
            }
        };
        modificar.addActionListener(oyente3);

        JButton ver= new JButton();
        ver.setBounds(340,400,100,40);
        ver.setText("Ver ");
        ver.setBackground(new Color(214, 219, 223));
        ver.setBorder(border);
        ver.setFont(new Font("Georgia",Font.PLAIN,18));
        panel.add(ver);

        ActionListener oyente2= new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


            }
        };
ver.addActionListener(oyente2);
        ActionListener oyente1= new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


            }
        };
        ver.addActionListener(oyente1);

        JButton eliminar= new JButton();
        eliminar.setBounds(340,490,100,40);
        eliminar.setText("Eliminar ");
        eliminar.setBackground(new Color(214, 219, 223));
        eliminar.setBorder(border);
        eliminar.setFont(new Font("Georgia",Font.PLAIN,18));
        panel.add(eliminar);
ActionListener oyente4= new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
    EliminarUs r= new EliminarUs();
    r.setVisible(true);
    dispose();
    }
};
eliminar.addActionListener(oyente4);



    }

    public void BotonesBiblio(){

        JButton crear= new JButton();
        crear.setBounds(700,400,100,40);
        crear.setText("Crear ");
        crear.setBackground(new Color(214, 219, 223));
        crear.setBorder(border);
        crear.setFont(new Font("Georgia",Font.PLAIN,18));
        panel.add(crear);

        ActionListener create= new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CrearBibliografías x= new CrearBibliografías();
                x.setVisible(true);
                dispose();
            }
        };
        crear.addActionListener(create);

        JButton modificar= new JButton();
        modificar.setBounds(700,490,100,40);
        modificar.setText("Modificar ");
        modificar.setBackground(new Color(214, 219, 223));
        modificar.setBorder(border);
        modificar.setFont(new Font("Georgia",Font.PLAIN,18));
        panel.add(modificar);

        JButton ver= new JButton();
        ver.setBounds(890,400,100,40);
        ver.setText("Ver ");
        ver.setBackground(new Color(214, 219, 223));
        ver.setBorder(border);
        ver.setFont(new Font("Georgia",Font.PLAIN,18));
        panel.add(ver);

        ActionListener verb= new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Tabla2.setVisible(true);

            }
        };
        ver.addActionListener(verb);

        JButton eliminar= new JButton();
        eliminar.setBounds(890,490,100,40);
        eliminar.setText("Eliminar ");
        eliminar.setBackground(new Color(214, 219, 223));
        eliminar.setBorder(border);
        eliminar.setFont(new Font("Georgia",Font.PLAIN,18));
       panel.add(eliminar);

    }

    public void Botonesreportes(){

        JButton usuario = new JButton();
        usuario.setBounds(625,200,100,34);
        usuario.setText("Usuarios");
        usuario.setBackground(new Color(214, 219, 223));
        usuario.setBorder(border);
        usuario.setFont(new Font("Georgia",Font.PLAIN,16));
        panel.add(usuario);

        JButton bibliografia = new JButton();
        bibliografia.setBounds(780,200,100,34);
        bibliografia.setText("Bibliografias");
        bibliografia.setBackground(new Color(214, 219, 223));
        bibliografia.setBorder(border);
        bibliografia.setFont(new Font("Georgia",Font.PLAIN,16));
        panel.add(bibliografia);

        JButton prestamo = new JButton();
        prestamo.setBounds(935,200,100,34);
        prestamo.setText("Prestámos");
        prestamo.setBackground(new Color(214, 219, 223));
        prestamo.setBorder(border);
        prestamo.setFont(new Font("Georgia",Font.PLAIN,16));
        panel.add(prestamo);

        JButton logout= new JButton();
        logout.setBounds(935,86,100,36);
        logout.setText("Logout");
        logout.setBackground(new Color(214, 219, 223));
        logout.setBorder(border);
        logout.setFont(new Font("Georgia",Font.PLAIN,16));
        panel.add(logout);

        ActionListener oyente4= new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            dispose();
            Login m= new Login();
            m.setVisible(true);
            }
        };
        logout.addActionListener(oyente4);

    }

}
