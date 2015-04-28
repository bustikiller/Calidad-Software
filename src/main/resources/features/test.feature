Feature: Movimiento
    Scenario: Calcular el desplazamiento en coordenadas
        Given unas coordenadas 400, 300
        When se produzca un desplazamiento de 200, 200
        Then la comprobación sera true

    Scenario: Calcular el desplazamiento en coordenadas
        Given unas coordenadas 600, 400
        When se produzca un desplazamiento de 300, 300
        Then la comprobación sera false