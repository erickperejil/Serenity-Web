package com.web.hn.definitions;

import com.web.hn.steps.MyProductsStep;
import com.web.hn.users.User;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import org.junit.Assert;

public class MyProductsDef {



    @Steps
    MyProductsStep products;


    @When("ingresa a cuenta de ahorro")
    public void userLoginWithValidCredentials(){
        products.navigateToMyProducts();
        products.searchCuenta(User.cuentasAhorro);
        products.seleccionarCuenta();
    }

    @Then("visualiza los saldos y detalles")
    public void visualizarSaldos(){
        Assert.assertTrue(products.SaldosisVisible());
        products.scrollearProductos();
        System.out.println("Saldos");
    }

    @And("visualiza el estado de cuenta")
    public void visualizarEstadoDeCuenta(){
        products.seleccionarEstadosDeCuenta();
        products.scrollearEstados();
    }

    @And("visualiza movimientos")
    public void visualizarMovimientos(){
        products.seleccionarMovimientos();
    }

    @And("navega al home")
    public void navigateToHome(){
        products.navigateToHome();
    }
}
