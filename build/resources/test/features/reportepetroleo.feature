Feature: Reporte petroleo
  COmo usuario necesito descargar un reporte de petroleo

  Scenario Outline: Descargar reporte de petroleo
    Given Se va a descargar un reporte de petroleo
    When Se ingresa a la opcion empresa
    And Se selecciona la opcion capital inteligente
    And Se selecciona la opcion actualidad economica
    And Se busca el reporte de petroleo
    And Se descarga el reporte
    Then El usuario debe ver el reporte descargado con mensaja <mensaje>

    Examples:
      |mensaje                    |
      |Presentación de PowerPoint |