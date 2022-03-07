import javax.swing.*;
import java.awt.*;

public class VerBiblio extends JFrame {

    private String[] columnas; //Columnas de la tabla, referencia
    private String[][] datos; //Datos presentados en la tabla

    private JPanel plTabla; //Panel de tabla
    private JTable tbLecturas; //Objeto tabla
    private JScrollPane scpScroll; //Este panel permite tener barras de desplazamiento vertical u horizontal

    public VerBiblio(String[][] datos, String[] columnas) {
        this.columnas = columnas;
        this.datos = datos;

        definirPropiedades();
        iniciarComponentes();
    }

    private void definirPropiedades() {
        //Configuración de la ventana
        setTitle("Tabla de Usuarios");
        setSize(800,400);
        setLayout(null);
        setLocationRelativeTo(this);
    }

    private void iniciarComponentes() {
        //Definición del panel
        plTabla = new JPanel();
        plTabla.setBounds(0, 0, 800, 400);
        plTabla.setBackground(Color.darkGray);
        plTabla.setLayout(null);
        add(plTabla);

        //Definicion de tabla
        tbLecturas = new JTable(datos,columnas); //Se pasan como parámetros la matriz de datos(registros o filas de la tabla) y las columnas(encabezados)

        //Definición del Scroll Panel(Con barras de desplazamiento vertical y horizontal)
        scpScroll = new JScrollPane(tbLecturas);
        scpScroll.setBounds(50, 25, 700, 300);
        plTabla.add(scpScroll);
    }
}
