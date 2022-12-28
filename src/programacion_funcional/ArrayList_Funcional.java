package programacion_funcional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class ArrayList_Funcional {


    public static void main(String[] args) {

        ArrayList<String> nombres = new ArrayList<>();

        nombres.add("Paco");
        nombres.add("Pepe");
        nombres.add("Juan");

        nombres.stream().forEach(x -> System.out.println(x));

        System.out.println("------------------------");

        Stream<String> valores = nombres.stream()
                .map((x) -> x.toUpperCase())
                .filter(x -> x.startsWith("P"));


        valores.forEach((x) -> System.out.println(x));

        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        var stNumeros = Arrays.stream(numeros);                   // Conviertes todo a un Stream de integers y lo consumes//
        //stNumeros.forEach(x -> System.out.println(x));
        var resultado = stNumeros
                .map(x -> x * 2)
                .filter(x -> x % 2 == 0)                          // Filter elimina y filtra!!
                .reduce(0,(x,y) ->  {
           // System.out.println("X es " +x+ "Y es " +y);
            return x + y;
        });


        int sumaTotal = 0;
        for ( int numero : numeros) {
            numero = numero * 2;
            if(numero % 2 != 0){
                continue;
            }
            sumaTotal += numero;

        }
        System.out.println("Mi suma de pares es  " +resultado+ " y con for: " +sumaTotal);
        //resultado.forEach(System.out::println);
    }

}
