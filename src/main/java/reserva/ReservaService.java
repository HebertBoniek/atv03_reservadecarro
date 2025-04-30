package reserva;

import java.util.Arrays;
import java.util.List;

public class ReservaService {
    private static final List<String> cidadesCobertas = Arrays.asList("Belo Horizonte", "Contagem");

    public String reservar(String cidade, String endereco) {
        if (cidadesCobertas.contains(cidade)) {
            return "Motorista a caminho";
        } else {
            return "Área fora de cobertura";
        }
    }
}