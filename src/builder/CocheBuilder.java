package builder;

public class CocheBuilder {

    Vehiculo vehiculo;

    public CocheBuilder(String marca) {

        vehiculo = new Vehiculo();
        vehiculo.marca = marca;

    }

    public CocheBuilder setPuertas(int puertas) {

        vehiculo.puertas = puertas;
        return this; // La instancia actual de mi clase

    }

    public CocheBuilder setMotor(String motor) {

        vehiculo.motor = motor;
        return this; // La instancia actual de mi clase

    }


    public Vehiculo build(){

        return this.vehiculo;

    }



}
