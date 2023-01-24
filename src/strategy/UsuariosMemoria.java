package strategy;

import java.util.ArrayList;

public class UsuariosMemoria implements Usuarios {

    private final ArrayList<String> usuarios = new ArrayList<String>();


    @Override
    public void crear(String nombre){

        usuarios.add(nombre);

    }

    @Override
    public ArrayList<String> listar(){

        return usuarios;

    }


}
