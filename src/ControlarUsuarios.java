public class ControlarUsuarios {
    public AlmacenarUsuarios[]x;

    public ControlarUsuarios(){
        this.x=new AlmacenarUsuarios[100];
    }

    public boolean insertar(String ID, String Nombre, String Apellido, String Usuario,String Rol ,String Contraseña){
        for (int i=0;i< x.length;i++){
            if (x[i]==null){
                x[i]= new AlmacenarUsuarios(ID,Nombre,Apellido,Usuario,Rol,Contraseña);
                return true;
            }
        }
        return false;
    }

    public boolean verificarUsuario(String usuario){
        for(AlmacenarUsuarios us: x){
            if(us!=null){
                if(x.equals(usuario)){
                    return true;
                }
            }
        }
        return false;
    }
}
