package state;

public class EstadoCamaraAbierta extends Estado{


    public EstadoCamaraAbierta(Telefono telefeno) {
        super(telefeno);
    }

    @Override
    public String desbloquear() {
        return "desbloquear(); YA ESTABA DESBLOQUEADO EL MOVIL";
    }

    @Override
    public String abrirCamara() {
        return "abrirCamara(): LA CAMARA YA LA HABÍAS ABIERTO";
    }

    @Override
    public String hacerFoto() {
        telefono.cambiaEstado(new EstadoHacerFoto(telefono));
        return "La foto se va ha disparar ya";

    }
}
