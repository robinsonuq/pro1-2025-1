package co.edu.uniquindio.poo.model;
/**
 *
 */
public class Mascota {
    private String nombre;
    private String especie;
    private String raza;
    private byte edad;
    private String genero;
    private String color;
    private float peso;

    public Mascota(String nombre, String especie,
                   String raza, byte edad,
                   String genero,
                   String color, float peso) {
        this.nombre = nombre;
        this.especie = especie;
        this.raza = raza;
        this.edad = edad;
        this.genero = genero;
        this.color = color;
        this.peso = peso;
    }

    public String getNombre(){
        return nombre;
    }
    public String getEspecie(){
        return especie;
    }

    public float getPeso(){
        return peso;
    }

    public String getRaza(){
        return raza;
    }
    public String getGenero(){
        return genero;
    }
    public String getColor(){
        return color;
    }
    public byte getEdad(){
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {

        return "Mi mascota se llama "+nombre+" y tiene "+edad+" años";
    }
}
