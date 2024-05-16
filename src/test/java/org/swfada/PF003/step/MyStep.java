package org.swfada.PF003.step;

import net.thucydides.core.steps.ScenarioSteps;
import org.swfada.PF003.page.MyPage;

public class MyStep extends ScenarioSteps {

    private MyPage myPage;

    @net.thucydides.core.annotations.Step
    public void QueElUsuarioIngresaALaPlataformaReJA() {
        myPage.open();
    }

    @net.thucydides.core.annotations.Step
    public void SeleccionaLaInstalación(String instalación) {
        myPage.SeleccionarInstalación(instalación);
    }

    @net.thucydides.core.annotations.Step
    public void SeleccionaElSistema(String sistema) {
        myPage.SeleccionarSistema(sistema);
    }

    @net.thucydides.core.annotations.Step
    public void IngresaElDNI(String usuario) {
        myPage.IngresarDNI(usuario);
    }

    @net.thucydides.core.annotations.Step
    public void IngresaLaContraseñaIncorrecta(String contraseña) {
        myPage.IngresarContraseñaIncorrecta(contraseña);
    }

    @net.thucydides.core.annotations.Step
    public void PulsaElBotónEntrar() {
        myPage.PulsarEntrar();
    }

    @net.thucydides.core.annotations.Step
    public void MuestraElMensajeDeError() {
        myPage.ValidarMensajeDeError();

    }
}
