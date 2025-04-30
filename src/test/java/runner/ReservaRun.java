package steps;

import static org.junit.Assert.assertEquals;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Quando;
import io.cucumber.java.pt.Entao;
import reserva.ReservaService;

public class ReservaSteps {

    private String cidade;
    private String endereco;
    private String resultado;
    private ReservaService reservaService = new ReservaService();

    @Dado("que o passageiro está em {string} no endereço {string}")
    public void que_o_passageiro_está_em_no_endereco(String cidade, String endereco) {
        this.cidade = cidade;
        this.endereco = endereco;
    }

    @Quando("ele solicita uma reserva")
    public void ele_solicita_uma_reserva() {
        resultado = reservaService.reservar(cidade, endereco);
    }

    @Entao("o sistema deve retornar {string}")
    public void o_sistema_deve_retornar(String mensagemEsperada) {
        assertEquals(mensagemEsperada, resultado);
    }
}

