package singlenton;

public class Singleton {

    private static Singleton singleton;


    /*
    Devuelve una instancia de la clase Singlenton, no nos la devuelve siempre
    El patrón siglenton lo que quiere es que solo haya una instancia unica
     */
    public static Singleton getInstance() {

        if (singleton == null) {

            singleton =  new Singleton(); // Invoca a su propio constructor
        }

        return singleton;

    }

    private Singleton() {
    }

    int contador;

    public int getContador() {

        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }
}
