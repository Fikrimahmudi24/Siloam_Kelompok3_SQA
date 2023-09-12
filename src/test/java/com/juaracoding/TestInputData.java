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
    @When("User login")
    public void user_login(){
        driver.get(Constants.URL);
        loginPage.validLoginSales();
        extentTest.log(LogStatus.PASS, "User login");
    }
    @And("User click button input data")
    public void user_click_button_input_data(){
        inputDataPage.clickInput();
        extentTest.log(LogStatus.PASS, "User click button input data");
    }
    @Then("User redirect to form input")
    public void user_redirect_to_form_input() {
        Assert.assertTrue(inputDataPage.getTxtAccessInput().contains("Form Input"));
        extentTest.log(LogStatus.PASS, "User redirect to form input");
    }
    @And("User check and scroll form input")
    public void user_check_and_scroll_form_input(){
        inputDataPage.scroll();
        extentTest.log(LogStatus.PASS, "User check and scroll form input");
    }

    @When("User click button input")
    public void user_click_button_input(){
        driver.get(Constants.URL);
        loginPage.validLoginSales();
        inputDataPage.clickInput();
        extentTest.log(LogStatus.PASS, "User click button input");
    }
    @When("User click button input for blank text")
    public void user_click_button_input_for_negative_test_case(){
        inputDataPage.clickInput();
        extentTest.log(LogStatus.PASS, "User click button input");
    }
    @When("User click button input for valid data")
    public void user_click_button_input_for_valid_data(){
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
        inputDataPage.enterBPJS("1508722222222");
        extentTest.log(LogStatus.PASS, "User input valid nomor bpjs");
    }
    @And("User input valid nomor ktp")
    public void user_input_valid_nomor_ktp(){
        inputDataPage.enterKTP("1508722222222222");
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
    }
    @And("User input valid faskes awal")
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
    public void user_should_see_validation() {
        Assert.assertTrue(inputDataPage.getTxtInputData().contains("Data berhasil Di Simpan"));
        extentTest.log(LogStatus.PASS, "User should see text title page Home");
        System.out.println(inputDataPage.getTxtInputData());
    }
    //fungsi dropdown list kota ktp
    @Then("User should see text kota in the kota KTP")
    public void user_should_see_text_kota_in_the_kota_KTP() {
        Assert.assertTrue(inputDataPage.getTxtKotaKTP().contains("KABUPATEN ACEH SINGKIL"));
        extentTest.log(LogStatus.PASS, "User should see text kota in kota ktp");
    }
    //fungsi dropdown list faskes tujuan
    @Then("User should see text kota in the faskes tujuan")
    public void user_should_see_text_kota_in_the_faskes_tujuan() {
        Assert.assertTrue(inputDataPage.getTxtFillOutFaskesTujuan().contains("clinic meruya"));
        extentTest.log(LogStatus.PASS, "User should see text kota in the faskes tujuan");
    }

    //Negative Test Case
    //name blank
    @And("User leaving the nama field blank")
    public void user_leaving_the_nama_field_blank(){
        inputDataPage.enterName("");
        extentTest.log(LogStatus.PASS, "User leaving the nama field blank");
    }
    @Then("User should see warning text in the nama")
    public void user_should_see_warning_text_in_the_nama() {
        Assert.assertEquals(inputDataPage.getTxtFillOutName(),"Please fill out this field.");
        extentTest.log(LogStatus.PASS, "User should see warning text in the nama");
    }

    //nomor bpjs <13 character
    @And("User input 12 character to nomor bpjs")
    public void user_input_12_character_to_nomor_bpjs(){
        inputDataPage.enterBPJS("123456789012");
        extentTest.log(LogStatus.PASS, "User input 12 character to nomor bpjs");
    }
    @Then("User should see warning character text in the nomor bpjs")
    public void user_should_see_warning_character_text_in_the_nomor_bpjs() {
        Assert.assertTrue(inputDataPage.getTxtPleaseMatchBPJS().contains("Please match the requested format."));
        extentTest.log(LogStatus.PASS, "User should see warning character text in the nomor bpjs");
    }

    //nomor ktp <16 character
    @And("User input 15 character to nomor ktp")
    public void user_input_15_character_to_nomor_ktp(){
        inputDataPage.enterBPJS("123456789012345");
        extentTest.log(LogStatus.PASS, "User input 15 character to nomor ktp");
    }
    @Then("User should see warning character text in the nomor ktp")
    public void user_should_see_warning_character_text_in_the_nomor_ktp() {
        Assert.assertTrue(inputDataPage.getTxtPleaseMatchKTP().contains("Please match the requested format."));
        extentTest.log(LogStatus.PASS, "User should see warning character text in the nomor ktp");
    }

    //nomor bpjs blank
    @And("User leaving the nomor bpjs field blank")
    public void User_leaving_the_nomor_bpjs_field_blank(){
        inputDataPage.enterBPJS("");
        extentTest.log(LogStatus.PASS, "User leaving the nomor bpjs field blank");
    }
    @Then("User should see warning text in the nomor bpjs")
    public void User_should_see_warning_text_in_the_nomor_bpjs() {
        Assert.assertEquals(inputDataPage.getTxtFillOutBPJS(),"Please fill out this field.");
        extentTest.log(LogStatus.PASS, "User should see warning text in the nomor bpjs");
    }

    //nomor ktp blank
    @And("User leaving the nomor KTP field blank")
    public void User_leaving_the_nomor_KTP_field_blank(){
        inputDataPage.enterKTP("");
        extentTest.log(LogStatus.PASS, "User leaving the nomor KTP field blank");
    }
    @Then("User should see warning text in the nomor KTP")
    public void User_should_see_warning_text_in_the_nomor_KTP() {
        Assert.assertEquals(inputDataPage.getTxtFillOutKTP(),"Please fill out this field.");
        extentTest.log(LogStatus.PASS, "User should see warning text in the nomor KTP");
    }

    //alamat blank
    @And("User leaving the alamat field blank")
    public void user_leaving_the_alamat_field_blank(){
        inputDataPage.enterAlamat("");
        extentTest.log(LogStatus.PASS, "User leaving the alamat field blank");
    }
    @Then("User should see validation text in the alamat")
    public void User_should_see_validation_text_in_the_alamat() {
        Assert.assertEquals(inputDataPage.getTxtAlamat(),"Field Alamat Harus Diisi!");
        extentTest.log(LogStatus.PASS, "User should see validation text in the alamat");
    }

    //kota KTP blank
    @And("User leaving the kota KTP field blank")
    public void user_leaving_the_kota_KTP_field_blank(){
        inputDataPage.selectDropDownKotaKTP("");
        extentTest.log(LogStatus.PASS, "User leaving the kota KTP field blank");
    }
    @Then("User should see validation text in the kota KTP")
    public void User_should_see_validation_text_in_the_kota_KTP() {
        Assert.assertEquals(inputDataPage.getTxtFillOutKotaKTP(),"Please select an item in the list.");
        extentTest.log(LogStatus.PASS, "User should see validation text in the kota KTP");
    }

    //Faskes Awal
    @And("User leaving the faskes awal field blank")
    public void user_leaving_the_faskes_awal_field_blank(){
        inputDataPage.enterFaskesAwal("");
        extentTest.log(LogStatus.PASS, "User leaving the faskes awal blank");
    }
    @Then("User should see warning text in the faskes awal")
    public void User_should_see_validation_text_in_the_faskes_awal() {
        Assert.assertEquals(inputDataPage.getTxtFillOutFaskesAwal(),"Please fill out this field.");
        extentTest.log(LogStatus.PASS, "User should see validation text in the faskes awal");
    }

    //faskes tujuan
    @And("User leaving the faskes tujuan field blank")
    public void user_leaving_the_faskes_tujuan_field_blank(){
        inputDataPage.selectDropDownFaskesTujuan("");
        extentTest.log(LogStatus.PASS, "User leaving the faskes tujuan field blank");
    }
    @Then("User should see warning text in the faskes tujuan")
    public void user_should_see_validation_text_in_the_faskes_tujuan() {
        Assert.assertEquals(inputDataPage.getTxtFillOutFaskesTujuan(),"clinic meruya");
        extentTest.log(LogStatus.PASS, "User should see warning text in the faskes tujuan");
    }

    //alamat
    @And("User leaving the alasan field blank")
    public void user_leaving_the_alasan_field_blank(){
        inputDataPage.enterAlasan("");
        extentTest.log(LogStatus.PASS, "User leaving the faskes tujuan field blank");
    }
    @Then("User should see warning text in the alamat")
    public void user_should_see_validation_text_in_the_alamat() {
        Assert.assertEquals(inputDataPage.getTxtAlasan(),"Field Alasan Harus Diisi!");
        extentTest.log(LogStatus.PASS, "User should see warning text in the faskes tujuan");
    }

}
