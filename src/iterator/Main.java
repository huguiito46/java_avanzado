package iterator;

public class Main {

    public static void main(String[] args) {

        Usuarios usuarios = new Usuarios();
        usuarios.crear(new Usuario("Uno", 5));
        usuarios.crear(new Usuario("Dos", 25));
        usuarios.crear(new Usuario("Tres", 10));
        usuarios.crear(new Usuario("Cuatro", 8));


        while (usuarios.hayMas()) {
            Usuario usuario = usuarios.siguiente();
            System.out.println("UsuariosExcepcion son: " + usuario.getNombre()  + " " +usuario.getEdad());
        }

        usuarios.crear(new Usuario("Cinco",18));
        Usuario usuario = usuarios.siguiente();
        System.out.println("UsuariosExcepcion es : " +usuario.getNombre() + "  " +usuario.getEdad());




        usuarios.reinicia();
        while (usuarios.hayMas()) {
            usuario = usuarios.siguiente();
            System.out.println("UsuariosExcepcion son: " + usuario.getNombre()  + " " +usuario.getEdad());
        }


    }

}
