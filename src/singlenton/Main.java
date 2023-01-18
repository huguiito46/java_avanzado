package singlenton;

/*
Otros usos que tiene compartir la misma base de datos, abrir el mismo fichero, esto al final y al cabo es una instancia compartida
 */

public class Main {

    public static void main(String[] args) {

        Singleton singleton = Singleton.getInstance();
        singleton.setContador(15);


        Singleton singleton2 = Singleton.getInstance(); // Coge la instancia previa //


        System.out.println("Valor: " +singleton.getContador() + " en memoria: " +singleton);
        System.out.println("Valor: " +singleton2.getContador() + " en memoria: " +singleton2);


        Aplicacion app = Aplicacion.getInstance(); // new Aplicación //
        Aplicacion app2 = Aplicacion.getInstance(); // app2 = app , no permite hacer un new //


        /*
        Compartimos la instancia en app y app2
         */

        app.Run();
        app2.Run();

        System.out.println(app + " " +app2 );


    }

}
