import javax.swing.*;

public class ControlarTesis {
    public static AlmacenarTesis [] x= new AlmacenarTesis[100];
    public static int cantidadTesis=0;

    public static void guardarTesis(AlmacenarTesis tesisnueva){
        for (int i=0;i<x.length;i++){
            if (x[i]==null){
                x[i]=tesisnueva;
                JOptionPane.showMessageDialog(null,"Revista creada correctamente");
                CargaIndividual x= new CargaIndividual();
                x.dispose();
                cantidadTesis++;
                break;
            }
        }
    }

    public static String [][] obtenerDaTes(){
        String datos [][]= new String[cantidadTesis][6];
        int posicion=0;

        for (AlmacenarTesis tes:x){
            if (tes !=null){
                String [] fila= {
                        tes.getTipos(),
                        tes.getAutor(),
                        tes.getTitulo(),
                        tes.getStredicion(),
                        tes.getDescripción(),
                        tes.getTemasconcatenados(),
                        tes.getStrcopias(),
                        tes.getStrdisponibles()

                };
                datos[posicion]=fila;
                posicion++;
            }
        }
        return datos;
    }
}
