package co.edu.uniquindio.poo.model;

import java.util.ArrayList;
import java.util.logging.Logger;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/**
 * Clase para probar los objetos de tipo soldado
 * @author Robinson arias Muñuz
 * @since 2025-04
 *
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE)
 */
public class BatallonTest {

    /**
     * Instancia para el manejo de logs
     */
    private static final Logger LOG = Logger.getLogger(SoldadoTest.class.getName());
    Batallon batallon = null;

    @BeforeEach
    public void iniciailziar(){
        batallon = new Batallon("Numero 8");
    }

    @Test
    public void verificarSoldadoExisteTest(){

        Soldado soldado = new Soldado("12","Robin","Arias",new ArrayList<>());
        Soldado soldado2 = new Soldado("12","Juna","Muñoz",new ArrayList<>());
        batallon.registrarSoldado(soldado);

        assertThrows(Throwable.class,()-> batallon.registrarSoldado(soldado2));
    }

    @Test
    public void verificarSoldadoConRTest(){

        Soldado soldado = new Soldado("12","Robin","Arias",new ArrayList<>());
        Soldado soldado2 = new Soldado("12","Luis","Arias",new ArrayList<>());
        Soldado soldado3 = new Soldado("123","Pedro","Muñoz",new ArrayList<>());
        Soldado soldado4 = new Soldado("123","Raul","Muñoz",new ArrayList<>());

        batallon.registrarSoldado(soldado);
        batallon.registrarSoldado(soldado2);
        batallon.registrarSoldado(soldado3);
        batallon.registrarSoldado(soldado4);

        ArrayList<Soldado> soldadosCoR = batallon.obtenerSoldadosConR();

        // son los que yo espero
        ArrayList<Soldado> listaAux = new ArrayList<>();

        listaAux.add(soldado);
        listaAux.add(soldado4);

        assertIterableEquals(listaAux,soldadosCoR);

    }


}