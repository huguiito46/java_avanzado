package decorator;
public class TelefonoDecorator implements Telefono{

    private final Telefono telefono;

    public TelefonoDecorator(Telefono telefono){

        this.telefono = telefono;

    }
    @Override
    public void crear() {

        this.telefono.crear();

    }
}
