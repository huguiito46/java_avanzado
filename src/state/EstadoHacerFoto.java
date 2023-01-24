package state;

public class EstadoHacerFoto extends Estado {


    public EstadoHacerFoto(Telefono telefeno) {
        super(telefeno);
    }

    @Override
    public String desbloquear() {
        return "Movil ya desbloqueado";
    }

    @Override
    public String abrirCamara() {
        return "Camara ya la habías abierto";
    }

    @Override
    public String hacerFoto() {
        //this.telefono.cambiaEstado(new EstadoDesbloqueado(telefono));
        return "La foto ya se ha hecho";
    }
}
