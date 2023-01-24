package state;

public class EstadoBloqueado extends Estado{


    public EstadoBloqueado(Telefono telefono) {
        super(telefono);
    }

    @Override
    public String desbloquear() {

        telefono.cambiaEstado(new EstadoDesbloqueado(telefono));
        return "desbloquear(): Móvil desbloqueado procede";

    }

    @Override
    public String abrirCamara() {
        return "abrircamara(): La camara está bloqueada. Desbloquea el móvil antes";
    }

    @Override
    public String hacerFoto() {
        return "hacerfoto(): La camara esta bloqueada. Desbloquea el móvil antes";
    }
}
