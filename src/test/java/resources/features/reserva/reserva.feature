Feature: Reserva de carro por aplicativo

  Cenário: Reserva dentro da área de cobertura
    Dado que o passageiro está em "Belo Horizonte" no endereço "Rua A"
    Quando ele solicita uma reserva
    Então o sistema deve retornar "Motorista a caminho"

  Cenário: Reserva fora da área de cobertura
    Dado que o passageiro está em "São Paulo" no endereço "Av. Paulista"
    Quando ele solicita uma reserva
    Então o sistema deve retornar "Área fora de cobertura"

