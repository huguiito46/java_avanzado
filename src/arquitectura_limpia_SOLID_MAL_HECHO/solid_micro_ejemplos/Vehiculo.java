package arquitectura_limpia_SOLID_MAL_HECHO.solid_micro_ejemplos;

/*
El principio de responsabilidad unica nos dice que una clase solo puede hacer una cosa.
 */

abstract class Vehiculo {
    String tipo;

    public Vehiculo() {
    }

    abstract int obtenerPotencia();

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}


class Coche extends Vehiculo {

    public Coche() {
        super();
    }

    ;

    public Coche(String tipo) {
        super();
    }

    @Override
    int obtenerPotencia() {
        return 1000;
    }
}

class Moto extends Vehiculo {

    public Moto() {
    }

    @Override
    int obtenerPotencia() {
        return 1000;
    }
}

class Furgoneta extends Vehiculo {

    public Furgoneta() {
    }

    @Override
    int obtenerPotencia() {
        return 750;
    }
}




