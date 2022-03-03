public class AlmacenarUsuarios extends CrearUsuarios {
public String ID;
public String Nombre;
public String Apellido;
public String Usuario;
public String Rol;
public String Contraseña;

    public AlmacenarUsuarios(String ID, String Nombre, String Apellido, String Usuario,String Rol ,String Contraseña) {

        this.ID = ID;
      this.Nombre=Nombre;
      this.Apellido=Apellido;
      this.Usuario=Usuario;
      this.Rol=Rol;
      this.Contraseña=Contraseña;
    }


    public String getID() {
        return ID;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public String getUsuario() {
        return Usuario;
    }

    public String getRol() {
        return Rol;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public void setUsuario(String usuario) {
        Usuario = usuario;
    }

    public void setRol(String rol) {
        Rol = rol;
    }

    public void setContraseña(String contraseña) {
        Contraseña = contraseña;
    }

}

