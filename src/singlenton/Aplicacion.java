package singlenton;

/*
Forma de implementarlo hacer privado el constructor
implementar un método que actue como semi-constructor que es el getInstance() que crea la instancia
y verificar que no esté previamente creada
*/


public class Aplicacion {

    private static Aplicacion aplicacion;
    boolean isRuning = false;


    private Aplicacion() {
    }


    public static Aplicacion getInstance() {

        if (aplicacion == null) {  // Si la instancia no existe

            aplicacion = new Aplicacion(); // creamos la instancia

        }

        return aplicacion;  // Si ya existe la utilizamos
    }


    public void Run() {

        if (!isRuning) {
            System.out.println("Arrancando !!!");
            isRuning = true;

        } else {
            System.out.println("Ya en estaba en ejecución");
        }
    }
}
