package S_SOLID.Final;

public class Usuario {

    public String nombreUsuario;
    public String nombre;
    public String apellidos;
    public int nivelAcceso;
    public String email = "";

    @Override
    public String toString() {
        return "nombre de usuario: " + nombreUsuario + "\r\n"
                + "nombre: " + nombre + "\r\n"
                + "apellidos: " + apellidos + "\r\n"
                + "email: " + email + "\r\n"
                + "nivel de acceso: " + nivelAcceso;
    }
}
