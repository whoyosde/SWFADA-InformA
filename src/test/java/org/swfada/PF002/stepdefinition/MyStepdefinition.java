package org.swfada.PF002.stepdefinition;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.swfada.PF002.step.MyStep;

public class MyStepdefinition {
    @Steps
    private MyStep myStep;
    
    @Dado("^PF002 - que el usuario ingresa a la plataforma InformA$")
    public void QueElUsuarioIngresaALaPlataformaReJA() {

        myStep.QueElUsuarioIngresaALaPlataformaReJA();
    }

    @Y("PF002 - selecciona la instalación {string}")
    public void SeleccionaLaInstalación(String instalación) {
        myStep.SeleccionaLaInstalación(instalación);
    }


    @Y("PF002 - selecciona el sistema {string}")
    public void SeleccionaElSistema(String sistema) {
        myStep.SeleccionaElSistema(sistema);
    }

    @Cuando("PF002 - ingresa el DNI incorrecto {string}")
    public void IngresaElDNIIncorrecto(String usuario) {
        myStep.IngresaElDNIIncorrecto(usuario);
    }

    @Y("PF002 - ingresa la contraseña {string}")
    public void IngresaLaContraseña(String contraseña) {
        myStep.IngresaLaContraseña(contraseña);
    }

    @Y("PF002 - pulsa el botón Entrar")
    public void PulsaElBotónEntrar() {
        myStep.PulsaElBotónEntrar();
    }
    
    @Entonces("PF002 - muestra el mensaje de error")
    public void MuestraElMensajeDeError() {
        myStep.MuestraElMensajeDeError();

    }
}
