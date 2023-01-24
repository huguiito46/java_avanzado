package adapter;

public class Lighbulb {



    boolean powerOn = false;
    int voltage = 0;


    public void turnoOn(int voltage){
        powerOn = true;
        this.voltage = voltage;

        System.out.println("Lightbuld powerOn with: " +voltage+ " of current");
    }

    public void turnOff(){

        powerOn = false;
        voltage = 0;
        System.out.println("Lightbuld powerOff" );

    }

    public boolean isPowerOn(){
        return  powerOn;

    }


}
