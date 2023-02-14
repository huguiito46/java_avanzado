package argumentos;

/*
   System.out.println("Parámetros recibidos " +args.length);

        for(String arg : args){
            System.out.println("Argumento es: " +arg);
        }

        for (int i=0;i< args.length;i++){
            System.out.println("Argumento recibido " +args[i] + " esta en la posición " +i);
        }

    }
     int opcionMinVal = Integer.parseInt(args[1]); // convertimos el valor a entero

        System.out.println("Opción " +opcionMinVal + " " +opcionMinVal);


    Introducción de valores por parámetros

    if(args[0].equalsIgnoreCase("uno")) {
            System.out.println("Hola!");

        }else if (args[0].equalsIgnoreCase("dos")){
            System.out.println("adios! ");
        }
 */

public class Main {

    /*
     ---opción VALOR

     +----------+------+-------------+-------+
     | --minval  | -10 | --maxval  | 100     |
     |----------+------+-------------+--------
     |    0     |  1   |    2        |  3    |
     +----------+------+-------------+-------+
     */

    public static void main(String[] args) {

    OptionsParser optionsParser = new OptionsParser(args);
    optionsParser.regiterOption("minval");
    optionsParser.regiterOption("maxval");
    optionsParser.parse();

    String minVal = optionsParser.getOption("minval");

    System.out.println("MinVal es " +minVal);

    }
}
