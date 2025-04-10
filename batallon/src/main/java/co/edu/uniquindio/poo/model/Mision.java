package co.edu.uniquindio.poo.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Mision {
    private String id;
    private String ubicacion;
    private LocalDate fecha;
    private List<Soldado> listaSoldados = new ArrayList<>();

    public Mision(String id, String ubicacion, LocalDate fecha) {
        this.id = id;
        this.ubicacion = ubicacion;
        this.fecha = fecha;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public List<Soldado> getListaSoldados() {
        return listaSoldados;
    }

    public void setListaSoldados(List<Soldado> listaSoldados) {
        this.listaSoldados = listaSoldados;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mision mision = (Mision) o;
        return Objects.equals(id, mision.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
