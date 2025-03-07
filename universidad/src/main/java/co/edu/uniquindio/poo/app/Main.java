package co.edu.uniquindio.poo.app;

import co.edu.uniquindio.poo.model.Universidad;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {


        Universidad universidad = new Universidad("Uiquindio", "Calle 12N");


            String nombre = JOptionPane.showInputDialog(null,"Ingrese el nombre");
            String identificacion = JOptionPane.showInputDialog(null,"Ingrese la identificacion");
            String mensaje = universidad.registrarEstudiante(nombre,identificacion);
            JOptionPane.showMessageDialog(null,mensaje);

            identificacion = "1094";
            String nombreNota = "Parcial 1";
            float valorNota = 5.0f;

            universidad.registrarNota(identificacion,nombreNota,valorNota);

            float nueoValorNota = 1.0f;
             universidad.actualizarNota(identificacion,nombreNota,nueoValorNota);
    }
}