import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CrearBibliografías extends JFrame {
    Border border = BorderFactory.createMatteBorder(2,2,2,2, Color.LIGHT_GRAY);
    JPanel panel;
    public JButton individual,masiva,cancelar;
    public CrearBibliografías(){
        this.setTitle("                                                 Crear Bibliografías");
        this.setSize(500,500);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        paneles();
        this.setVisible(true);
        this.setLocationRelativeTo(null);

    }
    public void paneles (){
        panel=new JPanel();
        panel.setBackground(Color.white);
        panel.setLayout(null);
        this.getContentPane().add(panel);
        botones();
    }
    public void botones (){
        individual= new JButton();
        individual.setBounds(170,100,150,50);
        individual.setBackground(new Color(214, 219, 223));
        individual.setBorder(border);
        individual.setText("Carga Individual");
        individual.setFont(new Font("Georgia",Font.PLAIN,14));
        panel.add(individual);

        ActionListener indi= new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
          CargaIndividual m= new CargaIndividual();
          m.setVisible(true);
          dispose();
            }
        };
individual.addActionListener(indi);

        masiva= new JButton();
        masiva.setBounds(170,220,150,50);
        masiva.setBackground(new Color(214, 219, 223));
        masiva.setBorder(border);
        masiva.setText("Carga Masiva");
        masiva.setFont(new Font("Georgia",Font.PLAIN,14));
        panel.add(masiva);

        ActionListener masiva1= new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
          CargaMasiva k= new CargaMasiva();
          k.setVisible(true);
          dispose();
            }
        };
        masiva.addActionListener(masiva1);

        cancelar= new JButton();
        cancelar.setBounds(170,340,150,50);
        cancelar.setBackground(new Color(214, 219, 223));
        cancelar.setBorder(border);
        cancelar.setText("Cancelar");
        cancelar.setFont(new Font("Georgia",Font.PLAIN,14));
        panel.add(cancelar);

        ActionListener cancelar1= new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
          Admin x= new Admin();
          x.setVisible(true);
          dispose();
            }
        };
        cancelar.addActionListener(cancelar1);



    }
}
