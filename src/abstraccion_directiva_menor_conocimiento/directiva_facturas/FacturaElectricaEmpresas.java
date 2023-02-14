package abstraccion_directiva_menor_conocimiento.directiva_facturas;

public class FacturaElectricaEmpresas extends FacturaElectrica {
    @Override
    double calcular() {
        return 0.55 + obtenerImpuesto(0.55);
    }

}
