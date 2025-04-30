package runner;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import reserva.ReservaService;

public class ReservaServiceTest {

    private ReservaService reservaService;

    @Before
    public void setUp() {
        reservaService = new ReservaService();
    }

    @Test
    public void testReservaDentroAreaCobertura() {
        String resultado = reservaService.reservar("Belo Horizonte", "Rua A");
        assertEquals("Motorista a caminho", resultado);
    }

    @Test
    public void testReservaForaAreaCobertura() {
        String resultado = reservaService.reservar("São Paulo", "Av. Paulista");
        assertEquals("Área fora de cobertura", resultado);
    }
}

