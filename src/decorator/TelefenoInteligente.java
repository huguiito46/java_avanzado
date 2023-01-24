package decorator;

public class TelefenoInteligente extends TelefonoDecorator{

    public TelefenoInteligente(Telefono telefono) {
        super(telefono);
    }

    @Override
    public void crear(){
        super.crear();
        System.out.println(" ----------> inteligente: Tengo también 4G bro");

    }

}
