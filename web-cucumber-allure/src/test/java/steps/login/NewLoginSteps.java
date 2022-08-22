package steps.login;

import io.cucumber.java.pt.Dado;
import page.login.NewLoginPage;

public class NewLoginSteps {

    NewLoginPage newLoginPage;

    public NewLoginSteps(NewLoginPage newLoginPage){
        this.newLoginPage = newLoginPage;
    }


    @Dado ("que faço login no portal BMB Digital")
    public void facoLoginNoPortalBMBDigital(){
        newLoginPage.faCoLoginNoPortalBMBDigital();
    }

}
