package programacion_funcional;

/*
Principios de las funciones puras
 */

/*
Function<Tipo de parametro que uso> <tipo de parametro que devuelvo>
 */

/*
 x -> es el parametro de entrada
 */


import java.util.function.Function;



public class Funcionales {

    private Function<String, String> toMayus = (x) -> x.toUpperCase();
    private Function<Integer, Integer> sumador = (x) -> x.sum(x,x);

    public void pruebas() {

        System.out.println(toMayus.apply("Hugo"));
        System.out.println(sumador.apply(5));

    }


    // Función imperativa
    public static String toMayuscula(String x) {

        return x.toUpperCase();

    }


    public void saluda(Function<String, String> mifuncion,String nombre){

       // mifuncion.apply()

    }


}
