module co.edu.uniquindio.poo.empresa {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens co.edu.uniquindio.poo.empresa to javafx.fxml;
    exports co.edu.uniquindio.poo.empresa;
    exports co.edu.uniquindio.poo.empresa.app;
    exports co.edu.uniquindio.poo.empresa.viewcontroller;
    opens co.edu.uniquindio.poo.empresa.app to javafx.fxml;
    opens co.edu.uniquindio.poo.empresa.viewcontroller to javafx.fxml;
}