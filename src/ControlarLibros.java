import javax.swing.*;

public class ControlarLibros {
    public static AlmacenarLibros [] x= new AlmacenarLibros[100];
public static int cantidadlibros;

public static void guardarlibros(AlmacenarLibros libronuevo){
    for (int i=0;i<x.length;i++){
        if (x[i]==null){
            x[i]=libronuevo;
            JOptionPane.showMessageDialog(null,"Libro creado correctamente");
            CargaIndividual x= new CargaIndividual();
            break;
        }
    }
}
}
