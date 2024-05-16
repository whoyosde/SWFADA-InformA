package org.swfada.PF001.step;

import net.thucydides.core.steps.ScenarioSteps;
import org.swfada.PF001.page.MyPage;

import java.awt.*;

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
    public void IngresaLaContraseña(String contraseña) {
        myPage.IngresarContraseña(contraseña);
    }

    @net.thucydides.core.annotations.Step
    public void PulsaElBotónEntrar() {
        myPage.PulsarEntrar();
    }

    @net.thucydides.core.annotations.Step
    public void PulsaElBotónAceptarLasObligacionesDelSistema() {
        myPage.PulsarAceptarObligaciones();
    }

    @net.thucydides.core.annotations.Step
    public void SeleccionaElPuesto(String puesto) {
        myPage.SeleccionarPuesto(puesto);
    }

    @net.thucydides.core.annotations.Step
    public void PulsaElBotónAcceder() {
        myPage.PulsarAcceder();
    }

    @net.thucydides.core.annotations.Step
    public void AccedeALaBandejaDeInformes() {
        myPage.ValidarAccesoBandejaInformes();
    }
}
