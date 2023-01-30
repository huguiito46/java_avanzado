package excepciones;

public class UsuariosNombreCorto extends UsuariosExcepcion{


    public UsuariosNombreCorto(String mensaje) {
        super("longitd de nombre corta: " + mensaje);
    }
}
