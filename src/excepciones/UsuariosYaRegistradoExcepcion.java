package excepciones;

public class UsuariosYaRegistradoExcepcion extends UsuariosExcepcion{
    public UsuariosYaRegistradoExcepcion(String mensaje) {
        super("ya registrado -> " +mensaje); // super --> el padre usuariosExcepcion
    }

}
