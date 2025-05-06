package co.edu.uniquindio.poo.model;

public class Bus extends Vehiculo{
    @Override
    public double calcularCosto(Reserva reserva) {

        double costo = 0;

        costo = 3000 * reserva.getRuta().getDistancia();

        if(tieneEntretenimiento()){
            costo += 100;
        }
        return costo;
    }
}
