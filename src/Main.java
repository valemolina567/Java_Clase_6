public class Main {
    public static void main(String[] args) {
        // Instanciar un objeto de la clase Jugador
        Automovil hyundai = new Automovil("Hyundai","i10", "Blanco","2024");
        // Se puede asignar valores mediante el constructor y también mediante los métodos de setters.
        System.out.println("Información del Automovil: \n");
        hyundai.verDetalle();

        // Instanciar un objeto de la clase Director.
        Celulares umidigi = new Celulares("Umidigi", "A11 Pro Max", "Azul"); //  Utilizando el constructor.
        // Utilizando getters y setters.
        umidigi.setMarca("Umidigi");
        umidigi.setModelo("A11 Pro Max");
        umidigi.setColor("Azul");
        umidigi.verDetalle();
    }
}