package co.edu.uniquindio.poo.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Vector;

public class Reserva {
    private int codigoReserva;
    private LocalDate fecha;
    private Ruta ruta;
    private Conductor conductor;
    private Vehiculo vehiculo;

    private ArrayList<Pasajero> listapasajeros = new ArrayList<Pasajero>();

    public Reserva(int codigoReserva, LocalDate fecha, Ruta ruta, Conductor conductor, Vehiculo vehiculo) {
        this.codigoReserva = codigoReserva;
        this.fecha = fecha;
        this.ruta = ruta;
        this.conductor = conductor;
        this.vehiculo = vehiculo;
    }

    public double calcularCosto(){
        double costo = 0;
        costo = vehiculo.calcularCosto(this);
        return costo;
    }
}
