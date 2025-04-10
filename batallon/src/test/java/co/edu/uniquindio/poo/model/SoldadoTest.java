package co.edu.uniquindio.poo.model;
import java.util.ArrayList;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/**
 * Clase para probar los objetos de tipo soldado
 * @author Robinson arias Muñuz
 * @since 2025-04
 *
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE)
 */
public class SoldadoTest {

    /**
     * Instancia para el manejo de logs
     */
    private static final Logger LOG = Logger.getLogger(SoldadoTest.class.getName());

    @Test
    public void creacionSoldadoTest(){

        LOG.info("Inicio de prueba nombrePrueba...");
        Soldado soldado = null;

        assertNotNull(soldado);
        LOG.info("fin de prueba");

    }


}