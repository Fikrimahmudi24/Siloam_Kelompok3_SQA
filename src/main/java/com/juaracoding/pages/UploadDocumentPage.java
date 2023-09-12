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
    @FindBy(xpath = "//div[@class='swal-text']")
    WebElement txtSuccesfully;
    @FindBy(xpath = "//*[@id=\"default-tab-3\"]/div[1]/div[1]/div/div/h4")
    WebElement txtUploadDataBerhasil;
    @FindBy(xpath = "//*[@id=\"modal_form\"]/div/div/div[1]/h4")
    WebElement txtUploadFotoBefore;
    @FindBy(xpath = "//h4[@class='modal-title']")
    WebElement txtUploadFotoAfter;
    @FindBy(xpath = "//h4[@class='modal-title']")
    WebElement txtUploadTTD;
    @FindBy(xpath = "//a[@class='nav-link active']//span[@class='d-sm-block d-none']")
    WebElement txtUploadDocument;
    @FindBy(xpath = "//div[@class='modal-header']//button[@aria-label='Close']")
    WebElement btnClose;
    @FindBy(xpath = "//div[@id='message']")
    WebElement txtUploadError;
    @FindBy(xpath = "//*[@id=\"file\"]")
    WebElement txtUploadRequired;


    //Method
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
    public void clickClose(){
        btnClose.click();
    }
    public void clickOk(){
        btnOk.click();
    }
    public String getTxtSuccesfully(){
        return txtSuccesfully.getText();
    }
    public String getTxtUploadDataBerhasil(){
        return txtUploadDataBerhasil.getText();
    }
    public String getTxtUploadFotoBeforeContains(){
        return txtUploadFotoBefore.getText();
    }
    public String getTxtUploadFotoBefore(){
        return txtUploadFotoBefore.getText();
    }
    public String getTxtUploadFotoAfter(){
        return txtUploadFotoAfter.getText();
    }
    public String getTxtUploadTTD(){
        return txtUploadTTD.getText();
    }
    public String getTxtUploadDocument(){
        return txtUploadDocument.getText();
    }
    public String getTxtUploadError(){
        return txtUploadError.getText();
    }
    public String getTxtUploadRequired(){
        return txtUploadRequired.getText();
    }
    public String getTxtChooseFile() {
        delay(2);
        String output = "";
        String required = txtUploadRequired.getAttribute("required");
        if (required.equals("true")) {
            output += "ttdd.jpg";
        }
        System.out.println(output);
        return output;
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