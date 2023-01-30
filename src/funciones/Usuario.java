package funciones;

public class Usuario {

    public String nombre;
    public String apellidos;
    public boolean puedeConducir;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public boolean isPuedeConducir() {
        return puedeConducir;
    }

    public void setPuedeConducir(boolean puedeConducir) {
        this.puedeConducir = puedeConducir;
    }
}
