package strategy;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class UsuariosFichero implements Usuarios {

    private final String ficheroUsuario = "fichero.txt";
    private PrintStream fichero;

    public UsuariosFichero() {

        try {

            fichero = new PrintStream(ficheroUsuario);

        } catch (Exception e) {
            System.out.println("No puedo abrirlo "
                    + e.getMessage());
        }

    }

    @Override
    public void crear(String nombre) {

        fichero.println(nombre);

    }


    @Override
    public ArrayList<String> listar() {

        ArrayList<String> usuarios = new ArrayList<String>();

        try {

            Scanner teclado = new Scanner(new File(ficheroUsuario));

            while (teclado.hasNext()) {
                usuarios.add(teclado.next());
            }

        } catch (Exception e) {
            System.out.println("Error leyendo " + e.getMessage());
        }


        return usuarios;

    }


}
