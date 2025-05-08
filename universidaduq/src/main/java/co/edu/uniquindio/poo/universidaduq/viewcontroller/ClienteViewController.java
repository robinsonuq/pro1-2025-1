package co.edu.uniquindio.poo.universidaduq.viewcontroller;


import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.poo.universidaduq.app.AplicacionEmpresa;
import co.edu.uniquindio.poo.universidaduq.controller.ClienteController;
import co.edu.uniquindio.poo.universidaduq.model.Cliente;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class ClienteViewController {


    ClienteController clienteController;
    ObservableList<Cliente> listClientes = FXCollections.observableArrayList();

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableView<Cliente> tableClientes;

    @FXML
    private TextField txtApellidos;

    @FXML
    private TableColumn<Cliente,String> columnIdentificacion;

    @FXML
    private Button btnEliminar;

    @FXML
    private TextField txtNumIdentificacion;

    @FXML
    private Button btnNuevo;

    @FXML
    private TableColumn<Cliente,String> columnNombre;

    @FXML
    private TextField txtNombres;

    @FXML
    private Button btnAgregar;

    @FXML
    private TextField txtCorreo;
    private AplicacionEmpresa aplicacionEmpresa;

    @FXML
    void initialize() {

    }

    @FXML
    void eliminarAction(ActionEvent event) {

    }

    @FXML
    void nuevoAction(ActionEvent event) {

        txtNombres.setText("Ingrese el nuevo nombre");
        txtCorreo.setText("");
        txtApellidos.setText("");
        txtNumIdentificacion.setText("");
    }

    @FXML
    void agregarAction(ActionEvent event) {

       agregarCliente();
    }

    private void agregarCliente() {
        Cliente cliente = buildCliente();
        if (clienteController.crearCliente(cliente)) {
            listClientes.add(cliente);

        }
    }

    private Cliente buildCliente() {
        Cliente cliente = new Cliente(txtNombres.getText(), txtApellidos.getText(), txtNumIdentificacion.getText());
        return cliente;
    }


    public void setApp(AplicacionEmpresa aplicacionEmpresa) {
        this.aplicacionEmpresa = aplicacionEmpresa;
        clienteController = new ClienteController(aplicacionEmpresa.empresa);
    }
}

