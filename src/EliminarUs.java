import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EliminarUs extends JFrame{
    public JTextField ID;
    public JTextField Nombre,Apellido,Usuario;
    public JPasswordField Contraseña,Confirmar;
    public JComboBox rol;
    JButton crear,buscar1;
    public static AlmacenarUsuarios x;


    public JPanel panel;
    Border border = BorderFactory.createMatteBorder(2,2,2,2,Color.LIGHT_GRAY);
    public EliminarUs(){
        this.setTitle("                                                 Eliminar Usuarios");
        Paneles();
        this.setSize(500,500);
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }

    public void Paneles(){
        panel=new JPanel();
        panel.setBackground(Color.white);
        panel.setLayout(null);
        this.getContentPane().add(panel);
        Etiquetas();
        textos();
        Botones();
        Lista();


    }

    public void Etiquetas (){
        JLabel ID=new JLabel();
        ID.setText("ID");
        ID.setFont(new Font("arial",Font.BOLD,12));
        ID.setBounds(50,35,20,15);
        //panel.add(ID);

        JLabel Nombre=new JLabel();
        Nombre.setText("Nombre");
        Nombre.setBounds(50,70,50,20);
        panel.add(Nombre);

        JLabel Apellido=new JLabel();
        Apellido.setText("Apellido");
        Apellido.setBounds(50,105,50,20);
        panel.add(Apellido);

        JLabel Usuario=new JLabel();
        Usuario.setText("Usuario");
        Usuario.setBounds(50,140,50,20);
        panel.add(Usuario);

        JLabel Lista= new JLabel();
        Lista.setText("Rol ");
        Lista.setBounds(50,175,100,20);
        panel.add(Lista);

        JLabel Contraseña=new JLabel();
        Contraseña.setText("Contraseña");
        Contraseña.setBounds(50,210,90,20);
        panel.add(Contraseña);

        JLabel Confirmar=new JLabel();
        Confirmar.setText("Confirmar Contraseña");
        Confirmar.setBounds(50,245,150,20);
        panel.add(Confirmar);


    }

    public void textos(){
        ID= new JTextField();
        ID.setBounds(190,35,200,20);
        ID.setBorder(border);
        panel.add(ID);


        Nombre=new JTextField();
        Nombre.setBounds(190,70,200,20);
        Nombre.setBorder(border);
        panel.add(Nombre);

        Apellido= new JTextField();
        Apellido.setBounds(190,105,200,20);
        Apellido.setBorder(border);
        panel.add(Apellido);

        Usuario= new JTextField();
        Usuario.setBounds(190,140,200,20);
        Usuario.setBorder(border);
        panel.add(Usuario);

        Contraseña= new JPasswordField();
        Contraseña.setBounds(190,210,200,20);
        Contraseña.setBorder(border);
        panel.add(Contraseña);

        Confirmar= new JPasswordField();
        Confirmar.setBounds(190,245,200,20);
        Confirmar.setBorder(border);
        panel.add(Confirmar);
    }

    public void Lista(){
        String [] roles={"Estudiante","Maestro"};
        rol= new JComboBox(roles);
        rol.setBounds(190,175,200,20);
        rol.setBorder(border);
        panel.add(rol);
    }

    public void Botones(){
        crear= new JButton();
        crear.setBounds(120,325,80,20);
        crear.setText("Eliminar ");
        crear.setBackground(new Color(214, 219, 223));
        crear.setBorder(border);
        panel.add(crear);
        ActionListener modificar = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                eliminacion();
                dispose();
            }
        };
        crear.addActionListener(modificar);



        JButton cancelar= new JButton();
        cancelar.setBounds(280,325,80,20);
        cancelar.setText("Cancelar ");
        cancelar.setBackground(new Color(214, 219, 223));
        cancelar.setBorder(border);
        panel.add(cancelar);

        ActionListener cancelar1= new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Admin y= new Admin();
                y.setVisible(true);
                dispose();
            }
        };
        cancelar.addActionListener(cancelar1);

        buscar1= new JButton();
        buscar1.setBounds(50,35,80,20);
        buscar1.setText("Buscar ");
        buscar1.setBackground(new Color(214, 219, 223));
        buscar1.setBorder(border);
        panel.add(buscar1);

        ActionListener oyente= new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AlmacenarUsuarios x= ControlarUsuarios.buscar(ID.getText());
                try {
                    Nombre.setText(x.getNombre());
                    Apellido.setText(x.getApellido());
                    Usuario.setText(x.getUsuario());
                    rol.setSelectedItem(x.getRol().toString());
                    Contraseña.setText(x.getContraseña());
                    Confirmar.setText(x.getContraseña());
                } catch (NullPointerException m){
                    JOptionPane.showMessageDialog(null,"El usuario no existe");
                }
                Nombre.setEnabled(false);
                Apellido.setEnabled(false);
                Usuario.setEnabled(false);
                rol.setEnabled(false);
                Contraseña.setEnabled(false);
                Confirmar.setEnabled(false);
            }
        };
        buscar1.addActionListener(oyente);


    }


    public void eliminacion (){
        AlmacenarUsuarios x= new AlmacenarUsuarios(ID.getText(),Nombre.getText(),Apellido.getText(),Usuario.getText(),rol.getSelectedItem().toString(),Contraseña.getText());
        ControlarUsuarios.eliminar(x);
        Admin m= new Admin();
        m.setVisible(true);
    }




}






