package com.juaracoding;

import com.juaracoding.pages.InputDataPage;
import com.juaracoding.pages.LoginPage;
import com.juaracoding.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestInputData {
    static WebDriver driver;
    static ExtentTest extentTest;
    static LoginPage loginPage = new LoginPage();
    static InputDataPage inputDataPage = new InputDataPage();

    public TestInputData(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @When("User click button input")
    public void user_click_button_input(){
        driver.get(Constants.URL);
        loginPage.validLoginSales();
        inputDataPage.clickInput();
        extentTest.log(LogStatus.PASS, "User click button input");
    }
    @And("User input valid nama")
    public void user_input_valid_nama(){
        inputDataPage.enterName("kelompoktiga");
        extentTest.log(LogStatus.PASS, "User input valid nama");
    }
    @And("User input valid nomor bpjs")
    public void user_input_valid_nomor_bpjs(){
        inputDataPage.enterBPJS("1234567890129");
        extentTest.log(LogStatus.PASS, "User input valid nomor bpjs");
    }
    @And("User input valid nomor ktp")
    public void user_input_valid_nomor_ktp(){
        inputDataPage.enterKTP("1234567890123471");
        extentTest.log(LogStatus.PASS, "User input valid nomor ktp");
    }
    @And("User input valid alamat")
    public void user_input_valid_alamat(){
        inputDataPage.enterAlamat("Jl. Dr.Mansyur");
        extentTest.log(LogStatus.PASS, "User input valid alamat");
    }
    @And("User input valid kota ktp")
    public void user_input_valid_kota_ktp(){
        inputDataPage.selectDropDownKotaKTP("KABUPATEN ACEH SINGKIL");
        extentTest.log(LogStatus.PASS, "User input valid kota ktp");
    }@And("User input valid faskes awal")
    public void user_input_valid_faskes_awal(){
        inputDataPage.enterFaskesAwal("Maninjau");
        extentTest.log(LogStatus.PASS, "User input valid faskes awal");
    }
    @And("User input valid faskes tujuan")
    public void user_input_valid_faskes_tujuan(){
        inputDataPage.selectDropDownFaskesTujuan("clinic meruya");
        extentTest.log(LogStatus.PASS, "User input valid faskes tujuan");
    }
    @And("User input alasan")
    public void user_input_alasan() {
        inputDataPage.enterAlasan("Nice");
        extentTest.log(LogStatus.PASS, "User input alasan");
    }
    @And("User click button simpan data")
    public void user_click_button_simpan_data(){
        inputDataPage.simpanData();
        extentTest.log(LogStatus.PASS, "User click button simpan data");
    }
    @Then("User should see validation")
    public void user_should_see_validation(){
        Assert.assertEquals(inputDataPage.getTxtInputData(), " Data berhasil Di Simpan ");
        extentTest.log(LogStatus.PASS, "User should see text title page Home");
    }
}
