package co.edu.uniquindio.poo.model;

import java.util.Arrays;

public class Estudiante {
    private String nombre;
    private String identificacion;

    private Nota[] listaNotas = new Nota[5];

    public Estudiante (String nombre,String identificacion){
        this.nombre = nombre;
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public Nota[] getListaNotas() {
        return listaNotas;
    }

    public void setListaNotas(Nota[] listaNotas) {
        this.listaNotas = listaNotas;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", identificacion='" + identificacion + '\'' +
                ", listaNotas=" + Arrays.toString(listaNotas) +
                '}';
    }

    public String registrarNota(String nombreNota, float valorNota) {

        int posDisponible = -1;
        posDisponible = buscarPosicion();

        if(posDisponible == -1){
            return "NO hay espacio para mas notas";
        }else{
            Nota nota = new Nota(nombreNota,valorNota);
            listaNotas[posDisponible] = nota;
            return "La nota fue registrada";
        }
    }

    private int buscarPosicion() {

        for (int i = 0; i < listaNotas.length; i++) {
            if(listaNotas [i] == null){
                return i;
            }
        }
        return -1;
    }

    public float calcularDefinitiva(){
        int sumatoria = 0;
        float definitiva = 0;

        for(Nota notaAux : listaNotas){
            if(notaAux != null){
                sumatoria += notaAux.getValor();
            }
        }
        definitiva = sumatoria / 5;
        return definitiva;
    }


    public String actualizarNota(String nombreNota, float nuevoValorNota) {
        String mensaje = "";

        Nota notaEncontrada = buscarNota(nombreNota);
        if(notaEncontrada != null){
            notaEncontrada.valor = nuevoValorNota;
            mensaje =  "";
        }else{
            mensaje = "La nota esta registrada";
        }
        return mensaje;

    }

    private Nota buscarNota(String nombreNota) {

        Nota notaEncontrada = null;
        for (Nota nota: listaNotas) {
            if(nota != null && nota.getNombre().equals(nombreNota)){
                notaEncontrada = nota;
                break;
            }
        }
        return notaEncontrada;
    }
}
