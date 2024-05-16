package org.swfada.PF004.stepdefinition;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.swfada.PF004.step.MyStep;

public class MyStepdefinition {
    @Steps
    private MyStep myStep;

    @Dado("PF004 - que me encuentro en la Bandeja de Informes")
    public void QueMeEncuentroEnLaBandejaDeInformes() {
        myStep.QueMeEncuentroEnLaBandejaDeInformes();
    }

    @Entonces("PF004 - valido que se visualice los filtros")
    public void ValidoQueSeVisualiceLosFiltros() {
        myStep.ValidoQueSeVisualiceLosFiltros();
    }
}
