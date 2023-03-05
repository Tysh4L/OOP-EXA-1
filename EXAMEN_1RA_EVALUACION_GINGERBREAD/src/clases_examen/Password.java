package clases_examen;

/**
 *
 * @author Principal
 */
public class Password {
    private String usuario;
    private String contraseña;
    //constructor sin parametros
    public Password(){
        usuario = "Tysh4L";
        contraseña = "I_LOVE_MERCY21";
    }    
    //constructor con parametros
    public Password(String user1, String password1){
        usuario = user1;
        contraseña = password1;
    }
    //metodos set
    public void setUsuario(String user1){
        usuario = user1;
    }
    public void setContraseña(String password1){
        contraseña = password1;
    }
    public boolean verificarAcceso(String n, String p) {
        if(usuario == n && contraseña == p) {
        	return true;
        }else {
        	return false;
        }
    }
}
