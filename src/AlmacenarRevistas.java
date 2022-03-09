public class AlmacenarRevistas {
    public String Revista;
    public String Titulo;
    public int Edicion;
    public String descripción;
    public String [] temas;
    public int copias;
    public int disponibles;
    public String Autor;
    public String Frecuencia;
    public int Ejemplares;
    public String strEdicion;
    public String strcopias;
    public String strdisponibles;
    public String temasconcatenados;
    public String strEjemplares;



    public AlmacenarRevistas(String Revista,String Autor, String titulo, String edicion, String descripción, String temas,String Frecuencia,String Ejemplares, String copias, String disponibles) {
        this.Revista=Revista;
        Titulo = titulo;
        this.Autor=Autor;
        this.Edicion=Integer.parseInt(edicion);
        this.descripción = descripción;
        this.temas = temas.split(",");
        this.copias = Integer.parseInt(copias);
        this.disponibles = Integer.parseInt(disponibles);
        this.Frecuencia=Frecuencia;
        this.Ejemplares= Integer.parseInt(Ejemplares);
        this.strEdicion=edicion;
        this.strcopias=copias;
        this.strdisponibles=disponibles;
        this.strEjemplares=Ejemplares;
        this.temasconcatenados=temas.replace(",",";");

    }

    public void setEdicion(int edicion) {
        Edicion = edicion;
    }

    public void setAutor(String autor) {
        Autor = autor;
    }

    public void setFrecuencia(String frecuencia) {
        Frecuencia = frecuencia;
    }

    public void setEjemplares(int ejemplares) {
        Ejemplares = ejemplares;
    }

    public String getRevista() {
        return Revista;
    }

    public void setRevista(String revista) {
        Revista = revista;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public int getEdición() {
        return Edicion;
    }

    public void setEdición(int edición) {
        Edicion = edición;
    }

    public String getDescripción() {
        return descripción;
    }

    public void setDescripción(String descripción) {
        this.descripción = descripción;
    }

    public String[] getTemas() {
        return temas;
    }

    public void setTemas(String[] temas) {
        this.temas = temas;
    }

    public int getCopias() {
        return copias;
    }

    public void setCopias(int copias) {
        this.copias = copias;
    }

    public int getDisponibles() {
        return disponibles;
    }

    public void setDisponibles(int disponibles) {
        this.disponibles = disponibles;
    }

    public String getAutor() {
        return Autor;
    }

    public int getEdicion() {
        return Edicion;
    }

    public String getFrecuencia() {
        return Frecuencia;
    }

    public int getEjemplares() {
        return Ejemplares;
    }

    public String getStrEdicion() {
        return strEdicion;
    }

    public void setStrEdicion(String strEdicion) {
        this.strEdicion = strEdicion;
    }

    public String getStrcopias() {
        return strcopias;
    }

    public void setStrcopias(String strcopias) {
        this.strcopias = strcopias;
    }

    public String getStrdisponibles() {
        return strdisponibles;
    }

    public void setStrdisponibles(String strdisponibles) {
        this.strdisponibles = strdisponibles;
    }

    public String getTemasconcatenados() {
        return temasconcatenados;
    }

    public void setTemasconcatenados(String temasconcatenados) {
        this.temasconcatenados = temasconcatenados;
    }

    public String getStrEjemplares() {
        return strEjemplares;
    }

    public void setStrEjemplares(String strEjemplares) {
        this.strEjemplares = strEjemplares;
    }
}
