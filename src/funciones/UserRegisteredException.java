package funciones;

public class UserRegisteredException extends UserException{


    public UserRegisteredException(String mensaje) {
        super("Usuarios ya existe: " +mensaje);
    }
}
