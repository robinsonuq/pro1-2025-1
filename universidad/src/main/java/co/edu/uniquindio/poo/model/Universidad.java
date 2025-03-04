package co.edu.uniquindio.poo.model;

import java.awt.geom.CubicCurve2D;
import java.util.ArrayList;

public class Universidad {
    private String nombre;
    private String ubicacion;
    private ArrayList<Estudiante> listaEstudiantes;

    /**
     * Este metodo permite inicializar los valores de los atribuctos de una universida
     * @param nombre
     * @param ubicacion
     */
    public Universidad(String nombre,String ubicacion){
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.listaEstudiantes = new ArrayList<Estudiante>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public ArrayList<Estudiante> getListaEstudiantes() {
        return listaEstudiantes;
    }

    public void setListaEstudiantes(ArrayList<Estudiante> listaEstudiantes) {
        this.listaEstudiantes = listaEstudiantes;
    }

    @Override
    public String toString() {
        return "Universidad{" +
                "nombre='" + nombre + '\'' +
                ", ubicacion='" + ubicacion + '\'' +
                ", listaEstudiantes=" + listaEstudiantes +
                '}';
    }
}
