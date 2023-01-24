package mediator;

abstract class Colega {

     public Mediator mediator;

     public Colega(){

         System.out.println("Estoy en el constructor de la clase padre");

     }

    public void setMediator(Mediator mediator){
        this.mediator = mediator;
    }

    abstract void recibe();
    abstract void envia();


}
