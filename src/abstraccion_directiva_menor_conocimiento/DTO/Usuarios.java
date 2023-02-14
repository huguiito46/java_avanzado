package abstraccion_directiva_menor_conocimiento.DTO;

import java.util.ArrayList;

/*
DTO --> DATA TRANSFER OBJECTS --> PERMITEN OBTENER INFORMACIÓN EN UNA UNICA LLAMADA
 */


/*
El patrón builder se relaciona con su propio objeto
 */

public class Usuarios {

    ArrayList<Usuario> usuarios = new ArrayList();

    public Usuario obtenerUsuario(String name) {

        for (Usuario usuario : usuarios) {
            if (usuario.nombre == name) {
                return usuario;
            }

        }

        return null;
    }

    public void añadirUsuario(Usuario usuario){
        usuarios.add(usuario);
    }



    private int contador;
    public void miMetodo(int contador) {
        // yo puedo relacionarme con mi propio metodo

        ArrayList<Integer> lista = new ArrayList<>();
        this.contador = contador;
        lista.add(contador);

        /*
        Objeto cosa = new cosa();
        cosa.getValores.getElementos.getSuperficiales();  --> Esto no
        cosa.valores.elementos.superficiales()
         */

    }


}
