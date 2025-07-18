package com.web.hn.steps;

import com.web.hn.pages.MenuPage;
import com.web.hn.pages.TransferPage;
import net.serenitybdd.annotations.Step;

public class TransferStep {


    MenuPage menu;
    TransferPage transfer;

    @Step("Navegar a transferencias")
    public void navigaToTransfer(){
        menu.menu_btn_transfer.click();
    }

    @Step("Seleccionar tipo de transferencia (cuentas propias)")
    public void selectTransferType(TransferType tipo){
        if(tipo == TransferType.PROPIAS){
            menu.transfer_btn_ownAccount.click();
        }

    }

    @Step("Seleccionar Cuenta de Origen")
    public void selectOriginAccount(String cuenta){
        transfer.btn_select_sourceAccount.click();
        transfer.btn_searchAccount.type(cuenta);

    }





}

enum TransferType {
    PROPIAS,
    ACH,
    TERCEROS
}



