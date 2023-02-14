package arquitectura_limpia_SOLID_MAL_HECHO;

/*
Principio de segregación de interfaz --> Dice no implementes interfaz en algo que no hace falta !!!!
 */

interface Animal {

    boolean beber();

    boolean volar();

}

interface animalVolador {

    boolean beber();

    boolean volar();

}


class Pajaro implements Animal, animalVolador {

    @Override
    public boolean beber() {
        return false;
    }

    @Override
    public boolean volar() {
        return false;
    }

    /*

    Esto no cumple los principios de la interfaz segregación
     */
    static class Perro implements animalVolador {
        @Override
        public boolean beber() {
            return false;
        }

        @Override
        public boolean volar() {
            return false;
        }
    }

}
