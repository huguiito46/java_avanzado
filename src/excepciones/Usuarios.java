package excepciones;

import java.util.ArrayList;
import java.util.Objects;

public class Usuarios {

    ArrayList<String> usuarios = new ArrayList<>();
    ArrayList<Usuario> usuarios2 = new ArrayList<>();

    private void Usuario(){

    }

    public Usuarios(Usuario usuario) {

        usuarios2.add(usuario);
    }


    public void Usuario(Usuario usuario){
        usuarios2.add(usuario);
    }

    public ArrayList<Usuario> getUsuarios2(){

        return usuarios2;

    }



    public void meterUsuario(String nombre) throws UsuariosNombreCorto, UsuariosYaRegistradoExcepcion {

        if(nombre.length() < 5 ){
            throw new UsuariosNombreCorto(nombre);

        }

        for (String usuario : usuarios){
            if(usuario == nombre){ // Esto es igual a Objets.equals(usuarios,nonbre)
                throw new UsuariosYaRegistradoExcepcion(nombre);
            }

        }

        usuarios.add(nombre);
        System.out.println("Usuario metido " +nombre);

    }

    public void meterUsuario2(String nombre) throws UsuariosNombreCorto, UsuariosYaRegistradoExcepcion {

        if(nombre.length() < 5 ){
            throw new UsuariosNombreCorto(nombre);

        }
        for (String usuario : usuarios){
            if(Objects.equals(usuario, nombre)){
                throw new UsuariosYaRegistradoExcepcion(nombre);
            }

        }

        usuarios.add(nombre);
        System.out.println("Usuario metido " +nombre);

    }


}
