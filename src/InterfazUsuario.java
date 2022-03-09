import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InterfazUsuario extends JFrame {

    Border border = BorderFactory.createMatteBorder(3,3,3,3, Color.LIGHT_GRAY);
    public JPanel panel;
    public InterfazUsuario(){
        this.setSize(1150,700);
        this.setTitle("                                                                                      USUARIO");
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

    }

    public void etiquetas () {
        JLabel etiqueta1 = new JLabel();
        etiqueta1.setBounds(60, 50, 400, 200);
        etiqueta1.setText("1");
        ImageIcon usac = new ImageIcon("usac2 (1).jpg");
        etiqueta1.setBorder(border);
        etiqueta1.setIcon(usac);
        panel.add(etiqueta1);

        JLabel etiqueta4= new JLabel();
        etiqueta4.setBounds(520,50,500,200);
        etiqueta4.setBorder(border);
        etiqueta4.setVerticalAlignment(JLabel.TOP);
        etiqueta4.setFont(new Font("arial",Font.BOLD,16));
        etiqueta4.setText("  USUARIO");
        panel.add(etiqueta4);

        JButton logout= new JButton();
        logout.setBounds(525,500,100,36);
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
