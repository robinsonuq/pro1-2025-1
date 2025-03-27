package co.edu.uniquindio.poo.model;

import java.util.ArrayList;
import java.util.List;

public class Zoologico {

    private List<Animal> listaAnimales = new ArrayList<>();

    public void registarAnimal(Animal animal){
        listaAnimales.add(animal);
    }

}
