package org.swfada.PF001.page;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.event.KeyEvent;

import static org.junit.Assert.assertEquals;

@DefaultUrl("/sti_informapxp")


public class MyPage extends PageObject {
    @FindBy(id = "instalacionEscogida")
    private WebElementFacade listaInstalacion;

    @FindBy(id = "submitInstalacion")
    private WebElementFacade btnNextInstalacion;

    @FindBy(id = "submitSistema")
    private WebElementFacade btnNextSistema;

    @FindBy(id = "sistema")
    private WebElementFacade listaSistema;

    @FindBy(id = "dni")
    private WebElementFacade campoDNI;

    @FindBy(id = "pw")
    private WebElementFacade campoContraseña;

    @FindBy(xpath = "//input[@value=\"Entrar\"]")
    private WebElementFacade btnEntrar;

    @FindBy(xpath = "(//button[@class=\"btn botonLogin\"])[1]")
    private WebElementFacade btnAceptarObligaciones;

    @FindBy(id = "usuarioSeleccionado")
    private WebElementFacade listaPuestos;

    @FindBy(xpath = "//input[@value=\"Acceder\"]")
    private WebElementFacade btnAcceder;

    @FindBy(id = "cabecera-titulo")
    private WebElementFacade validarAcceso;


    public void SeleccionarInstalación(String instalación) {
        WebDriverWait wait = new WebDriverWait(getDriver(), 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("formInstalacion")));
        listaInstalacion.click();
        WebElement selectOptions = getDriver().findElement(By.xpath("//option[contains(text(),'" + instalación + "')]"));
        clickOn(selectOptions);
        btnNextInstalacion.waitUntilClickable();
        btnNextInstalacion.click();
    }

    public void SeleccionarSistema(String sistema) {
        WebDriverWait wait = new WebDriverWait(getDriver(), 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("formSistema")));
        listaSistema.click();
        WebElement selectOptions = getDriver().findElement(By.xpath("//option[contains(text(),'" + sistema + "')]"));
        clickOn(selectOptions);
        btnNextSistema.waitUntilClickable();
        btnNextSistema.click();
    }


    public void IngresarDNI(String usuario) {
        WebDriverWait wait = new WebDriverWait(getDriver(), 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("formDNI")));
        campoDNI.sendKeys(usuario);
    }

    public void IngresarContraseña(String contraseña) {
        campoContraseña.sendKeys(contraseña);
    }

    public void PulsarEntrar() {
        btnEntrar.click();
    }

    public void PulsarAceptarObligaciones() {
        WebDriverWait wait = new WebDriverWait(getDriver(), 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("contenido-nuevo-inicio-ultimoacceso")));
        btnAceptarObligaciones.click();
    }

    public void SeleccionarPuesto(String puesto) {
        WebDriverWait wait = new WebDriverWait(getDriver(), 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("formulario")));
        listaPuestos.click();
        WebElement selectOptions = getDriver().findElement(By.xpath("//option[contains(text(),'" + puesto + "')]"));
        clickOn(selectOptions);
    }

    public void PulsarAcceder() {
        btnAcceder.click();
    }

    public void ValidarAccesoBandejaInformes() {
        WebDriverWait wait = new WebDriverWait(getDriver(), 10);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("bloqueResultadosBusqueda")));
        assertEquals("Plataforma de Tramitación INFORM@", validarAcceso.getText());
    }
}
