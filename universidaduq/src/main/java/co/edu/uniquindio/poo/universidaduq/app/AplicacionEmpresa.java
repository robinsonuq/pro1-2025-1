package co.edu.uniquindio.poo.universidaduq.app;

import co.edu.uniquindio.poo.universidaduq.model.Cliente;
import co.edu.uniquindio.poo.universidaduq.model.Empresa;
import co.edu.uniquindio.poo.universidaduq.viewcontroller.ClienteViewController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class AplicacionEmpresa extends Application {

    private Stage primaryStage;
    public static Empresa empresa = new Empresa("UQ","123456");

    @Override
    public void start(Stage primaryStage) throws IOException {
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("Gestion de Clientes");
        openCrudCliente();
    }



    public static void main(String[] args) {
        launch();
    }

    public void openCrudCliente() {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(AplicacionEmpresa.class.getResource("/co/edu/uniquindio/poo/universidaduq/GestionClientes.fxml"));
            AnchorPane rootLayout = (AnchorPane) loader.load();
            ClienteViewController clienteViewController = loader.getController();
            clienteViewController.setApp(this);

            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    //servicios
    public void inicializarData(){
        Cliente cliente = new Cliente("Juan","Pelaez","1244");
        empresa.registrarCliente(cliente);
    }
}
