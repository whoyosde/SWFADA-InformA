package org.swfada.PF003.stepdefinition;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.swfada.PF003.step.MyStep;

public class MyStepdefinition {
    @Steps
    private MyStep myStep;
    
    @Dado("^PF003 - que el usuario ingresa a la plataforma InformA$")
    public void QueElUsuarioIngresaALaPlataformaReJA() {

        myStep.QueElUsuarioIngresaALaPlataformaReJA();
    }

    @Y("PF003 - selecciona la instalación {string}")
    public void SeleccionaLaInstalación(String instalación) {
        myStep.SeleccionaLaInstalación(instalación);
    }
    
    @Y("PF003 - selecciona el sistema {string}")
    public void SeleccionaElSistema(String sistema) {
        myStep.SeleccionaElSistema(sistema);
    }

    @Cuando("PF003 - ingresa el DNI {string}")
    public void IngresaElDNI(String usuario) {
        myStep.IngresaElDNI(usuario);
    }

    @Y("PF003 - ingresa la contraseña incorrecta {string}")
    public void IngresaLaContraseñaIncorrecta(String contraseña) {
        myStep.IngresaLaContraseñaIncorrecta(contraseña);
    }

    @Y("PF003 - pulsa el botón Entrar")
    public void PulsaElBotónEntrar() {
        myStep.PulsaElBotónEntrar();
    }
    
    @Entonces("PF003 - muestra el mensaje de error")
    public void MuestraElMensajeDeError() {
        myStep.MuestraElMensajeDeError();

    }
}
