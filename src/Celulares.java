public class Celulares {
    // Declaracion de atributos
    private String marca;
    private String modelo;
    private String color;
    // Constructores.

    public Celulares(String marca) {
        this.marca = marca;
    }

    public Celulares(String marca, String modelo) {
        this(marca);
        this.modelo = modelo;
    }

    public Celulares(String marca, String modelo, String color) {
        this(marca, modelo);
        this.color = color;
    }

    // Getters y Setters.

    public String getMarca() {
        return marca;
    }

    public void setMarca(String nombre) {
        this.marca = nombre;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String equipo) {
        this.modelo = equipo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String edad) {
        this.color = edad;
    }

    public void verDetalle(){
        System.out.println("Marca:  " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Color: " + getColor());
    }
}
