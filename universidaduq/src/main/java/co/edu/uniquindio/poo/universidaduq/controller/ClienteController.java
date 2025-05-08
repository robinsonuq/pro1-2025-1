package co.edu.uniquindio.poo.universidaduq.controller;

import co.edu.uniquindio.poo.universidaduq.model.Cliente;
import co.edu.uniquindio.poo.universidaduq.model.Empresa;

public class ClienteController {

    Empresa empresa ;
    public ClienteController(Empresa empresa) {
        this.empresa = empresa;
    }

    public boolean crearCliente(Cliente cliente) {
        return empresa.registrarCliente(cliente);
    }
}
