package com.web.hn.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class MyProductsPage extends PageObject{

    //Para Seleccionar Cuenta

    @FindBy(xpath = "//input[@placeholder='Buscar']")
    public WebElementFacade txt_buscar;

    @FindBy(xpath = "//icb-listrow[1]")
    public WebElementFacade resultado_cuenta;

    @FindBy(xpath = "//a[@class='florida_wrapper_row_action_button']")
    public WebElementFacade btn_mas;

    @FindBy(xpath = "//span[normalize-space()='Ver detalle']")
    public WebElementFacade btn_detalles;


    //Informacion de la cuenta
    @FindBy(xpath = "//icb-tab-header[1]//div[1]")
    public WebElementFacade btn_ctn_saldos;

    @FindBy(xpath = "//icb-tab-header[2]//div[1]")
    public WebElementFacade btn_ctn_estados;

    @FindBy(xpath = "//icb-tab-header[3]//div[1]")
    public WebElementFacade btn_ctn_movimientos;

    @FindBy(xpath = "//icb-product-detail[1]/div[last()]")
    public WebElementFacade last_saldos;

    @FindBy( xpath = "(//icb-generic-detail-row[last()])[1]")
    public WebElementFacade last_estado;



    //Validaciones

    @FindBy(xpath = "//span[normalize-space()='Detalles']")
    public WebElementFacade lbl_detalles;

    @FindBy(xpath = "//div[@class='rimini ']")
    public WebElementFacade lbl_noProducts;



}


