package co.edu.uniquindio.poo.model;



import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Batallon {
    private String numeroBatallon;
    private List<Vehiculo> listaVehiculos;
    private List<Mision> listaMisiones;
    private List<Soldado> listaSoldados;

    public Batallon(String numeroBatallon) {
        this.numeroBatallon = numeroBatallon;
        this.listaVehiculos = new ArrayList<>();
        this.listaMisiones = new ArrayList<>();
        this.listaSoldados = new ArrayList<>();
    }

    public Vehiculo obtenerVehiculoMayorMisiones(){
        Vehiculo vehiculoMayorMisiones = null;
        int mayor = -1;
        for (Vehiculo v: listaVehiculos ) {
            if(v.getNumMisiones() > mayor){
                mayor = v.getNumMisiones();
                vehiculoMayorMisiones = v;
            }
        }

        return vehiculoMayorMisiones;
    }

    public String registrarVehiculo(Vehiculo nuevoVehiculo) {
        String mensaje = "";
        Optional<Vehiculo> optionalVehiculo = buscarVehiculo2(nuevoVehiculo.getId());
        if(optionalVehiculo.isPresent()){
            mensaje = "Vehiculo ya existe en la lista de vehiculos";
        }else{
            listaVehiculos.add(nuevoVehiculo);
            mensaje = "Vehiculo registrado correctamente";
        }

        return mensaje;
    }


    public String mostrarVehiculoPorID(String id) {
        String mensaje = "";
        Vehiculo vehiculoMostrar = null;
        vehiculoMostrar = buscarVehiculo(id);
        mensaje = vehiculoMostrar.toString();
        return mensaje;
    }

    public String mostrarListaVehciculos(){
        String mensaje = "";
        for(Vehiculo vehiculoAux : listaVehiculos){
            mensaje += vehiculoAux.toString();
        }
        return mensaje;
    }




    public String eliminarVehiculo(String id) {
        String mensaje = "";
        Vehiculo vehiculoEliminar = null;
        vehiculoEliminar = buscarVehiculo(id);
        if (vehiculoEliminar != null) {
            listaVehiculos.remove(vehiculoEliminar);
            mensaje = "Vehiculo eliminado correctamente";
        }else{
            mensaje  = "Vehiculo no existe para eliminar";
        }
        return  mensaje;
    }

    public String obtenerVehiculosMas50Misiones() {
        ArrayList<Vehiculo> vehiculosMas50Misiones = new ArrayList<>();
        for  (Vehiculo vehiculoAux : listaVehiculos) {
            if (vehiculoAux.getMisiones().size() > 50) {
                vehiculosMas50Misiones.add(vehiculoAux);
            }
        }
        String resultado = "";
        resultado += vehiculosMas50Misiones.toString();
        return resultado;
    }



    public String mostrarListaMisiones(){
        String mensaje = "";
        for(Mision misionAux : listaMisiones){
            mensaje = misionAux.toString();
        }
        return mensaje;
    }

    private Vehiculo buscarVehiculo(String id) {
        Vehiculo vehiculoEncontrado = null;
        for (Vehiculo vehiculoAux : listaVehiculos) {
            if (vehiculoAux.getId().equals(id)) {
                vehiculoEncontrado = vehiculoAux;
            }
        }
        return  vehiculoEncontrado;
    }
    private Optional<Vehiculo> buscarVehiculo2(String id) {
        return  listaVehiculos.stream().filter(v -> v.getId().equals(id)).findFirst();
    }

    public void registrarSoldado(Soldado soldado) {

        Optional<Soldado> optionalSoldado = buscarSoldado(soldado.id());
        if(optionalSoldado.isPresent()){
            throw new RuntimeException("El soldado ya existe");
        }
        listaSoldados.add(soldado);
    }

    private Optional<Soldado> buscarSoldado(String id) {
        return listaSoldados.stream().filter(soldado -> soldado.id().equals(id)).findFirst();
    }
}