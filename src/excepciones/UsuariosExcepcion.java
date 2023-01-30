package excepciones;

public class UsuariosExcepcion extends Exception{


    public UsuariosExcepcion(String mensaje){
        super("error al registrar -> " +mensaje);

        for(StackTraceElement elemento : getStackTrace()){
            System.out.println(elemento.getClassName() + "  " +elemento.getMethodName());
        }

    }

}
