package funciones;

import java.util.ArrayList;
public class Usuarios {


    private final ArrayList<Usuario> usuarios = new ArrayList<>();

    public void añadirUsuario(Usuario usuario) throws UserException {

        if (usuarios.contains(usuario)) {
            throw new UserRegisteredException("Usuarios ya existe" + usuario.getNombre());
        }
        usuarios.add(usuario);

    }

    public void añadirUsuarios(Usuario... usuarios) throws UserException {

        for (Usuario usuario : usuarios) {

            if (this.usuarios.contains(usuario)) {
                throw new UserRegisteredException("Usuarios ya existe: " + usuario.getNombre());
            }
            this.usuarios.add(usuario);
        }

    }

}
