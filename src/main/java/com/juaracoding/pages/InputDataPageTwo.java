package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.juaracoding.drivers.DriverSingleton.delay;

public class InputDataPageTwo {

    private WebDriver driver;

    public InputDataPageTwo() {
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
    public WebElement dropDownKotaKTP;

    @FindBy(xpath = "//input[@role='textbox']")
    WebElement inputKotaKTP;

    @FindBy(xpath = "//input[@id='origin_faskes']")
    public WebElement faskesAwal;

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
    @FindBy(xpath = "//span[normalize-space()='Field Nomor KTP Harus Diisi!']")
    WebElement txtKtpRequired;
    @FindBy(xpath = "//span[normalize-space()='Field Alamat Harus Diisi!']")
    WebElement txtAlamatRequired;
    @FindBy(xpath = "//span[normalize-space()='Field Faskes Asal Harus Diisi!']")
    WebElement txtFaskesAwalRequired;
    @FindBy(xpath = "//span[normalize-space()='Field Alasan Harus Diisi!']")
    WebElement txtAlasanRequired;
    @FindBy(xpath = "//tbody/tr[1]/td[4]/a[1]")
    WebElement btnAddFilesBefore;
    @FindBy(xpath = "//tbody/tr[2]/td[4]/a[1]")
    WebElement btnAddFilesAfter;
    @FindBy(xpath = "//tbody/tr[3]/td[4]/a[1]")
    WebElement btnAddFilesTtd;
    @FindBy(xpath = "//input[@id='file']")
    WebElement btnBrowse;
    @FindBy(xpath = "//button[@id='btnSaveFoto']")
    WebElement btnSimpanFoto;
    @FindBy(xpath = "//div[@class='swal-text']")
    WebElement textDataBerhasilDiupload;
    @FindBy(xpath = "//button[@class='swal-button swal-button--confirm']")
    WebElement btnConfirmOk;
    @FindBy(xpath = "//button[@class='btn btn-danger pull-left']")
    WebElement btnCancelInUploadFotoForm;
    @FindBy(xpath = "//div[@id='message']")
    WebElement txtErrorMessage;
    @FindBy(xpath = "//tbody/tr[1]/td[3]/div[1]/a[2]/i[1]")
    WebElement iconDeleteBefore;
    @FindBy(xpath = "//tbody/tr[2]/td[3]/div[1]/a[2]/i[1]")
    WebElement iconDeleteAfter;
    @FindBy(xpath = "//tbody/tr[3]/td[3]/div[1]/a[2]/i[1]")
    WebElement iconDeleteTtd;
    @FindBy(xpath = "//p[contains(text(),\"DELETE command denied to user 'user_siloam001'@'lo\")]")
    WebElement actualFromDeleteFile;
    @FindBy(xpath = "//a[@class='nav-link active']//span[@class='d-sm-block d-none']")
    WebElement txtTTDDigital;
    @FindBy(xpath = "//div[@class='panel panel-inverse']//iframe")
    public WebElement iframeSuratPernyataan;
    @FindBy(xpath = "//span[normalize-space()='SURAT PERNYATAAN']")
    public WebElement txtSuratPernyataan;
    @FindBy(xpath = "//button[@id='download']")
    public WebElement btnDownload;
    @FindBy(xpath = "//span[normalize-space()='The Nomor BPJS already exist.']")
    public WebElement txtBPJSAlreadyExist;

    @FindBy(xpath = "//div[@role='alert']")
    WebElement txtTTDDigitalBerhasil;
    @FindBy(xpath = "//button[@class='btn btn-danger pull-left']")
    WebElement btnCancelUploadFoto;



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
        inputDropDownFaskesTujuan.sendKeys(faskesTujuan + Keys.ENTER);
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

    public String getTxtEdit() {
        return btnEdit.getText();
    }

    public String getTxtSimpan() {
        return btnUpdate.getText();
    }

    public String getDataNama() {
        return name.getText();
    }

    public String getDataBPJS() {
        return bpjs.getText();
    }

    public String getDataKTP() {
        return ktp.getText();
    }

    public String getDataAlamat() {
        return alamat.getText();
    }

    public String getDataKotaKtp() {
        return dropDownKotaKTP.getText();
    }

    public String getDataFaskesAwal() {
        return faskesAwal.getText();
    }

    public String getDataFaskesTujuan() {
        return dropDownFaskesTujuan.getText();
    }

    public String getDataAlasan() {
        return alasan.getText();
    }

    public void clickBtnUpdate() {
        btnUpdate.click();
    }

    public void clickBtnCancel() {
        btnCancelUpdate.click();
    }

    public void clickBtnSubmit() {
        btnSubmit.click();
    }

    public void clickBtnAddFilesBefore() {
        btnAddFilesBefore.click();
    }

    public void clickBtnAddFilesAfter() {
        btnAddFilesAfter.click();
    }

    public void clickBtnAddFilesTtd() {
        btnAddFilesTtd.click();
    }

    public void clickBtnBrowseFile(String file) {
        btnBrowse.sendKeys(file);
    }

    public void clickBtnSimpanFoto() {
        btnSimpanFoto.click();
    }

    public void clickBtnConfirmOk() {
        btnConfirmOk.click();
    }

    public void clickIconDeleteBefore() {
        iconDeleteBefore.click();
    }

    public void clickIconDeleteAfter() {
        iconDeleteAfter.click();
    }

    public void clickIconDeleteTtd() {
        iconDeleteTtd.click();
    }

    public void clickBtnCancelInUploadFotoForm() {
        btnCancelInUploadFotoForm.click();
    }

    public String getTxtDataBerhasilDiupload() {

        return textDataBerhasilDiupload.getText();
    }

    public String getActualFromDeleteFile() {
        return actualFromDeleteFile.getText();
    }
    public String gettxtTTDDigitalBerhasil() {
        return txtTTDDigitalBerhasil.getText();
    }

    public String getTxtFormatBPJS() {
        delay(2);
        String output = "";
        String required = bpjs.getAttribute("pattern");
        if (required.equals(".{13,13}")) {
            output += "Please Match the Requested Format: 13 to 13 Character";
        }
        System.out.println(output);
        return output;
    }

    public String getTxtFormatKTP() {
        delay(2);
        String output = "";
        String required = ktp.getAttribute("pattern");
        if (required.equals(".{16,16}")) {
            output += "Please Match the Requested Format: 16 to 16 Character";
        }
        System.out.println(output);
        return output;
    }

    public void inputAlamat(Integer myInt) {
        alamat.sendKeys(String.valueOf(myInt));
    }

    public void inputFaskesAwal(Integer myInt) {
        faskesAwal.sendKeys(String.valueOf(myInt));
    }

    public void inputAlasan(Integer myInt) {
        alasan.sendKeys(String.valueOf(myInt));
    }

    public String getTxtBpjsRequired() {
        return txtBpjsRequired.getText();
    }

    public String getTxtKtpRequired() {
        return txtKtpRequired.getText();
    }

    public String getTxtAlamatRequired() {
        return txtAlamatRequired.getText();
    }

    public String getTxtFaskesAwalRequired() {
        return txtFaskesAwalRequired.getText();
    }

    public String getTxtAlasanRequired() {
        return txtAlasanRequired.getText();
    }

    public String getTxtErrorMessage() {
        return txtErrorMessage.getText();
    }

    public String getTxtTTDDigital() {
        return txtTTDDigital.getText();
    }
    public String getTxtBPJSAlreadyExist() {
        return txtBPJSAlreadyExist.getText();
    }

    public String getTxtFormatAlamatIsNotNumber() {
        String output = "";
        String isNotNumber = alamat.getAttribute("type");

        if (isNotNumber != null && !isNotNumber.equalsIgnoreCase("number")) {
            output = "Field Alamat bukan bertipe Number, mohon isi Alamat yang benar";
        }

        System.out.println(output);
        return output;
    }
    public String getTxtFormatFaskesAwalIsNotNumber() {
        String output = "";
        String isNotNumber = faskesAwal.getAttribute("type");

        if (isNotNumber != null && !isNotNumber.equalsIgnoreCase("number")) {
            output = "Field Faskes Awal bukan bertipe Number, mohon isi Faskes Awal yang benar";
        }

        System.out.println(output);
        return output;
    }
    public String getTxtFormatAlasanIsNotNumber() {
        String output = "";
        String isNotNumber = alasan.getAttribute("type");

        if (isNotNumber != null && !isNotNumber.equalsIgnoreCase("number")) {
            output = "Field Alasan bukan bertipe Number, mohon isi Alasan yang benar";
        }

        System.out.println(output);
        return output;
    }



}
