package organizacion_de_las_clases.encapsulacion;

public class Usuario {

    private String nombre;
    int edad;
    private String email;
    private long altura;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {

        Acceso acceso = new Acceso();
        acceso.setRetries(acceso.getRetries() + 1);

        this.nombre = nombre;

        /*
        Principio de responsabilidad unica una clase una función
         */
        EnviarCorreo correo = new EnviarCorreo();
        correo.enviarCorreoDeBienvenida(nombre);
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getAltura() {
        return altura;
    }

    public void setAltura(long altura) {
        this.altura = altura;
    }
}
