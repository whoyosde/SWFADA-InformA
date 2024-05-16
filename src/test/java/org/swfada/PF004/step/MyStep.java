package org.swfada.PF004.step;

import net.thucydides.core.steps.ScenarioSteps;
import org.swfada.PF004.page.MyPage;

public class MyStep extends ScenarioSteps {
    private MyPage myPage;

    @net.thucydides.core.annotations.Step
    public void QueMeEncuentroEnLaBandejaDeInformes() {
        myPage.ValidarQueEncuentoEnBandejaDeInformes();
    }

    @net.thucydides.core.annotations.Step
    public void ValidoQueSeVisualiceLosFiltros() {
        myPage.ValidarFiltrosGenericos();
    }
}
