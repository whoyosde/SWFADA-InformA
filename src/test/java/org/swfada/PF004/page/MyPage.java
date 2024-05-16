package org.swfada.PF004.page;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class MyPage extends PageObject {

    @FindBy(id = "cabecera-titulo")
    private WebElementFacade validarAcceso;

    public void ValidarQueEncuentoEnBandejaDeInformes() {
        WebDriverWait wait = new WebDriverWait(getDriver(), 10);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("bloqueResultadosBusqueda")));
        assertEquals("Plataforma de Tramitación INFORM@", validarAcceso.getText());
    }

    public void ValidarFiltrosGenericos() {
        List<WebElement> filtros = getDriver().findElements(By.id("bloqueFiltrosGenericos"));
        if (filtros.size() > 0) {
            System.out.println("Los filtros se visualizan correctamente");
        } else {
            System.out.println("los filtros no se visualizan.");
        }
    }
}
