package recursividad_rendimiento;

import java.util.stream.IntStream;

// sumaRecursiva(5)
// SumaRecursiva(4) // 5 -1
// SumaRecursiva(3) // 4 -1
// SumaRecursiva(2) // 3 -1
// SumaRecursiva(1) // 2 -1
// SumaRecursiva(0) // 1 -1


/*
   long tiempoInicial = System.currentTimeMillis();

   for(int i=0;i<=100000;i++){

   sumaFuncional(5)

   }

   long tiempoFinal = System.currentTimeMillis();
    System.out.println("MS en total " +(tiempoFinal - tiempoInicial)));

 */


public class Main {

    public static void main(String[] args) {

        System.out.println("Suma iterativa " + suma(5));
        System.out.println("Suma recursiva " + sumaRecursiva(5));
        System.out.println("Suma funcional " + sumaFuncional(5));


        System.out.println("Factorial iterativa " + factorial(5));
        System.out.println("Factorial recursiva " + factorialRecursivo(5));
        System.out.println("Factorial funcional " + factorialFuncional(5));

        System.out.println("--------------------------");


        tailRecursion(5);

        System.out.println("-------------------");

        headRecursion(5);




    }


    public static int suma(int max) {

        int resultado = 0;

        for (int i = 0; i <= max; i++) {

            resultado = resultado + i;

        }
        return resultado;

    }

    public static int sumaRecursiva(int numero) {

        if (numero == 1) {
            return 1;
        }

        return numero + sumaRecursiva(numero - 1);
    }


    public static int sumaFuncional(int numero) {

        return IntStream.rangeClosed(1, 5).reduce(0, (a, b) -> a + b);

    }


    public static int factorial(int numero) {

        int resultado = 1;

        for (int i = 1; i <= numero; i++) {
            resultado = resultado * i;

        }

        return resultado;

    }


    public static int factorialRecursivo(int numero) {
        if (numero == 0) {
            return 1;
        }

        return numero * factorialRecursivo(numero - 1);
    }

    public static int factorialFuncional(int numero) {

        return IntStream.rangeClosed(1, 5)
                .reduce(1, (a, b) -> a * b);

    }

    public static void headRecursion(int valor) {

        if (valor == 0) {
            return;
        }

        headRecursion(valor - 1);
        System.out.println(valor);

    }

    public static void tailRecursion(int valor){

        if(valor == 0){

            return;
        }

        System.out.println(valor);
        tailRecursion(valor - 1);

    }

}
