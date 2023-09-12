package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.Keys;

import static com.juaracoding.drivers.DriverSingleton.delay;
import static com.juaracoding.drivers.DriverSingleton.scrolling;

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

    @FindBy(xpath = "//h1[@class='page-header']")
    WebElement txtAccessInput;

    @FindBy(xpath = "//div[@role='alert']")
    WebElement txtInputData;

    @FindBy(xpath = "//span[normalize-space()='Field Alamat Harus Diisi!']")
    WebElement txtAlamat;

    @FindBy(xpath = "//span[normalize-space()='Field Alasan Harus Diisi!']")
    WebElement txtAlasan;

    @FindBy(xpath = "/html/body/div[5]/div/div/div/div/form/div[5]/div/span/span[1]/span/span[1]")
    WebElement txtKotaKTP;


    // Custom Method
    public void clickInput() {
        btnInput.click();
    }

    public void scroll() {
        scrolling();
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

    public String getTxtFillOutName(){
        delay(2);
        String output = "";
        String required = name.getAttribute("required");
        if (required.equals("true")){
            output += "Please fill out this field.";
        }
        System.out.println(output);
        return output;
    }
    public String getTxtPleaseMatchBPJS(){
        delay(2);
        String output = "";
        String required = bpjs.getAttribute("required");
        if (required.equals("true")){
            output += "Please match the requested format.";
        }
        System.out.println(output);
        return output;
    }
//    public String getTxtStartDate(){
//        delay(2);
//        String output = "";
//        String placeHolder = bpjs.getAttribute("placeholder");
//        if (placeHolder.equals("Start Date")){
//            output += "Start date";
//        }
//        System.out.println(output);
//        return output;
//    }
    public String getTxtFillOutBPJS(){
        delay(2);
        String output = "";
        String required = bpjs.getAttribute("required");
        if (required.equals("true")){
            output += "Please fill out this field.";
        }
        System.out.println(output);
        return output;
    }

    public String getTxtPleaseMatchKTP(){
        delay(2);
        String output = "";
        String required = ktp.getAttribute("required");
        if (required.equals("true")){
            output += "Please match the requested format.";
        }
        System.out.println(output);
        return output;
    }

    public String getTxtFillOutKTP(){
        delay(2);
        String output = "";
        String required = ktp.getAttribute("required");
        if (required.equals("true")){
            output += "Please fill out this field.";
        }
        System.out.println(output);
        return output;
    }
    public String getTxtAlamat() {
        delay(2);
        return txtAlamat.getText();
    }
    public String getTxtFillOutKotaKTP(){
        delay(2);
        String output = "";
        String required = dropDownKotaKTP.getAttribute("id");
        if (required.equals("select2-ktp_city-container")){
            output += "Please select an item in the list.";
        }
        System.out.println(output);
        return output;
    }
    public String getTxtFillOutFaskesAwal(){
        delay(2);
        String output = "";
        String required = faskesAwal.getAttribute("required");
        if (required.equals("true")){
            output += "Please fill out this field.";
        }
        System.out.println(output);
        return output;
    }
    public String getTxtFillOutFaskesTujuan(){
        delay(2);
        String output = "";
        String required = dropDownFaskesTujuan.getAttribute("id");
        if (required.equals("select2-destination_faskes-container")){
            output += "clinic meruya";
        }
        System.out.println(output);
        return output;
    }
    public String getTxtAlasan() {
        delay(2);
        return txtAlasan.getText();
    }
    public String getTxtKotaKTP() {
        delay(2);
        return txtKotaKTP.getText();
    }
    public String getTxtAccessInput() {
        delay(2);
        return txtAccessInput.getText();
    }
}
