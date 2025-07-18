
package com.web.hn.steps;

import com.web.hn.pages.LoginPage;
import com.web.hn.pages.MenuPage;
import net.serenitybdd.annotations.Step;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginStep extends LoginPage {


    @Step("El usuario navega a la URL {0}")
    public void navigateTo(String url) {
        this.openUrl(url);
    }

    @Step("Manejar pop-up de bienvenida si aparece")
    public void handleWelcomePopup() {
        if (modal_cookie.isDisplayed()) {
            System.out.println("Pop-up encontrado. Haciendo clic en continuar.");
            modal_cookie.click();
        } else {
            System.out.println("El pop-up no apareció. Continuando con el siguiente paso.");
        }
    }


    @Step("Ingresar usuario")
    public void typeUsername(String username){
        txt_username.sendKeys(username);

    }

    @Step("Continuar")
    public void continueToPassword(){
        btn_continue.click();
    }

    @Step("Ingresar contraseña")
    public void typePassword(String password){
        txt_password.sendKeys(password);
    }

    @Step("Click en el boton login")
    public void clickLogin(){
        btn_continuelogin.click();
    }

    @Step("Validar visualizacion de home")
    public Boolean titleisVisible(){
        MenuPage menu = new MenuPage();
        waitFor(ExpectedConditions.visibilityOf(menu.btn_Ficohsa));
        return menu.btn_Ficohsa.isDisplayed();
    }

    @Step("Validar visualizacion del mensaje de error ")
    public Boolean errorMessageIsDisplay(){
        return lbl_errorMessage.isDisplayed();
    }
}
