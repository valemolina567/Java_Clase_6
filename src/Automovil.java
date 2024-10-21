import java.sql.SQLOutput;
import java.util.List;
import java.util.Scanner;
public class Automovil {
    // Declaración de atributos.
    private String marca;
    private String modelo;
    private String color;
    private String anio;

    // ATRIBUTO ESTÁTICO
    static int llantas = 4; // Atributo de tipo estático.
    // Se puede leer pero no settear.
    // Solo le sirve a la clase.

    // Constructores
    public void Automovil(){

    }


    public Automovil(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public Automovil(String marca, String modelo, String color) {
        this(marca, modelo); // Llamar al constructor.
        this.color = color;
    }

    public Automovil(String marca, String modelo, String color, String anio) {
        this(marca, modelo,color);
        this.anio = anio;
    }

    // Creación de getters y setters.

    public String getMarca() {
        return marca;
    }

    public void setMarca(String nombre) {
        this.marca = nombre;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String posicion) {
        this.modelo = posicion;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String lugar_nacimiento) {
        this.color = lugar_nacimiento;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String nacionalidad) {
        this.anio = nacionalidad;
    }


    // Metodo para mostrar la información del jugador.
    public void verDetalle(){
        System.out.println("Marca:  " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Color: " + getColor());
        System.out.println("Anio: " + getAnio());
        System.out.println("Llantas: " + Automovil.llantas);
    }

    // Modicación de los métodos de Java.

}
