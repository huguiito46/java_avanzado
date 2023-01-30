package excepciones;

/*
       try {
            divisionPorCero(5, 0);
       } catch (ArithmeticException e) {
            System.out.println("Hay una excepcion aritmetica");

       } catch (IOException e) {
            System.out.println("Hay una excepcion de IO");

       } catch (Exception e) {
            System.out.println("Otra excepcion de tipo... " +e.getClass()+ " " +e.getMessage());
       }

        System.out.println("Estoy aquí");
 */

/*
    try{

    usuarios.meterUsuario("pepeluis");
    usuarios.meterUsuario("juan2");
    usuarios.meterUsuario("pepeluis");
     }catch (UsuariosExcepcion e){
           System.out.println(e.getMessage()); // nos da el mensaje de la excepcion
        }
      System.out.println("Estoy aquí");
*/

import java.io.IOException;

public class Main {

    public static void main(String[] args)  {

        Usuario usuario = null;
        Usuarios usuarios = new Usuarios(usuario);
        for(Usuario actual : usuarios.getUsuarios2()){
            try{
                System.out.println(actual.name);
            }catch(NullPointerException e) {
                System.out.println("EXCEPCION! NAME ES NULO!");
            }finally{
                System.out.println("Finally");
            }
        }

        // System.out.println("Estoy aquí");
    }



    public static void excepcionConStrackTrace() {

        try {

            int valor = 5 / 0;

        } catch (ArithmeticException e) {
            System.out.println("Esto es una division por cero");

            for (StackTraceElement valor : e.getStackTrace()) {

                System.out.println(" --> Linea " + valor.getLineNumber() + " " + valor.getMethodName());

            }
        }
    }

    public static void excepcionNormal() {

        int valor = 5;

        try {
            valor = valor / 0;  // la estás capturando
        } catch (ArithmeticException e) {
            //  valor = valor / 1; esto es rebundante
        }
        System.out.println("Estoy aquí, valor tiene: " + valor);

    }


    public static void divisionPorCero(int valor, int dividendo) throws ArithmeticException, IOException {

        int resultado = 0;

        try {

            resultado = valor / dividendo;

            if (dividendo == 1) {

                throw new IOException();

            }


        } catch (ArithmeticException e) {

            throw new ArithmeticException();

        }

    }

}
