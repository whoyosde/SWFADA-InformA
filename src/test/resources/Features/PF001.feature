#language: es
@PF.001
Característica: PF.001 - Acceso con DNI
  Como usuario registrado en el sistema
  Quiero autenticarme con DNI
  Para acceder a la Bandeja de expediente InformA

  Esquema del escenario: Autenicación mediante DNI en InformA
    Dado PF001 - que el usuario ingresa a la plataforma InformA
    Y PF001 - selecciona la instalación "<instalación>"
    Y PF001 - selecciona el sistema "<sistema>"
    Y PF001 - ingresa el DNI "<usuario>"
    Y PF001 - ingresa la contraseña "<contraseña>"
    Y PF001 - pulsa el botón Entrar
    Y PF001 - pulsa el botón Aceptar las obligaciones del sistema
    Cuando  PF001 - selecciona el puesto "<puesto>"
    Y PF001 - pulsa el botón Acceder
    Entonces PF001 - accede a la Bandeja de Informes

    Ejemplos:
      | instalación | sistema  | usuario   | contraseña | puesto  |
      | INFORMES    | INFORMES | 99999999R | 99999999R  | TÉCNICO |