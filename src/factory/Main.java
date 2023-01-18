package factory;


/*
El patrón factory lo que nos permite es coexionar una jerarquia de clases en una unica.
 */

public class Main {

    public static void main(String[] args) {

        PrecioFactory precio = new PrecioFactory("españa");
        System.out.println(precio.getPrecio());

        PrecioFactory precio2 = new PrecioFactory("usa");
        System.out.println(precio2.getPrecio());

        PrecioFactory precio3 = new PrecioFactory("uk");
        System.out.println(precio3.getPrecio());

        /*
        Sin el patrón factory hay que instanciar la clase PrecioGBP, pero con el patrón precioFactory usamos la misma implemntación
        PrecioGBP precioGBP = new PrecioGBP();
        System.out.println(precioGBP.getPrecio());

         */
    }

}
