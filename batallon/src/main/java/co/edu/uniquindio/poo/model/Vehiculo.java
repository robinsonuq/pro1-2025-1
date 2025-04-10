package co.edu.uniquindio.poo.model;

import java.util.ArrayList;
import java.util.Arrays;

public abstract class Vehiculo {
    private String id;
    private String modelo;
    private int anioFabricacion;
    private float kilometraje;
    private EstadoOperativo estadoOperativo;
    private ArrayList<Mision> misiones;




    public Vehiculo(String id, String modelo, int anioFabricacion, float kilometraje, EstadoOperativo estadoOperativo) {
        this.id = id;
        this.modelo = modelo;
        this.anioFabricacion = anioFabricacion;
        this.kilometraje = kilometraje;
        this.estadoOperativo = estadoOperativo;
        this.misiones = new ArrayList<>();
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public int getAnioFabricacion() {
        return anioFabricacion;
    }
    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }
    public float getKilometraje() {
        return kilometraje;
    }
    public void setKilometraje(float kilometraje) {
        this.kilometraje = kilometraje;
    }
    public EstadoOperativo getEstadoOperativo() {
        return estadoOperativo;
    }
    public void setEstadoOperativo(EstadoOperativo estadoOperativo) {
        this.estadoOperativo = estadoOperativo;
    }
    public ArrayList<Mision> getMisiones() {
        return misiones;
    }
    public void setMisiones(Mision mision) {
        this.misiones.add(mision);
    }
    public int getNumMisiones() {
        return misiones.size();
    }
}

