package arquitectura_limpia_SOLID_MAL_HECHO.solid_micro_ejemplos;

public class MainSOLID {

    public static void main(String[] args) {

        Vehiculo[] vehiculos = {
                new Coche(),
                new Moto(),
                new Furgoneta()
        };

        imprimirPotencia(vehiculos);

    }

    public static void imprimirPotencia(Vehiculo[] vehiculos) {

        for (Vehiculo vehiculo : vehiculos) {
            System.out.println(vehiculo.obtenerPotencia());

        }

    }


}
