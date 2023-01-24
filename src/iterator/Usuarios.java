package iterator;

import java.util.ArrayList;

public class Usuarios implements UsuarioIterator {

    private final ArrayList<Usuario> usuarios = new ArrayList<>();
    private int posicion = 0;

    @Override
    public Usuario siguiente() {
        Usuario usuario = this.usuarios.get(posicion);
        posicion = posicion + 1;
        return usuario;
    }

    public void crear(Usuario usuario) {
        usuarios.add(usuario);

    }

    @Override
    public boolean hayMas() {
        return posicion < usuarios.size();
    }

    @Override
    public void reinicia() {

        posicion = 0;

    }

}
