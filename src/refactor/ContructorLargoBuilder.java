package refactor;

public class ContructorLargoBuilder {

    String marca;
    String modelo;
    String motor;
    int puertas;

    private ContructorLargoBuilder(){}

    public ContructorLargoBuilder(String marca){
        this.marca = marca;

    }

    public ContructorLargoBuilder conModelo(String modelo){
        this.modelo = modelo;
        return this;

    }


    public ContructorLargoBuilder conMotor(String motor){
        this.motor = motor;
        return this;

    }

    public ContructorLargoBuilder conPuertas(int puertas){
        this.puertas = puertas;
        return this;

    }


}
