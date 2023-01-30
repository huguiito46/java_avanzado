package funciones;

public class UserException extends Exception{


    public UserException(String mensaje) {

        super("UserException " +mensaje);

    }

}
