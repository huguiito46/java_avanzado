package abstraccion_directiva_menor_conocimiento.directiva_facturas;

public class FacturaElectricaUsuarios extends FacturaElectrica{


    @Override
    double calcular() {
        return 0.10 + obtenerImpuesto(0.55);
    }

}
