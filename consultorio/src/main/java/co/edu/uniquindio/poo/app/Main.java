package co.edu.uniquindio.poo.app;

import co.edu.uniquindio.poo.model.Consultorio;
import co.edu.uniquindio.poo.model.Especialidad;
import co.edu.uniquindio.poo.model.Odontologo;
import co.edu.uniquindio.poo.model.Paciente;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        //Consultorio consultorio1 = new Consultorio("Consultorio UQ");

        Paciente paciente = new Paciente("Robinson","Arias","1","31645667", LocalDate.now());



        Odontologo odontologo = new Odontologo("Juan","2","24567", Especialidad.ORTODONCIA);

    }
}