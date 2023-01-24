package mediator;

public class ColegaConcreto2 extends Colega{

    @Override
    void recibe() {
        System.out.println("He recibido un mensaje, soy ColegaConcreto2");
    }

    @Override
    void envia() {
        System.out.println("Soy ColegaConcreto2, envío un mensaje");
        mediator.reenvia(this);

    }
}
