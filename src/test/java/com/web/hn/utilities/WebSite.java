package com.web.hn.utilities;


import net.serenitybdd.annotations.Step;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.core.pages.PageObject;


public class WebSite extends PageObject {

    @Step("Navegar al sitio web")
    public void navigateTo(String url) {
        getDriver().get(url);
    }


}