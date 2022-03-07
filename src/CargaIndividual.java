import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CargaIndividual extends JFrame {
    Border border = BorderFactory.createMatteBorder(2,2,2,2,Color.LIGHT_GRAY);
    public JPanel panel;
    public JComboBox tipo;
    public VerBiblio tabla;
    public JTextField Tipo,Autor,Titulo,Edicion,Descripcion,Temas,Frecuencia,Ejemplares,Copias,Disponibles,Area;
    public JLabel Tipotext,Autortext,Titulotext,Ediciontext,Descripciontext,Temastext,FrecuenciaText,EjemplaresText,CopiasText,DisponiblesText,AreaText;
    public JButton Crear,Cancelar,Seleccionar;
    public CargaIndividual(){

        this.setSize(950,650);
        this.setTitle("                                                                                              Carga Individual");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        paneles();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
    public void paneles(){
        panel= new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.white);
        this.getContentPane().add(panel);
        etiquetas();
        cajas();
        botones();
    }

    public void etiquetas(){
        Tipotext= new JLabel();
        Tipotext.setText("Tipo");
        Tipotext.setFont(new Font("arial",Font.BOLD,16));
        Tipotext.setBounds(70,90,100,15);
        panel.add(Tipotext);

        Autortext= new JLabel();
        Autortext.setText("Autor");
        Autortext.setFont(new Font("arial",Font.BOLD,16));
        Autortext.setBounds(70,145,100,15);
        panel.add(Autortext);

        Titulotext= new JLabel();
        Titulotext.setText("Título");
        Titulotext.setFont(new Font("arial",Font.BOLD,16));
        Titulotext.setBounds(70,210,100,15);
        panel.add(Titulotext);

        Ediciontext= new JLabel();
        Ediciontext.setText("Edición");
        Ediciontext.setFont(new Font("arial",Font.BOLD,16));
        Ediciontext.setBounds(70,280,100,15);
        panel.add(Ediciontext);

        Descripciontext= new JLabel();
        Descripciontext.setText("Descripción");
        Descripciontext.setFont(new Font("arial",Font.BOLD,16));
        Descripciontext.setBounds(70,350,100,15);
        panel.add(Descripciontext);

        Temastext= new JLabel();
        Temastext.setText("Temas");
        Temastext.setFont(new Font("arial",Font.BOLD,16));
        Temastext.setBounds(70,420,100,15);
        panel.add(Temastext);

        FrecuenciaText= new JLabel();
        FrecuenciaText.setText("Frecuencia");
        FrecuenciaText.setFont(new Font("arial",Font.BOLD,16));
        FrecuenciaText.setBounds(500,145,100,15);
        panel.add(FrecuenciaText);

        EjemplaresText= new JLabel();
        EjemplaresText.setText("Ejemplares");
        EjemplaresText.setFont(new Font("arial",Font.BOLD,16));
        EjemplaresText.setBounds(500,210,100,15);
        panel.add(EjemplaresText);

        CopiasText= new JLabel();
        CopiasText.setText("Copias");
        CopiasText.setFont(new Font("arial",Font.BOLD,16));
        CopiasText.setBounds(500,280,100,15);
        panel.add(CopiasText);

        DisponiblesText= new JLabel();
        DisponiblesText.setText("Disponibles");
        DisponiblesText.setFont(new Font("arial",Font.BOLD,16));
        DisponiblesText.setBounds(500,350,100,15);
        panel.add(DisponiblesText);

        AreaText= new JLabel();
        AreaText.setText("Areás");
        AreaText.setFont(new Font("arial",Font.BOLD,16));
        AreaText.setBounds(500,420,100,15);
        panel.add(AreaText);


    }

    public void cajas(){

        String [] tipos={"Revista","Tesis","Libros"};
        tipo= new JComboBox(tipos);
        tipo.setBounds(210,90,200,20);
        tipo.setBorder(border);
        panel.add(tipo);


        Autor= new JTextField();
        Autor.setBounds(210,145,200,20);
        Autor.setBorder(border);
        panel.add(Autor);

        Titulo= new JTextField();
        Titulo.setBounds(210,210,200,20);
        Titulo.setBorder(border);
        panel.add(Titulo);

        Edicion= new JTextField();
        Edicion.setBounds(210,280,200,20);
        Edicion.setBorder(border);
        panel.add(Edicion);

        Descripcion= new JTextField();
        Descripcion.setBounds(210,350,200,20);
        Descripcion.setBorder(border);
        panel.add(Descripcion);

        Temas= new JTextField();
        Temas.setBounds(210,420,200,20);
        Temas.setBorder(border);
        panel.add(Temas);

        Frecuencia= new JTextField();
        Frecuencia.setBounds(650,145,200,20);
        Frecuencia.setBorder(border);
        panel.add(Frecuencia);

        Ejemplares= new JTextField();
        Ejemplares.setBounds(650,210,200,20);
        Ejemplares.setBorder(border);
        panel.add(Ejemplares);

        Copias= new JTextField();
        Copias.setBounds(650,280,200,20);
        Copias.setBorder(border);
        panel.add(Copias);

        Disponibles= new JTextField();
        Disponibles.setBounds(650,350,200,20);
        Disponibles.setBorder(border);
        panel.add(Disponibles);

        Area= new JTextField();
        Area.setBounds(650,420,200,20);
        Area.setBorder(border);
        panel.add(Area);

    }

    public void botones(){
        Crear= new JButton();
        Crear.setBounds(280,500,100,40);
        Crear.setText("Crear ");
        Crear.setBackground(new Color(214, 219, 223));
        Crear.setFont(new Font("arial",Font.BOLD,16));
        Crear.setBorder(border);
        panel.add(Crear);


        ActionListener create= new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String tema1 = Temas.getText();
                String[] temas = tema1.split(",");
                String [] columnas1 ={"Tipo","Autor","Titulo","Edición","Descripcion","Temas","Copias","Disponibles"};
                if (tipo.getSelectedItem().equals("Libros")){
                    try {
                        AlmacenarLibros x = new AlmacenarLibros(tipo.getSelectedItem().toString(), Autor.getText(),
                                Titulo.getText(), Edicion.getText(), Descripcion.getText(), Temas.getText(), Copias.getText(), Disponibles.getText());
                     ControlarBiblios.guardarBiblios(x);
                    } catch (NumberFormatException m) {
                        JOptionPane.showMessageDialog(null, "No se rellenaron los campos correctamente");
                    }
                    String [][] datos= ControlarBiblios.obtenerDaLib();
                    tabla= new VerBiblio(datos,columnas1);
                    tabla.setVisible(true);
            }

                if (tipo.getSelectedItem().equals("Revista")){
                    try {
                        AlmacenarRevistas y = new AlmacenarRevistas(tipo.getSelectedItem().toString(),Autor.getText(),Titulo.getText(),Edicion.getText(),Descripcion.getText()
                        ,Temas.getText(),Frecuencia.getText(),Ejemplares.getText(),Copias.getText(),Disponibles.getText());
                        ControlarBiblios.guardarBiblios(y);
                    } catch (NumberFormatException m) {
                        JOptionPane.showMessageDialog(null, "No se rellenaron los campos correctamente");
                    }
                    String [][] datos= ControlarBiblios.obtenerDaRes();
                    tabla= new VerBiblio(datos,columnas1);
                    tabla.setVisible(true);
                }

                if (tipo.getSelectedItem().equals("Tesis")){
                    try {
                        AlmacenarTesis z = new AlmacenarTesis(tipo.getSelectedItem().toString(),Autor.getText(),Titulo.getText(),Edicion.getText(),Descripcion.getText()
                        ,Temas.getText(),Area.getText(),Copias.getText(),Disponibles.getText());
                        ControlarBiblios.guardarBiblios(z);
                    } catch (NumberFormatException m) {
                        JOptionPane.showMessageDialog(null, "No se rellenaron los campos correctamente");
                    }
                    String [][] datos= ControlarBiblios.obtenerDaTes();
                    tabla= new VerBiblio(datos,columnas1);
                    tabla.setVisible(true);
                }
                Admin h= new Admin();
                h.setVisible(true);
                dispose();
            }
        };
        Crear.addActionListener(create);


        Cancelar= new JButton();
        Cancelar.setBounds(500,500,100,40);
        Cancelar.setText("Cancelar ");
        Cancelar.setBackground(new Color(214, 219, 223));
        Cancelar.setFont(new Font("arial",Font.BOLD,16));
        Cancelar.setBorder(border);
        panel.add(Cancelar);

        ActionListener canc= new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
          Admin o= new Admin();
          o.setVisible(true);
                dispose();
            }
        };
        Cancelar.addActionListener(canc);

        Seleccionar= new JButton();
        Seleccionar.setBounds(500,90,100,20);
        Seleccionar.setText("Seleccionar ");
        Seleccionar.setBackground(new Color(214, 219, 223));
        Seleccionar.setFont(new Font("arial",Font.BOLD,12));
        Seleccionar.setBorder(border);
        panel.add(Seleccionar);
        ActionListener seleccion= new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
          if(tipo.getSelectedItem().equals("Libros")){
              Frecuencia.setEnabled(false);
              Ejemplares.setEnabled(false);
              Area.setEnabled(false);
          }

               else if(tipo.getSelectedItem().equals("Revistas")){
                    Area.setEnabled(false);
                }
            }
        };
        Seleccionar.addActionListener(seleccion);



    }
}
