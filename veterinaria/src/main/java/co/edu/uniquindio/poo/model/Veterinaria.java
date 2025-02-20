package co.edu.uniquindio.poo.model;

public class Veterinaria {
    private String nombre;
    private String ubicacion;
    private String nit;

    private Mascota listaMascotas [];

    public Veterinaria(String nombre,String ubicacion,String nit,
                       int cantidadMascotas){
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.nit = nit;
        this.listaMascotas = new Mascota[cantidadMascotas];
    }

    //C(create)R(read)U(update)D(delete)

    public String registrarMascota(Mascota mascota){
        String mensaje    = "";
        int posDisponible = -1;

        posDisponible = buscarPosicionDisponible();
        if(posDisponible == -1){
            mensaje = "No hay cupos disponibles para la atencion de la mascota";
        }else{
            listaMascotas[posDisponible] = mascota;
            mensaje = "Mascota atendida";
        }
        return mensaje;
    }

    public Mascota buscarMascota(String nombre){
        for (int i = 0; i < listaMascotas.length; i++) {
            Mascota mascotaAux = listaMascotas[i];
            if(mascotaAux.getNombre().equals(nombre)){
                return mascotaAux;
            }
        }
        return null;
    }


    private int buscarPosicionDisponible() {
        int posDisponible = -1;
        for (int i = 0; i < listaMascotas.length; i++) {
            Mascota mascotaAux = listaMascotas[i];
            if(mascotaAux == null){
                return i;
            }
        }
        return posDisponible;
    }


}
