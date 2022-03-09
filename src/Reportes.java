public class Reportes {
public String antestabla= "<!DOCTYPE html>\n"+
                           "<html lang=\"en\">\n"+
                           "<head>\n"+
                           "<title>Document</title>\n"+
        "</head>\n"+
        "<body>\n"+
        "<table border=\"\">\n";

private String despuestabla ="</table>\n"+
        "</body>\n"+
        "</html>";

private AlmacenarUsuarios [] datos;
private String [] columnas;

public Reportes (AlmacenarUsuarios datos[],String[] columnas){
    this.datos=datos;
    this.columnas=columnas;
}

public String obtenerReportesUs(){
    String tablacolumnas= "";
    tablacolumnas+= "                     <tr>\n";
    for (int i=0;i<columnas.length;i++){
        tablacolumnas += "                 <th>"+columnas[i]+"</th>\n";
    }
    tablacolumnas+="                       </tr>\n";
    String tablaDatos="";
    for (int i=0;i< datos.length;i++){
        if (datos[i]!=null){
            tablaDatos+="                  <tr>\n";

            tablaDatos+= "                          <td>"+datos[i].getID()+"</td>\n";
            tablaDatos+= "                          <td>"+datos[i].getNombre()+"</td>\n";
            tablaDatos+= "                          <td>"+datos[i].getApellido()+"</td>\n";
            tablaDatos+= "                          <td>"+datos[i].getUsuario()+"</td>\n";
            tablaDatos+= "                          <td>"+datos[i].getContraseña()+"</td>\n";
            tablaDatos+= "                          <td>"+datos[i].getRol()+"</td>\n";
            tablaDatos+="                  </tr>\n";

        }
    }
    return antestabla+tablacolumnas+tablaDatos+despuestabla;
}

}
