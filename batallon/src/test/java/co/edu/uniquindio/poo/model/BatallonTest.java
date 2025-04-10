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


}