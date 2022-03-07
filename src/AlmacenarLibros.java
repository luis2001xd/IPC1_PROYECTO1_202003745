public class AlmacenarLibros {
    public String Libros;
    public String Titulo;
    public int Edicion;
    public String descripción;
    public String [] temas;
    public int copias;
    public int disponibles;
    public String Autor;
    public String strcopias;
    public String strdisponibles;
    public String stredicion;
    public String temasconcatenados;



    public AlmacenarLibros(String libros,String Autor, String titulo, String edicion, String descripción, String temas, String copias, String disponibles) {
        Libros = libros;
        Titulo = titulo;
        this.Autor=Autor;
       this.Edicion=Integer.parseInt(edicion);
        this.descripción = descripción;
        this.temas = temas.split(",");
        this.copias = Integer.parseInt(copias);
        this.disponibles = Integer.parseInt(disponibles);
        this.strcopias=copias;
        this.strdisponibles=disponibles;
        this.stredicion=edicion;
        temasconcatenados=temas.replace(",",";");
    }

    public void setEdicion(int edicion) {
        Edicion = edicion;
    }

    public void setAutor(String autor) {
        Autor = autor;
    }

    public String getLibros() {
        return Libros;
    }

    public void setLibros(String libros) {
        Libros = libros;
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

    public String getStredicion() {
        return stredicion;
    }

    public void setStredicion(String stredicion) {
        this.stredicion = stredicion;
    }

    public String getTemasconcatenados() {
        return temasconcatenados;
    }

    public void setTemasconcatenados(String temasconcatenados) {
        this.temasconcatenados = temasconcatenados;
    }
}
