#language: es
@PF.002
Característica: PF.002 - Acceso con DNI incorrecto
  Como usuario común
  Quiero autenticarme con DNI incorrecto
  Para validar el acceso

  Esquema del escenario: Autenicación mediante DNI incorrecto
    Dado PF002 - que el usuario ingresa a la plataforma InformA
    Y PF002 - selecciona la instalación "<instalación>"
    Y PF002 - selecciona el sistema "<sistema>"
    Cuando PF002 - ingresa el DNI incorrecto "<usuario>"
    Y PF002 - ingresa la contraseña "<contraseña>"
    Y PF002 - pulsa el botón Entrar
    Entonces PF002 - muestra el mensaje de error

    Ejemplos:
      | instalación | sistema  | usuario   | contraseña |
      | INFORMES    | INFORMES | 00000000T | 99999999R  |