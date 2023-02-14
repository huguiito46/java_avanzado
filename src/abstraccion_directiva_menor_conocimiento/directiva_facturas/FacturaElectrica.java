package abstraccion_directiva_menor_conocimiento.directiva_facturas;

abstract public class FacturaElectrica {

    double impuesto = 21;

    double obtenerImpuesto(double precio){

        return precio * impuesto / 100;
    }

    abstract double calcular();

}
