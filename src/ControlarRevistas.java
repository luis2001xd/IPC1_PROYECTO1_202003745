import javax.swing.*;

public class ControlarRevistas {
    public static AlmacenarRevistas [] x= new AlmacenarRevistas[100];
    public static int cantidadRevistas=0;

    public static void guardarRevistas(AlmacenarRevistas revistanueva){
        for (int i=0;i<x.length;i++){
            if (x[i]==null){
                x[i]=revistanueva;
                JOptionPane.showMessageDialog(null,"Revista creada correctamente");
                CargaIndividual x= new CargaIndividual();
                x.dispose();
                cantidadRevistas++;
                break;

            }
        }
    }

    public static String [][] obtenerDatos(){
        String datos [][]= new String[cantidadRevistas][6];
        int posicion=0;

        for (AlmacenarRevistas rev:x){
            if (rev !=null){
                String [] fila= {
                      rev.getRevista(),
                        rev.getAutor(),
                        rev.getTitulo(),
                        rev.getStrEdicion(),
                        rev.getDescripción(),
                        rev.getTemasconcatenados(),
                        rev.getStrcopias(),
                        rev.getStrdisponibles()

                };
                datos[posicion]=fila;
                posicion++;
            }
        }
        return datos;
    }
}
