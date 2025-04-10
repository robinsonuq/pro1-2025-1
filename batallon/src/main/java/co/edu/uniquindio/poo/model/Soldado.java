package co.edu.uniquindio.poo.model;

import java.util.List;

public record Soldado(String id, String nombres, String apellidos, List<Mision> misMisiones) {
    public void cuidarBosques(){
        System.out.println("Cuidando");
    }

    public void vigilar(){
        System.out.println("Vigilando");
       int vigilado =  MatematicasUtil.sumar(20,40);

    }

    public static void limpiarArmamento(){
        System.out.println("Limpiar");
    }
}
