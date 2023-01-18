package prototype_cloneable;

/*
El patrón prototype tiene como objectivo clonarse a sí mismo, es decir una clase se clone asi misma
y que ese clon herede todos los métodos y las propiedades de su propio.
*/


public class Main {

    public static void main(String[] args) {

        Coche coche = new Coche();
        coche.marca = "Seat";
        coche.puertas = 5;
        coche.modelo = "Ibiza";

        System.out.println(coche.marca +  "  " +coche.modelo+ "  " +coche.puertas);

        Coche clonado = coche.clonar();
        clonado.puertas = 3;
        System.out.println(clonado.marca +  "  " +clonado.modelo+ "  " +clonado.puertas);


    }

}
