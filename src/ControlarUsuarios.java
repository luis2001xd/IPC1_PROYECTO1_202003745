import javax.swing.*;

public class ControlarUsuarios {
    public static AlmacenarUsuarios[] us = new AlmacenarUsuarios[100];
    public static int Cantidad = 0;
    public static CrearUsuarios r;

    public static void guardar(AlmacenarUsuarios nuevous, String p) {
        for (int i = 0; i < us.length; i++) {
            if (us[i] == null) {
                us[i] = nuevous;
                JOptionPane.showMessageDialog(null, "Usuario creado con exito");
                Cantidad++;
                break;
            } else if (us[i].getID().equals(p)) {
                JOptionPane.showMessageDialog(null, "¡El usuario ya existe!");
                break;
            }
        }

    }

    public static String[][] obtenerDatos() {
        String datos[][] = new String[Cantidad][7];
        int posicion = 0;

        for (AlmacenarUsuarios user : us) {
            if (user != null) {
                String[] fila = {
                        user.getID(),
                        user.getNombre(),
                        user.getApellido(),
                        user.getUsuario(),
                        user.getRol(),
                        user.getContraseña()
                };
                datos[posicion] = fila;
                posicion++;
            }
        }
        return datos;
    }


    public static AlmacenarUsuarios buscar(String ID) {
        for (int i = 0; i < us.length; i++) {
            if (us[i] != null) {
                if (us[i].getID().equals(ID)) {
                    return us[i];
                }
            }
        }
        return null;
    }


    public void Confirmar(String x, String y) {
        for (int i = 0; i < us.length; i++) {
            if (us[i] != null) {
                if (us[i].getUsuario().equals(x) && us[i].getContraseña().equals(y)) {
                    InterfazUsuario r = new InterfazUsuario();
                    r.setVisible(true);
                    break;
                } else if (us[i].getUsuario().equals(x) && !us[i].getUsuario().equals(y)) {
                    JOptionPane.showMessageDialog(null, "Credenciales inválidas ");
                    break;
                }

            }
            try {
                if (us[i].getUsuario().equals(null) && us[i].getContraseña().equals(null)) {

                }
            } catch (NullPointerException e) {
                JOptionPane.showMessageDialog(null, "El usuario no existe, ponganse en contacto con el administrador");
                break;
            }
        }
    }


    public static void modificar(AlmacenarUsuarios nuevous) {
        for (int i = 0; i < us.length; i++) {
            if (us[i] != null) {
                us[i] = nuevous;
                JOptionPane.showMessageDialog(null, "Usuario modificado con exito");
                break;
            }
        }

    }


    public static void eliminar(AlmacenarUsuarios nuevous) {
        for (int i = 0; i < us.length; i++) {
            if (us[i] != null) {
                us[i] = null;
                JOptionPane.showMessageDialog(null, "Usuario eliminado con exito");
                break;
            }
        }

    }

    public static AlmacenarUsuarios[] obtener(){
        AlmacenarUsuarios x[]= new AlmacenarUsuarios[100];
        for (int i=0;i< us.length;i++){
            if (us[i]!=null){

                x[i]=new AlmacenarUsuarios(us[i].getID(),us[i].getNombre(),us[i].getApellido(),us[i].getUsuario(),
                        us[i].getRol(),us[i].getContraseña());
            }


        }
        return x;
    }


}