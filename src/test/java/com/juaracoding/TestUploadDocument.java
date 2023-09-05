package com.juaracoding;

import com.juaracoding.pages.InputDataPage;
import com.juaracoding.pages.LoginPage;
import com.juaracoding.pages.UploadDocumentPage;
import com.juaracoding.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestUploadDocument {
    static WebDriver driver;
    static ExtentTest extentTest;
    static InputDataPage inputDataPage = new InputDataPage();
    static UploadDocumentPage uploadDocumentPage = new UploadDocumentPage();

    public TestUploadDocument(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @When("User click button foto faskes awal")
    public void user_click_button_foto_faskes_awal(){
        uploadDocumentPage.clickFaskesAwal();
        extentTest.log(LogStatus.PASS, "User click button foto faskes awal");
    }
    @And("User click button choose and select valid foto faskes awal")
    public void user_click_button_choose_select_valid_foto_faskes_awal(){
        uploadDocumentPage.clickChoose("C:/Users/HP/Downloads/ttdd.jpg/");
        extentTest.log(LogStatus.PASS, "User click button choose and select valid foto faskes awal");
    }
//    @And("User select valid foto faskes awal document")
//    public void user_select_valid_foto_faskes_awal_document(){
//        uploadDocumentPage.("kelompoktiga");
//        extentTest.log(LogStatus.PASS, "User select valid foto faskes awal document");
//    }
    @And("User click button save")
    public void user_click_button_save(){
        uploadDocumentPage.clickSimpan();
        extentTest.log(LogStatus.PASS, "User click button save");
    }
    @And("User click button ok")
    public void user_click_button_ok(){
        uploadDocumentPage.clickOk();
        extentTest.log(LogStatus.PASS, "User click button ok");
    }
    @And("User click button foto faskes tujuan")
    public void user_click_button_foto_faskes_tujuan(){
        uploadDocumentPage.clickFaskesTujuan();
        extentTest.log(LogStatus.PASS, "User click button foto faskes tujuan");
    }
    @And("User click button choose and select valid foto faskes tujuan")
    public void user_click_button_choose_and_select_valid_foto_faskes_tujuan(){
        uploadDocumentPage.clickChoose("C:/Users/HP/Downloads/ttdd.jpg/");
        extentTest.log(LogStatus.PASS, "User click button choose and select valid foto faskes tujuan");
    }
    @And("User click button TTD")
    public void user_click_button_TTD(){
        uploadDocumentPage.clickTTD();
        extentTest.log(LogStatus.PASS, "User click button TTD");
    }
    @And("User click button choose and select valid foto TTD")
    public void user_click_button_choose_and_select_valid_foto_TTD(){
        uploadDocumentPage.clickChoose("C:/Users/HP/Downloads/ttdd.jpg/");
        extentTest.log(LogStatus.PASS, "User click button choose and select valid foto TTD");
    }

    @And("User click button selanjutnya")
    public void user_input_valid_nomor_ktp(){
        uploadDocumentPage.clickSelanjutnya();
        extentTest.log(LogStatus.PASS, "User input valid nomor ktp");
    }
    @And("User Click OK in alert message")
    public void User_Click_OK_in_alert_message(){
        driver.switchTo().alert().accept();
        extentTest.log(LogStatus.PASS, "User Click OK in alert message");
    }

    @Then("User will be directed to tanda tangan digital tab")
    public void user_should_see_validation(){
        Assert.assertEquals(uploadDocumentPage.getTxtUploadDataBerhasil(), "Data");
        extentTest.log(LogStatus.PASS, "User will be directed to tanda tangan digital tab");
    }
}