package abstraccion_directiva_menor_conocimiento.directiva_facturas;

public class Main {

    public static void main(String[] args) {

        FacturaElectrica fe = new FacturaElectricaEmpresas();
        System.out.println(fe.calcular());

        FacturaElectrica fev = new FacturaElectricaUsuarios();
        System.out.println(fev.calcular());

    }


}
