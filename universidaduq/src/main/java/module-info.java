module co.edu.uniquindio.poo.universidaduq {
    requires javafx.controls;
    requires javafx.fxml;
            
    requires org.controlsfx.controls;
                            
    opens co.edu.uniquindio.poo.universidaduq to javafx.fxml;
    exports co.edu.uniquindio.poo.universidaduq.app;

    exports co.edu.uniquindio.poo.universidaduq.viewcontroller;
    opens co.edu.uniquindio.poo.universidaduq.app to javafx.fxml;
    opens co.edu.uniquindio.poo.universidaduq.viewcontroller to javafx.fxml;

}