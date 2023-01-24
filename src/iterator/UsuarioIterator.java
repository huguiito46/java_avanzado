package iterator;

/*

next(); --> siguiente elemento en una lista
reset(); --> reinicia el contador de usuarios a 0
hasMore(); --> indica si hay más elementos

 */
public interface UsuarioIterator {

    // Hay más usuarios en el Iterador?¿
    boolean hayMas();

    // Reinicia el contador (el iterador)
    void reinicia();

    //Obtiene el siguiente//
    Usuario siguiente();


}
