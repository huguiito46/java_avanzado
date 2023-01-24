package decorator;

public class TelefenoNextGent extends TelefonoDecorator{
    public TelefenoNextGent(Telefono telefono) {
        super(telefono);
    }

    @Override
    public void crear(){

        super.crear();
        tengo5G();
        volte();

    }


    public void tengo5G(){

        System.out.println("  ---> nextgent: Tengo también 5G");

    }

    public void volte(){

        System.out.println(" ---- nextgent: Tengo también Volte");


    }

}
