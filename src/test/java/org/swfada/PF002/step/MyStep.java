package org.swfada.PF002.step;

import net.thucydides.core.steps.ScenarioSteps;
import org.swfada.PF002.page.MyPage;

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
    public void IngresaElDNIIncorrecto(String usuario) {
        myPage.IngresarDNIIncorrecto(usuario);
    }

    @net.thucydides.core.annotations.Step
    public void IngresaLaContraseña(String contraseña) {
        myPage.IngresarContraseña(contraseña);
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
