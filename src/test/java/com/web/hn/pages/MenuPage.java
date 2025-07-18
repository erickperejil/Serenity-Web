package com.web.hn.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class MenuPage extends PageObject{

    @FindBy(xpath = "//a[@class='bristol fl']")
    public WebElementFacade btn_Ficohsa;

    @FindBy(xpath = "//i[@class='stream-menu_inicio leeds_list_item_link_icon-fill']")
    public WebElementFacade menu_btn_home;

    @FindBy(xpath = "//nav//li[2]//a[1]")
    public WebElementFacade menu_btn_products;

    @FindBy(xpath = "//nav//li[3]//a[1]")
    public WebElementFacade menu_btn_transfer;

    @FindBy(xpath = "//nav//li[4]//a[1]")
    public WebElementFacade menu_btn_payments;

    @FindBy(xpath = "//nav//li[5]//a[1]")
    public WebElementFacade menu_btn_manage;

    @FindBy(xpath = "//nav//li[6]//a[1]")
    public WebElementFacade menu_btn_administrate;


    //Opciones de transferencias
    @FindBy(xpath = "//span[contains(@class,'oldham-panel-title-text')][normalize-space()='Entre cuentas propias']")
    public WebElementFacade transfer_btn_ownAccount;

    @FindBy(xpath = "//span[contains(@class,'oldham-panel-title-text')][normalize-space()='Terceros en Ficohsa']")
    public WebElementFacade transfer_btn_terceros;
    @FindBy(xpath = "//span[contains(@class,'oldham-panel-title-text')][normalize-space()='ACH']")
    public WebElementFacade transfer_btn_ach;
    @FindBy(xpath = "//span[contains(@class,'oldham-panel-title-text')][normalize-space()='Al exterior']")
    public WebElementFacade transfer_btn_exterior;


    //Pagar
    @FindBy(xpath = "//span[@class='oldham-panel-title-text'][normalize-space()='Mis Tarjetas de Crédito']")
    public WebElementFacade payments_ownCards;

    @FindBy(xpath = "//span[contains(@class,'oldham-panel-title-text')][normalize-space()='Tarjetas de Crédito de terceros']")
    public WebElementFacade payments_thirdCards;

    @FindBy(xpath = "//span[contains(@class,'oldham-panel-title-text')][normalize-space()='Préstamos']")
    public WebElementFacade payments_loans;

    @FindBy(xpath = "//span[contains(@class,'oldham-panel-title-text')][normalize-space()='Servicios']")
    public WebElementFacade payments_services;

}
