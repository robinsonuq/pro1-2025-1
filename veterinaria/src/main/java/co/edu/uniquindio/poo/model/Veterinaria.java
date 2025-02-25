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
            if(mascotaAux != null && mascotaAux.getNombre().equals(nombre)){
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

    public String eliminarMascota(String nombre){
        String mensaje = "Mascota no existe";
        for (int i = 0; i < listaMascotas.length; i++) {
            Mascota aux = listaMascotas[i];
            if(aux != null && aux.getNombre().equals(nombre)){
                listaMascotas[i] = null;
                return "Mascota eliminada";
            }
        }
        return mensaje;
    }
// 7 +

    public String actualizarMascota(String nombreActual, String newNombre,String newRaza){
        String mensaje            = "La mascota a actualizar no existe";
        Mascota mascotaEncontrada = null;

        mascotaEncontrada = buscarMascota(nombreActual);
        if(mascotaEncontrada != null){
            mascotaEncontrada.setNombre(newNombre);
            mascotaEncontrada.setRaza(newRaza);
            return "La informacion de la mascota ha sido actualizada";
        }
        return mensaje;
    }

    public double calacularPromedioEdades(){
        double promedio = 0;
        int contadorMascotas = 0;
        for (int i = 0; i < listaMascotas.length; i++) {
            Mascota mascotaAux = listaMascotas[i];
            if(mascotaAux != null){
                promedio += mascotaAux.getEdad();
                contadorMascotas++;
            }
        }
        return promedio/contadorMascotas;
    }

    public int edadmasRepite(){
        int edadmayorFrecuencia = 0;
        int contadorMayorFrecuencia = 0;

        for (int i = 0; i < listaMascotas.length; i++) {
                Mascota mascota = listaMascotas[i];
                if(mascota != null){
                    int edad = mascota.getEdad();
                    int contador = 0;
                    for (int j = 0; j < listaMascotas.length; j++) {
                        Mascota mascota2 = listaMascotas[i];
                        if(mascota2 != null){
                            int edad2 = mascota.getEdad();
                            if(edad == edad2){
                                contador ++;
                            }
                    }
                        if(contador > contadorMayorFrecuencia){
                            contadorMayorFrecuencia = contador;
                            edadmayorFrecuencia = edad;
                        }
                }
        }

        return edadmayorFrecuencia;

    }









}
