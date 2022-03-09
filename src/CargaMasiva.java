import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CargaMasiva extends JFrame {

    public JPanel plCarga;
    public JTextArea txaEntrada;
    public JScrollPane scpScroll;
    public JButton bttCargar;
    public JButton cancelar;

    public CargaMasiva() {
        definirPropiedades();
        construirComponentes();
    }



    private void definirPropiedades() {
        setSize(600,450);
        setBackground(Color.gray);
        setLayout(null);
        setLocationRelativeTo(this);
    }

    private void construirComponentes () {
        //Definición del panel
        plCarga = new JPanel();
        plCarga.setBounds(0, 0, 600, 450);
        plCarga.setBackground(Color.gray);
        plCarga.setLayout(null);
        add(plCarga);

        //Definición de area de texto
        txaEntrada = new JTextArea();

        //Definición del panel
        scpScroll = new JScrollPane(txaEntrada);
        scpScroll.setBounds(45, 50, 500, 300);
        plCarga.add(scpScroll);

        cancelar= new JButton("Cancelar");
        cancelar.setBounds(300,360,100,30);
        plCarga.add(cancelar);

        ActionListener t= new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
             Admin x= new Admin();
             dispose();
            }
        };
        cancelar.addActionListener(t);
        //Definición de boton cargar
        bttCargar = new JButton("Cargar");
        bttCargar.setBounds(160, 360, 100, 30);
        bttCargar.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String entradaTexto = txaEntrada.getText();
                cargarBiblios(entradaTexto);
                Admin r= new Admin();
                r.setVisible(true);
            }
        });
        plCarga.add(bttCargar);

    }


    public void cargarBiblios(String texto) {


        String[] lineasTexto = texto.split("\n");


        for(String linea: lineasTexto) {
            String[] atributos = linea.split(";");

            if(atributos[0].equals("0")) {
                AlmacenarLibros x= new AlmacenarLibros("Libros",atributos[1],atributos[2],atributos[4],atributos[3],atributos[5],atributos[9],atributos[10]);
ControlarBiblios.guardarBiblios(x);

            }
            else if(atributos[0].equals("1")){
                AlmacenarRevistas y= new AlmacenarRevistas("Revista",atributos[1],atributos[2],atributos[4],atributos[3],atributos[5],atributos[6],atributos[7],atributos[9],atributos[10]);
                ControlarBiblios.guardarBiblios(y);

            } else if (atributos[0].equals("2")){
                AlmacenarTesis r= new AlmacenarTesis("Tesis",atributos[1],atributos[2],atributos[4],atributos[3],atributos[5],atributos[8],atributos[9],atributos[10]);
                ControlarBiblios.guardarBiblios(r);
            }
        }

        JOptionPane.showMessageDialog(null, "Carga completa!", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        setVisible(false);

    }

}

