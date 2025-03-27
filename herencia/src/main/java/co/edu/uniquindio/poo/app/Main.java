package co.edu.uniquindio.poo.app;

import co.edu.uniquindio.poo.model.Animal;
import co.edu.uniquindio.poo.model.Gato;
import co.edu.uniquindio.poo.model.Perro;
import co.edu.uniquindio.poo.model.Zoologico;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Zoologico zoologico = new Zoologico();
        Gato gato = new Gato("Michi",2,12.5f,"Siamés",6);
        ArrayList<Object> basura = new ArrayList<>();
        Celular cel1 = new Celular();
        basura.add("Hola");//0
        basura.add(gato);//1
        basura.add(1234);//2
        basura.add(cel1);//3

        Object objeto =  basura.get(1);

        if usted si es un celular
        Celular celular = (Celular)objeto;
        celular.llamar();







        Gato gato = new Gato("Michi",2,12.5f,"Siamés",6);
        gato.comer();
        zoologico.registarAnimal(gato);


        Perro perro = new Perro("Lucifer",3,12.3f,"Pincher");
        zoologico.registarAnimal(perro);

        perro.comer();

        perro.dormir();





    }
}