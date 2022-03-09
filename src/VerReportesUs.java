import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VerReportesUs extends JFrame {

    public JPanel plCarga;
    public JTextArea txaEntrada;
    public JScrollPane scpScroll;
    public JButton bttCargar;

    public VerReportesUs() {
        definirPropiedades();
        construirComponentes();
    }


    private void definirPropiedades() {
        setSize(600, 450);
        setBackground(Color.gray);
        setLayout(null);
        setLocationRelativeTo(this);
    }

    private void construirComponentes() {
        //Definición del panel
        plCarga = new JPanel();
        plCarga.setBounds(0, 0, 600, 450);
        plCarga.setBackground(Color.gray);
        plCarga.setLayout(null);
        add(plCarga);

        //Definición de area de texto
        txaEntrada = new JTextArea();
        String [] columnas ={"ID","Nombre","Apellido","Usuario","Rol","Contraseña"};
        AlmacenarUsuarios[] datos= ControlarUsuarios.obtener();
        Reportes generador= new Reportes(datos,columnas);
        String reportehtml=generador.obtenerReportesUs();
        txaEntrada.append(reportehtml);

        //Definición del panel
        scpScroll = new JScrollPane(txaEntrada);
        scpScroll.setBounds(45, 50, 500, 300);
        plCarga.add(scpScroll);

        //Definición de boton cargar
        bttCargar = new JButton("Cancelar");
        bttCargar.setBounds(250, 360, 100, 30);

        ActionListener cancelar= new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
          dispose();
          Admin r= new Admin();
          r.setVisible(true);
            }
        };

    }
}
