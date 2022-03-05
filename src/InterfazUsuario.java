import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class InterfazUsuario extends JFrame {

    Border border = BorderFactory.createMatteBorder(3,3,3,3, Color.LIGHT_GRAY);
    public JPanel panel;
    public InterfazUsuario(){
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

    }


}
