package strategy;

/*
    UsuariosMemoria usuariosMemoria = new UsuariosMemoria();
    usuariosMemoria.crear("Carlos");
    usuariosMemoria.crear("Maria");
    usuariosMemoria.crear("Pepe");

        for (String usuario : usuariosMemoria.listar()) {
            System.out.println(usuario);

        }
*/

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


        int tipo = 0;

        if(tipo == 0){

            UsuariosMemoria usuarios = new UsuariosMemoria();
        }else{

            UsuariosFichero usuarios = new UsuariosFichero();
        }


        UsuariosFichero usuariosFichero = new UsuariosFichero();

        crear(usuariosFichero,"Carlos");
        crear(usuariosFichero,"Maria");
        crear(usuariosFichero, "Pepe");


        for (String usuario : usuariosFichero.listar()) {
            System.out.println(usuario);

        }

    }

    public static void crear(Usuarios usuario, String nombre){

        usuario.crear(nombre);

    }

    public static ArrayList<String> listar(Usuarios usuarios){

        return usuarios.listar();

    }

}
