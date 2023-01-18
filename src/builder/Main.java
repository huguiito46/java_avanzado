package builder;

public class Main {

    public static void main(String[] args) {

        //Vehiculo vehiculo = new Vehiculo();

        Vehiculo coche = new CocheBuilder("Seat")
                .setPuertas(5)
                .setMotor("Electrico")
                .build();


        System.out.println("Marca " + coche.getMarca());
        System.out.println("Puertas " + coche.getPuertas());
        System.out.println("Motor " + coche.getMotor());


        StringBuilder cadena = new StringBuilder("Hola ");
        cadena.append("amigos ").append("del ").append("curso ");
        System.out.println(cadena);




    }


}
