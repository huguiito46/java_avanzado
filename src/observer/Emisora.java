package observer;

import java.util.ArrayList;

public class Emisora {

    private final ArrayList<Receptor> receptor  = new ArrayList<>();

    public void meteReceptor(Receptor receptor){
        this.receptor.add(receptor);
    }


    public void emite(){

        for (Receptor receptor  : receptor){

            receptor.recibe();
        }

    }


}
