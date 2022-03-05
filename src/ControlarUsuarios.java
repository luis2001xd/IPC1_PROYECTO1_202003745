import javax.swing.*;

public class ControlarUsuarios {
    public static AlmacenarUsuarios []us= new AlmacenarUsuarios[100];
    public static int Cantidad=0;
    public static CrearUsuarios r;

    public static void guardar (AlmacenarUsuarios nuevous){
        for (int i=0;i< us.length;i++){
            if (us[i]==null){
                us[i]= nuevous;
                System.out.println(us[i].getUsuario());
                while (i==3){
                    System.out.println(us[1].getUsuario());
                    i++;
                }
                Cantidad++;
                break;
            }
        }

    }

    public static String [][] obtenerDatos(){
        String datos [][]= new String[Cantidad][6];
int posicion=0;

for (AlmacenarUsuarios user:us){
if (user !=null){
    String [] fila= {
            user.getID(),
            user.getNombre(),
            user.getApellido(),
            user.getUsuario(),
            user.getRol(),
            user.getContraseña()
};
    datos[posicion]=fila;
posicion++;
        }
      }
        return datos;
    }

    public static AlmacenarUsuarios buscar(String ID){
        for (int i=0; i< us.length;i++) {
            if (us[i] != null){
                if (us[i].getID().equals(ID)) {
                    return us[i];
                }
        }
        }
return null;
    }




public  void Confirmar(String x, String y){
        for (int i=0; i<us.length;i++){
            if (us[i]!=null){
                if (us[i].getUsuario().equals(x)&& us[i].getContraseña().equals(y)){
                    InterfazUsuario r= new InterfazUsuario();
                    r.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null,"Credenciales invalidas");
                }
            }
        }
}

    public static void modificar (AlmacenarUsuarios nuevous){
        for (int i=0;i< us.length;i++){
            if (us[i]!=null){
                us[i]= nuevous;
                break;
            }
        }

    }
}
