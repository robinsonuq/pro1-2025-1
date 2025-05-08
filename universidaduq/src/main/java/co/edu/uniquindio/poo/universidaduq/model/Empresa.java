package co.edu.uniquindio.poo.universidaduq.model;

import java.util.ArrayList;

public class Empresa {

    private String nombre;
    private String nit;

    public Empresa(String nombre, String nit) {
        this.nombre = nombre;
        this.nit = nit;
    }

    private ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public ArrayList<Cliente> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(ArrayList<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }

    public boolean registrarCliente(Cliente cliente){
        listaClientes.add(cliente);
        return  true;
    }

    public void eliminarCliente(String identificacion){
        for (Cliente cliente:listaClientes  ) {
            if(cliente.getIdentificacion().equals(identificacion)){
                listaClientes.remove(cliente);
                break;
            }
        }
    }
}
