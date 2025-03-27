package co.edu.uniquindio.poo.model;

public class Gato extends  Animal {

    private String raza;
    private int numeroBigotes;

    public Gato(String nombre,int edad,float peso, String raza, int numeroBigotes) {
        super(nombre,edad,peso);
        this.raza = raza;
        this.numeroBigotes = numeroBigotes;
    }

    @Override
    public void hacerSonido(){
        System.out.println("Miau Miau");
    }
    @Override
    public void comer(){
        System.out.println("El gato esta comiendo");
    }

    @Override
    public void dormir() {
        System.out.println("El gato esta durmiendo");
    }

}
