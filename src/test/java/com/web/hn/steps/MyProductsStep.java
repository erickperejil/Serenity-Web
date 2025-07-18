package com.web.hn.steps;

import com.web.hn.pages.MenuPage;
import com.web.hn.pages.MyProductsPage;
import com.web.hn.pages.PaymentsPage;
import com.web.hn.utilities.screenshots.GestorDeEvidencias;
import net.serenitybdd.annotations.Step;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MyProductsStep extends MyProductsPage{

    MenuPage menu;
    MyProductsPage myProducts;

    @Step("El usuario da click en Mis Productos")
    public void navigateToMyProducts(){
        menu.menu_btn_products.click();
    }

    @Step("Buscar cuenta")
    public void searchCuenta(String[] cuenta){
        for (int i = 0; i < cuenta.length; i++) {
            myProducts.txt_buscar.clear();
            myProducts.txt_buscar.type(cuenta[i]);
            waitFor(
                    ExpectedConditions.or(
                            ExpectedConditions.visibilityOf(myProducts.resultado_cuenta),
                            ExpectedConditions.visibilityOf(myProducts.lbl_noProducts)
                    )
            );
            if (!myProducts.lbl_noProducts.isCurrentlyVisible()) {
                break;
            }
        }

    }

    @Step("Seleccionar Cuenta de ahorro")
    public void seleccionarCuenta(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        myProducts.btn_mas.waitUntilVisible().click();
        myProducts.btn_detalles.waitUntilVisible().click();
    }

    @Step("Ver estado de cuenta")
    public void seleccionarEstadosDeCuenta(){
        myProducts.btn_ctn_estados.click();
    }

    @Step("Ver movimientos")
    public void seleccionarMovimientos(){
        myProducts.btn_ctn_movimientos.click();
        waitABit(1000);
        GestorDeEvidencias.guardar("VisualizarProductos", "Movimientos");
    }

    @Step("Hacer scroll hasta el fondo del panel de detalles")
    public void scrollearProductos(){
        GestorDeEvidencias.guardar("VisualizarProductos", "Saldos_1");
        Actions actions = new Actions(getDriver());
        actions.scrollToElement(myProducts.last_saldos).perform();
        GestorDeEvidencias.guardar("VisualizarProductos", "Saldos_2");
    }

    @Step("Hacer scroll hasta el fondo del panel de estados")
    public void scrollearEstados(){
        Actions actions = new Actions(getDriver());
        actions.scrollToElement(myProducts.last_estado).perform();
        GestorDeEvidencias.guardar("VisualizarProductos", "Estados");
    }


    @Step("Validar visualizacion de menu")
    public Boolean menuisVisible(){
        return menu.menu_btn_products.waitUntilVisible().isDisplayed();
    }

    @Step("Validar visualizacion de menu")
    public Boolean SaldosisVisible(){
        return myProducts.lbl_detalles.isDisplayed();
    }

    @Step("navegar al home")
    public void navigateToHome(){
        menu.menu_btn_home.click();
        waitFor(ExpectedConditions.visibilityOf(menu.btn_Ficohsa));
    }

}
