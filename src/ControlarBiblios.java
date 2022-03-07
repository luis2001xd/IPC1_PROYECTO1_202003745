import javax.swing.*;

public class ControlarBiblios {
    public static AlmacenarTesis [] x= new AlmacenarTesis[100];
    public static AlmacenarRevistas[] y= new AlmacenarRevistas[100];
    public static AlmacenarLibros [] z= new AlmacenarLibros[100];
    public static int cantidadBiblios=0;

    public static void guardarBiblios(AlmacenarTesis tesisnueva){
        for (int i=0;i<x.length;i++){
            if (x[i]==null){
                x[i]=tesisnueva;
                JOptionPane.showMessageDialog(null,"Tesis creada correctamente");
                CargaIndividual x= new CargaIndividual();
                x.dispose();
                cantidadBiblios++;
                break;
            }
        }
    }

    public static void guardarBiblios(AlmacenarRevistas revistanueva){
        for (int i=0;i<y.length;i++){
            if (y[i]==null){
                y[i]=revistanueva;
                JOptionPane.showMessageDialog(null,"Revista creada correctamente");
                CargaIndividual y= new CargaIndividual();
                y.dispose();
                cantidadBiblios++;
                break;
            }
        }
    }

    public static void guardarBiblios(AlmacenarLibros libronuevo){
        for (int i=0;i<z.length;i++){
            if (z[i]==null){
                z[i]=libronuevo;
                JOptionPane.showMessageDialog(null,"Libro creado correctamente");
                CargaIndividual z= new CargaIndividual();
                z.dispose();
                cantidadBiblios++;
                break;
            }
        }
    }

    public static String [][] obtenerDaTes(){
        String datos [][]= new String[cantidadBiblios][6];
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

    public static String [][] obtenerDaRes(){
        String datos [][]= new String[cantidadBiblios][6];
        int posicion=0;

        for (AlmacenarRevistas rev:y){
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

    public static String [][] obtenerDaLib(){
        String datos [][]= new String[cantidadBiblios][8];
        int posicion=0;

        for (AlmacenarLibros lib:z){
            if (lib !=null){
                String [] fila= {
                        lib.getLibros(),
                        lib.getAutor(),
                        lib.getTitulo(),
                        lib.getStredicion(),
                        lib.getDescripción(),
                        lib.getTemasconcatenados(),
                        lib.getStrcopias(),
                        lib.getStrdisponibles()

                };
                datos[posicion]=fila;
                posicion++;
            }
        }
        return datos;
    }

}

