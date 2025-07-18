package com.web.hn.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class PaymentsPage {

    @FindBy(xpath = "//label[@class='silves-selected_product-label']")
    public WebElementFacade services_btn_display_services;

    @FindBy(xpath = "//input[@placeholder='Buscar']")
    public WebElementFacade services_input_search_service;

    @FindBy(xpath = "(//icb-service-subscription-row)[1]")
    public WebElementFacade services_btn_select_service;

    @FindBy(xpath = "//span[@class='viena-label']")
    public WebElementFacade services_btn_display_concept;

    @FindBy(xpath = "//icb-menuoptions[@data-hidden='false']//div//div[3]")
    public WebElementFacade services_btn_select_concept;

    @FindBy(xpath = "//label[@class='baku-selected_product-label']")
    public WebElementFacade services_btn_display_accountToDebit;

    @FindBy(xpath = "(//input[@placeholder='Buscar'])[2]")
    public WebElementFacade services_input_search_account;

    @FindBy(xpath = "(//div[@data-hidden='false']//icb-listrow)[1]")
    public WebElementFacade services_btn_select_account;

    @FindBy(xpath = "//input[contains(@placeholder,'Concepto')]")
    public WebElementFacade services_input_concept;

    @FindBy(xpath = "//a[@class='ipswich-main-buttons-link']//span[@class='ipswich-main-buttons-link-text'][normalize-space()='Siguiente']")
    public WebElementFacade services_btn_siguiente;

    @FindBy(xpath = "//div[contains(@class,'step fl header-transferMode fadeInICB full-height')]//span[contains(@class,'ipswich-main-buttons-link-text')][normalize-space()='Confirmar']")
    public WebElementFacade services_btn_confirmar;


}
