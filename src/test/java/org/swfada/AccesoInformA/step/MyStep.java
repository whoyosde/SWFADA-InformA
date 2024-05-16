package org.swfada.AccesoInformA.step;

import net.thucydides.core.steps.ScenarioSteps;
import org.swfada.AccesoInformA.page.MyPage;

public class MyStep extends ScenarioSteps {
    private MyPage myPage;

    @net.thucydides.core.annotations.Step
    public void QueElUsuarioIngresaALaPlataformaInformA() {
        myPage.open();
    }

    @net.thucydides.core.annotations.Step
    public void SeleccionaLaInstalación(String instalacion) {
        myPage.SeleccionarInstalación(instalacion);
    }

    @net.thucydides.core.annotations.Step
    public void SeleccionaElSistema(String sistema) {
        myPage.SeleccionarSistema(sistema);
    }

    public void IngresaCredenciales(String credenciales) {
        myPage.IngresarCredenciales(credenciales);
    }

    public void PresionaElBotónAceptarLasObligacionesDelSistema() {
        myPage.PulsarAceptarObligaciones();
    }

    public void SeleccionaElPuesto(String puesto) {
        myPage.SeleccionarPuesto(puesto);
    }

    public void PulsaElBotónAcceder() {
        myPage.PulsarAcceder();
    }
}
