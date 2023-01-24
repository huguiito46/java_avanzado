package decorator;

/*

Patr

 */


public class Main {

    public static void main(String[] args) {

        /*
        TelefonoBasico telefonoBasico = new TelefonoBasico();
        telefonoBasico.crear();
        /*
        */


        TelefenoInteligente ti = new TelefenoInteligente(new TelefonoBasico());
        ti.crear();

        TelefenoNextGent nextGent = new TelefenoNextGent(new TelefenoInteligente(new TelefonoBasico()));
        nextGent.crear();

    }

}
