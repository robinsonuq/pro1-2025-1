package co.edu.uniquindio.poo.universidaduq.model;

public class Cliente {

    private String nombres;
    private String apellidos;
    private String identificacion;

    public Cliente(String nombres, String apellidos, String identificacion) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.identificacion = identificacion;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }


}
