package refactor;

import java.lang.constant.Constable;

public class Main {

    public static void main(String[] args) {

        int[] numeros = {12, 23, -45, 1, 9};

        imprimirMayorYmenor(numeros);

        imprimirMayorYmenorInteliJ(numeros);

        ContructorLargoBuilder cosa = new ContructorLargoBuilder("marca")
                .conModelo("b")
                .conMotor("electrico")
                .conPuertas(5);


/*
        System.out.println(System.getProperty("java.runtime.name"));
        System.out.println(System.getProperty("version"));
 */
        esOpenJDKJavaEnWindows();
    }


      public static boolean esOpenJDKJavaEnWindows() {

        boolean runtimeOracle = System.getProperty("java.runtime.name").contains("OpenJDK");
        boolean osVersion = System.getProperty("os.version").compareTo("10.0") == 0 ? true : false;

        if(runtimeOracle && osVersion){
            System.out.println("Es openJDK JVM en Windows 11.6");
            return true;

        }
            return false;
      }



    public static boolean hoyEsDoming(int numero){

        boolean isDomingo = (numero == 7 ? true : false);

        /*


        if(numero == 7){
            isDomingo = true;
        }else {
            isDomingo = false;
        }
        */

        if(isDomingo){
            System.out.println(isDomingo);
        }else{
            return false;
        }


        return isDomingo;
    }

    public static boolean hoyEsDiaNumero(int numero){
        if(numero == 7){
            return true;
        }

        return false;

    }

    public static void imprimirMayorYmenor(int[] numeros) {

        int mayor = 0;
        int menor = numeros[0];

        for (int i = 0; i < numeros.length; i++) {
            if (mayor < numeros[i]) {

                mayor = numeros[i];

            }

            if (menor > numeros[i]) {

                menor = numeros[i];

            }

        }
        System.out.println("Mayor " + mayor + " y menor " + menor);

    }


    public static void imprimirMayorYmenorInteliJ(int[] numeros) {

        int mayor = 0;
        int menor = numeros[0];

        for (int numero : numeros) {
            if (mayor < numero) {
                mayor = numero;
            }
            if (menor > numero) {
                menor = numero;
            }
        }
        System.out.println("Mayor " + mayor + " y menor " + menor);

    }

    /*
    El operador ternario compara y asigna
     */

    public static void imprimirMayorYmenorTernario(int[] numeros) {

        int mayor = 0;
        int menor = numeros[0];

        for (int i = 0; i < numeros.length; i++) {

            mayor = mayor < numeros[i] ? numeros[i] : mayor;
            menor = menor > numeros[i] ? numeros[i] : menor;

        }

    }


    public static int ifAnidado(){

    int valor1 = 10;
    int valor2 = 10;

    if(valor1 > valor2){
        return valor1;
    }

    return valor2;

    }


}
