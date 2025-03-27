package co.edu.uniquindio.poo.model;

public class Perro extends Animal {

    private String raza;

    public Perro(String nombre, int edad, float peso, String raza) {
        super(nombre, edad, peso);
        this.raza = raza;
    }

    @Override
    public void hacerSonido() {
        System.out.println("Guau Guau");
    }

    @Override
    public void comer() {
        int contador = 0;
        while(contador != 100){
            System.out.println("Perro comiendo");
            contador++;
        }


    }
}
