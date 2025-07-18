package com.web.hn.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class LoginPage extends PageObject{


    @FindBy(xpath = "//*[@id='modalCookie']/div[2]/div[8]/div/icb-button/a")
    protected WebElementFacade modal_cookie;

    @FindBy(xpath = "//*[@id='step01']")
    protected WebElementFacade txt_username;

    @FindBy(xpath = "//a[@class='ipswich-main-buttons-link big']")
    protected WebElementFacade btn_continue;

    @FindBy(xpath = "//input[@id='step02']")
    protected WebElementFacade txt_password;

    @FindBy(xpath = "//div[@class='ipswich-main-buttons-login-password fr']//a[@class='ipswich-main-buttons-link big']")
    protected WebElementFacade btn_continuelogin;

    @FindBy(id = "login-button")
    protected  WebElementFacade btn_login;

    @FindBy(xpath = "//div[@class='product_label']")
    protected WebElementFacade lbl_product;

    @FindBy(xpath = "//h3[@data-test='error' and text()='Username and password do not match any user in this service']")
    protected WebElementFacade  lbl_errorMessage;
}