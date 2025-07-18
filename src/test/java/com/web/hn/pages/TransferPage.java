package com.web.hn.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class TransferPage extends PageObject {

    /**
     * Para desplegar las opciones de cuentas origen.
     */
    @FindBy(id = "debitProductId")
    public WebElementFacade btn_select_sourceAccount;

    @FindBy(id = "creditProductId")
    public WebElementFacade btn_select_targetAccount;

    @FindBy(xpath = "//label[@class='baku-selected_product-label']")
    public WebElementFacade btn_select_targetAccount2;

    @FindBy(xpath = "//div[contains(@data-hidden,'false')]//input[@placeholder='Buscar']")
    public WebElementFacade btn_searchAccount;

    @FindBy(xpath = "//*[@id='debitProductId']/div/icb-contextual-panel/div/div/div/div[3]/main-content/icb-list/div/div[1]/div[2]/icb-listrow[1]")
    public WebElementFacade btn_targetAccount;

    @FindBy(xpath = "//span[normalize-space()='749332801']")
    public WebElementFacade btn_sourceAccount;

    @FindBy(xpath = "")
    public WebElementFacade btn_sourceAccountd;


}
