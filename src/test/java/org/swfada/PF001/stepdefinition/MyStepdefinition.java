package org.swfada.PF001.stepdefinition;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.swfada.PF001.step.MyStep;

import java.awt.*;

public class MyStepdefinition {
    @Steps
    private MyStep myStep;
    @Dado("^PF001 - que el usuario ingresa a la plataforma InformA$")
    public void QueElUsuarioIngresaALaPlataformaReJA() {
        myStep.QueElUsuarioIngresaALaPlataformaReJA();
    }

    @Cuando("PF001 - selecciona la instalación {string}")
    public void SeleccionaLaInstalación(String instalación) {
        myStep.SeleccionaLaInstalación(instalación);
    }


    @Y("PF001 - selecciona el sistema {string}")
    public void SeleccionaElSistema(String sistema) {
        myStep.SeleccionaElSistema(sistema);
    }

    @Y("PF001 - ingresa el DNI {string}")
    public void IngresaElDNI(String usuario) {
        myStep.IngresaElDNI(usuario);
    }

    @Y("PF001 - ingresa la contraseña {string}")
    public void IngresaLaContraseña(String contraseña) {
        myStep.IngresaLaContraseña(contraseña);
    }

    @Y("PF001 - pulsa el botón Entrar")
    public void PulsaElBotónEntrar() {
        myStep.PulsaElBotónEntrar();
    }

    @Y("PF001 - pulsa el botón Aceptar las obligaciones del sistema")
    public void PulsaElBotónAceptarLasObligacionesDelSistema() {
        myStep.PulsaElBotónAceptarLasObligacionesDelSistema();
    }

    @Cuando("PF001 - selecciona el puesto {string}")
    public void SeleccionaElPuesto(String puesto) {
        myStep.SeleccionaElPuesto(puesto);
    }

    @Y("PF001 - pulsa el botón Acceder")
    public void PulsaElBotónAcceder() {
        myStep.PulsaElBotónAcceder();
    }

    @Entonces("PF001 - accede a la Bandeja de Informes")
    public void AccedeALaBandejaDeInformes() {
        myStep.AccedeALaBandejaDeInformes();

    }
}
