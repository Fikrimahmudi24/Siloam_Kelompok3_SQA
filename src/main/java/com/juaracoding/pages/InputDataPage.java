package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.Keys;


import static com.juaracoding.drivers.DriverSingleton.delay;

public class InputDataPage {

    private WebDriver driver;

    public InputDataPage() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    // Locator Element @FindBy
    @FindBy(xpath = "//a[@href='https://dev.ptdika.com/siloam/sales/input']")
    WebElement btnInput;

    @FindBy(xpath = "//input[@id='name']")
    WebElement name;

    @FindBy(xpath = "//input[@id='no_bpjs']")
    WebElement bpjs;

    @FindBy(xpath = "//input[@id='no_ktp']")
    WebElement ktp;

    @FindBy(xpath = "//textarea[@id='address']")
    WebElement alamat;

    @FindBy(xpath = "//span[@id='select2-ktp_city-container']")
    WebElement dropDownKotaKTP;

    @FindBy(xpath = "//input[@role='textbox']")
    WebElement inputKotaKTP;

    @FindBy(xpath = "//input[@id='origin_faskes']")
    WebElement faskesAwal;

    @FindBy(xpath = "//span[@id='select2-destination_faskes-container']")
    WebElement dropDownFaskesTujuan;

    @FindBy(xpath = "//input[@role='textbox']")
    WebElement inputDropDownFaskesTujuan;

    @FindBy(xpath = "//textarea[@id='reason']")
    WebElement alasan;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement btnSimpanData;

    @FindBy(xpath = "//div[@role='alert']")
    WebElement txtInputData;
    @FindBy(xpath = "//button[@id='btnEdit']")
    WebElement btnEdit;
    @FindBy(xpath = "//button[@id='btnUpdate']")
    WebElement btnUpdate;
    @FindBy(xpath = "//button[@id='btnCancelUpdate']")
    WebElement btnCancelUpdate;
    @FindBy(xpath = "//a[@class='btn btn-primary']")
    WebElement btnSubmit;
    @FindBy(xpath = "//span[normalize-space()='Field Nomor BPJS Harus Diisi!']")
    WebElement txtBpjsRequired;

    // Custom Method For Input Data
    public void clickInput() {
        btnInput.click();
    }

    public void enterName(String name) {
        this.name.sendKeys(name);
    }

    public void enterBPJS(String bpjs) {
        this.bpjs.sendKeys(bpjs);
    }

    public void enterKTP(String ktp) {
        this.ktp.sendKeys(ktp);
    }

    public void enterAlamat(String alamat) {
        this.alamat.sendKeys(alamat);
    }

    public void selectDropDownKotaKTP(String kotaKTP) {
        dropDownKotaKTP.click();
        inputKotaKTP.sendKeys(kotaKTP + Keys.ENTER);
    }

    public void enterFaskesAwal(String faskesAwal) {
        this.faskesAwal.sendKeys(faskesAwal);
    }

    public void selectDropDownFaskesTujuan(String faskesTujuan) {
        dropDownFaskesTujuan.click();
        inputDropDownFaskesTujuan.sendKeys(faskesTujuan+Keys.ENTER);
    }

    public void enterAlasan(String alasan) {
        this.alasan.sendKeys(alasan);
    }

    public void simpanData() {
        btnSimpanData.click();
    }

    public String getTxtInputData() {
        delay(3);
        return txtInputData.getText();
    }

    //Method for Edit Data
    public void clickBtnEdit() {
        btnEdit.click();
    }
    public String getTxtEdit(){
       return btnEdit.getText();
    }
    public String getTxtSimpan(){
       return btnUpdate.getText();
    }
    public String getDataNama(){
       return name.getText();
    }
    public String getDataBPJS(){
       return bpjs.getText();
    }

    public void clickBtnUpdate() {
        btnUpdate.click();
    }
    public void clickBtnCancel() {
        btnCancelUpdate.click();
    }
    public void clickBtnSubmit(){
        btnSubmit.click();
    }
    public String getTxtFormatBPJS(){
        delay(2);
        String output = "";
        String required = bpjs.getAttribute("pattern");
        if (required.equals(".{13,13}")){
            output += "Please Match the Requested Format: 13 to 13 Character";
        }
        System.out.println(output);
        return output;
    }

    public String getTxtBpjsRequired(){
        return txtBpjsRequired.getText();
    }


}
