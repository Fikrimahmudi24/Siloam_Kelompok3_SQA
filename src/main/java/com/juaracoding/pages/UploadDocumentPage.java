package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.juaracoding.drivers.DriverSingleton.delay;

public class UploadDocumentPage {
    private WebDriver driver;

    public UploadDocumentPage() {
        driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    // Locator Element @FindBy
    @FindBy(xpath = "//input[@id='file']")
    WebElement btnChoose;
    @FindBy(xpath = "//button[@id='btnSave']")
    WebElement btnSimpan;
    @FindBy(xpath = "//button[normalize-space()='Cancel']")
    WebElement btnCancel;
    @FindBy(xpath = "//span[normalize-space()='Foto Faskes Awal']")
    WebElement btnFaskesAwal;
    @FindBy(xpath = "//span[normalize-space()='Foto Faskes Tujuan']")
    WebElement btnFaskesTujuan;
    @FindBy(xpath = "//span[normalize-space()='Tanda Tangan Digital']")
    WebElement btnTTD;
    @FindBy(xpath = "//a[@class='btn btn-primary']")
    WebElement btnSelanjutnya;
    @FindBy(xpath = "//button[@class='swal-button swal-button--confirm']")
    WebElement btnOk;
    @FindBy(xpath = "//*[@id=\"default-tab-3\"]/div[1]/div[1]/div/div/h4")
    WebElement txtUploadDataBerhasil;



//    public String getTxtNotFound(){
//        delay(3);
//        return txtNotFound.getText();
//    }
//    public String getTxtHomeLogin(){
//        delay(3);
//        return txtHomeLogin.getText();
//    }

    public void clickFaskesAwal(){
        btnFaskesAwal.click();
    }
    public void clickFaskesTujuan(){
        btnFaskesTujuan.click();
    }
    public void clickTTD(){
        btnTTD.click();
    }
    public void clickChoose(String file){
        btnChoose.click();
        btnChoose.sendKeys(file);
    }
    public void clickSelanjutnya(){
        btnSelanjutnya.click();
    }
    public void clickSimpan(){
        btnSimpan.click();
    }
    public void clickCancel(){
        btnCancel.click();
    }
    public void clickOk(){
        btnOk.click();
    }
    public String getTxtUploadDataBerhasil(){
        return txtUploadDataBerhasil.getText();
    }



//    public void validLoginSales(){
//        username.sendKeys("D6200927");
//        password.sendKeys("1997-10-23");
//        btnLogin.click();
//    }
//    public void validLogout(){
//        profile.click();
//        btnLogout.click();
//    }
//    public String getTxtHome(){
//        delay(3);
//        return txtDashboard.getText();
//    }
//    public String getTxtProfile(){
//        delay(3);
//        return txtProfileName.getText();
//    }
}