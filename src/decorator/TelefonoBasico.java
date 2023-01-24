package decorator;

public class TelefonoBasico implements Telefono{
    @Override
    public void crear() {
        System.out.println("Soy un teléfono basico tengo estas caracteristicas: ");
        tengoGSM();
        tengoSMS();
    }

    private void tengoGSM(){

        System.out.println("   -> basico: Tengo GSM");

    }


    private void tengoSMS(){
        System.out.println("   -> basico: Tengo SMS");


    }

}
