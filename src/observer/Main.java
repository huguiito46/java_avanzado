package observer;

public class Main {

    public static void main(String[] args) {

        Emisora emisora = new Emisora();

        ReceptorTv tv = new ReceptorTv();

        ReceptorRadio radio = new ReceptorRadio();

        ReceptorSatelite sat = new ReceptorSatelite();


        emisora.meteReceptor(tv);
        emisora.meteReceptor(radio);
        emisora.meteReceptor(sat);

        emisora.emite();

    }

}
