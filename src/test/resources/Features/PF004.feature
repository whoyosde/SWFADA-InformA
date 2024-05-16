#language: es
@PF.004
Característica: PF.004 - Visibilidad de filtros genéricos
  Como usuario registrado en el sistema
  Quiero ingresar a la Bandeja de Informes
  Para visualizar los filtros genericos

  Antecedentes:
    Dado que el usuario ingresa a la plataforma InformA
    Y selecciona la instalación
      | INFORMES |
    Y selecciona el sistema
      | INFORMES |
    Cuando ingresa Credenciales
      | 99999999R |
    Y presiona el botón Aceptar las obligaciones del sistema
    Entonces selecciona el puesto
      | TÉCNICO |
    Y pulsa el botón Acceder

  Escenario: Visualización de filtros
    Dado PF004 - que me encuentro en la Bandeja de Informes
    Entonces PF004 - valido que se visualice los filtros
