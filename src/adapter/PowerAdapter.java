package adapter;

public class PowerAdapter implements Enchufable{

    public Lighbulb lighbulb = new Lighbulb();


    @Override
    public void enciende() {

        lighbulb.turnoOn(110);

    }

    @Override
    public void apaga() {

        lighbulb.turnOff();

    }

    @Override
    public boolean estaEncendido() {
        return false;
    }
}
