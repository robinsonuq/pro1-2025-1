package co.edu.uniquindio.poo.app;

import co.edu.uniquindio.poo.model.Mascota;
import co.edu.uniquindio.poo.model.Veterinaria;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        String nombre = JOptionPane.showInputDialog(null,"Por favor ingrese el nombre de la mascota");
        String especie = "perro";
        String raza = "pincher";
        byte edad = 5;
        String genero = "M";
        String color = "cafe";
        float peso = 2.3f;


        Veterinaria veterinaria =  new Veterinaria("Los peludos",
                "uq","234567",5);
         Mascota mascota = new Mascota(nombre,especie,raza,
              (byte)edad,genero,color,peso);

        veterinaria.registrarMascota(mascota);

        veterinaria.buscarMascota("zeus");

      // mascota.setNombre("Luna");

       //System.out.println(mascota.getNombre());

        //JOptionPane.showMessageDialog(null,mascota);


    }
}