package funciones;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] iNumeros = {1, 2, 3, 4, 5};

        int resultado = sumarNumeros(iNumeros);
        int resultadoDos = sumarCuatroValores(1, 2, 3, 4);

        System.out.println(sumarInfinitamente(1));
        System.out.println(sumarInfinitamente(1, 2));
        System.out.println(sumarInfinitamente(1, 2, 3, 4, 5, 6));


        Usuario usuario = new Usuario();
        Usuarios usuarios = new Usuarios();

        usuario.nombre = "Pepe";
        usuario.apellidos = "Botella";
        usuario.puedeConducir = false;


        Usuario usuario1 = new Usuario();
        usuario1.nombre = "Carla";
        usuario1.apellidos = "Pecas";
        usuario1.puedeConducir = false;

        try{
            usuarios.añadirUsuarios(usuario);
            usuarios.añadirUsuarios(usuario1,usuario1);
        }catch (UserException e){
            System.out.println("Error al añadir objeto de usuario " +e.getMessage());
        }

    }

    public static int sumarInfinitamente(int... numeros) {
        int resultado = 0;

        for (int numero : numeros) {

            resultado += numero;

        }

        return resultado;

    }


    // Función monadica porque solo tiene una variable en los parámetros
    public static int sumarNumeros(int[] numeros) {

        return Arrays.stream(numeros).reduce(0, (a, b) -> a + b);


    }

    // Funcion dialica porque tienen dos variables
    public static int sumarValores(int valorA, int valorB) {

        return valorA + valorB;

    }

    // Funcion triada porque tienen tres variables
    public static int sumarTresValores(int valorA, int valorB, int valorC) {

        return valorA + valorB + valorC;

    }

    // Función polidialica porque tienen 4 variables o más
    public static int sumarCuatroValores(int valorA, int valorB, int valorC, int valorD) {

        return valorA + valorB + valorC + valorD;

    }

    public static void determinarFruta(String fruta) {

        switch (fruta) {
            case "Pera" -> System.out.println("Es una pera");
            case "Melocoton" -> System.out.println("Es un melocotón");
            case "Banana" -> System.out.println("Es una banana");
            case "Manzana" -> System.out.println("Es una manzana");
            default -> System.out.println("No es ninguna fruta");
        }
    }

    public static boolean esLaborable(int dia) {

        return (dia > 0 && dia < 6);

    }

}
