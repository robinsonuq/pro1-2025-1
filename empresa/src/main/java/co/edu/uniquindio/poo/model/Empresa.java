package co.edu.uniquindio.poo.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Empresa {
    private String nombre;
    private String nit;
    private List<Conductor> listaConductores;
    private List<Pasajero> listaPasajeros;
    private List<Reserva> listaReservas;
    private List<Vehiculo> listaVehiculos;
    private List<Ruta> listaRutas;

    public Empresa(String nombre,String nit){
        this.nombre = nombre;
        this.nit = nit;
        this.listaConductores = new ArrayList<>();
        this.listaPasajeros = new ArrayList<>();
        this.listaReservas = new ArrayList<>();
        this.listaRutas = new ArrayList<>();
        this.listaVehiculos = new ArrayList<>();
    }
    public void setNombre (String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return nombre;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public List<Conductor> getListaConductores() {
        return listaConductores;
    }

    public void setListaConductores(List<Conductor> listaConductores) {
        this.listaConductores = listaConductores;
    }

    public List<Pasajero> getListaPasajeros() {
        return listaPasajeros;
    }

    public void setListaPasajeros(List<Pasajero> listaPasajeros) {
        this.listaPasajeros = listaPasajeros;
    }

    public List<Reserva> getListaReservas() {
        return listaReservas;
    }

    public void setListaReservas(List<Reserva> listaReservas) {
        this.listaReservas = listaReservas;
    }

    public List<Vehiculo> getListaVehiculos() {
        return listaVehiculos;
    }

    public void setListaVehiculos(List<Vehiculo> listaVehiculos) {
        this.listaVehiculos = listaVehiculos;
    }

    public List<Ruta> getListaRutas() {
        return listaRutas;
    }

    public void setListaRutas(List<Ruta> listaRutas) {
        this.listaRutas = listaRutas;
    }

    public double calcularCostoReserva(String codigoReserva){
        double costoTotal = 0;
        Reserva reservaEncontrada = null;

        reservaEncontrada = buscarReserva(codigoReserva);
        if(reservaEncontrada == null){
            throw  new RuntimeException("NO existe esa reserva");
        }
        costoTotal = reservaEncontrada.calcularCosto();
        return costoTotal;
    }

    public double calcularCostoReserva2(String codigoReserva){
        double costoTotal = 0;
        Reserva reservaEncontrada = null;

        Optional<Reserva> reservaOptional = buscarReserva(codigoReserva);

        if(!reservaOptional.isPresent()){
            throw  new RuntimeException("NO existe esa reserva");
        }
        reservaEncontrada = reservaOptional.get();
        costoTotal = reservaEncontrada.calcularCosto();
        return costoTotal;
    }















}
