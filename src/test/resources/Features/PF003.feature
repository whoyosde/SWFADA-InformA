#language: es
@PF.003
Característica: PF.003 - Acceso con contraseña incorrecta
  Como usuario común
  Quiero autenticarme con contraseña incorrecta
  Para validar el acceso a InformA

  Esquema del escenario: Autenicación mediante contraseña incorrecta
    Dado PF003 - que el usuario ingresa a la plataforma InformA
    Y PF003 - selecciona la instalación "<instalación>"
    Y PF003 - selecciona el sistema "<sistema>"
    Cuando PF003 - ingresa el DNI "<usuario>"
    Y PF003 - ingresa la contraseña incorrecta "<contraseña>"
    Y PF003 - pulsa el botón Entrar
    Entonces PF003 - muestra el mensaje de error

    Ejemplos:
      | instalación | sistema  | usuario   | contraseña |
      | INFORMES    | INFORMES | 99999999R | 00000000T  |