package com.web.hn.definitions;

import com.web.hn.pages.LoginPage;
import com.web.hn.steps.LoginStep;
import com.web.hn.steps.MyProductsStep;
import com.web.hn.users.User;
import com.web.hn.utilities.WebSite;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.screenplay.actions.OpenPageWithName;
import net.thucydides.model.util.EnvironmentVariables;
import org.junit.Assert;

public class LoginDef {

    @Steps
    WebSite website;

    @Steps
    LoginStep login;

    @Steps
    MyProductsStep menu;

    private EnvironmentVariables environmentVariables;

    @Given("el usuario entra al sistema")
    public void userNavigateTo(){
        String ambiente = environmentVariables.getProperty("environment.urls.secure_ficohsa");
        website.navigateTo(ambiente);
    }

    @When("ingresa credenciales validas")
    public void userLoginWithValidCredentials(){
        login.handleWelcomePopup();
        login.typeUsername(User.username);
        login.continueToPassword();
        login.typePassword(User.password);
        login.clickLogin();
    }

    @Then("el sistema muestra el home")
    public void getIntoHome(){
        Assert.assertTrue(menu.menuisVisible());
        System.out.println("menu " + menu.menuisVisible());
    }
}
