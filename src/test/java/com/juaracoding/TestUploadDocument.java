package com.juaracoding;

import com.juaracoding.drivers.DriverSingleton;
import com.juaracoding.pages.UploadDocumentPage;
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
    @And("User click button choose and select valid foto")
    public void user_click_button_choose_select_valid_foto(){
        uploadDocumentPage.clickChoose("C:/Users/HP/Downloads/ttdd.jpg");
        extentTest.log(LogStatus.PASS, "User click button choose and select valid foto");
    }
    @And("User click button cancel")
    public void user_click_button_cancel(){
        DriverSingleton.delay(2);
        uploadDocumentPage.clickCancel();
        extentTest.log(LogStatus.PASS, "User click button cancel");
    }

    @And("User click button save")
    public void user_click_button_save(){
        uploadDocumentPage.clickSimpan();
        extentTest.log(LogStatus.PASS, "User click button save");
    }
    @And("User click button ok")
    public void user_click_button_ok(){
        DriverSingleton.delay(2);
        uploadDocumentPage.clickOk();
        extentTest.log(LogStatus.PASS, "User click button ok");
    }
    @And("User click button foto faskes tujuan")
    public void user_click_button_foto_faskes_tujuan(){
        uploadDocumentPage.clickFaskesTujuan();
        extentTest.log(LogStatus.PASS, "User click button foto faskes tujuan");
        uploadDocumentPage.clickClose();
    }
    @And("User click button choose and select valid foto faskes tujuan")
    public void user_click_button_choose_and_select_valid_foto_faskes_tujuan(){
        uploadDocumentPage.clickChoose("C:/Users/HP/Downloads/ttdd.jpg");
        extentTest.log(LogStatus.PASS, "User click button choose and select valid foto faskes tujuan");
    }
    @And("User click button TTD")
    public void user_click_button_TTD(){
        DriverSingleton.delay(5);
        uploadDocumentPage.clickTTD();
        extentTest.log(LogStatus.PASS, "User click button TTD");
    }
    @And("User click button choose and select valid foto TTD")
    public void user_click_button_choose_and_select_valid_foto_TTD(){
        uploadDocumentPage.clickChoose("C:/Users/HP/Downloads/ttdd.jpg");
        extentTest.log(LogStatus.PASS, "User click button choose and select valid foto TTD");
    }

    @And("User click button selanjutnya")
    public void user_click_button_selanjutnya(){
        uploadDocumentPage.clickSelanjutnya();
        extentTest.log(LogStatus.PASS, "User click button selanjutnya");
    }
    @And("User Click OK in alert message")
    public void User_Click_OK_in_alert_message(){
        driver.switchTo().alert().accept();
        extentTest.log(LogStatus.PASS, "User Click OK in alert message");
    }
    @Then("User should see message succesfully uploaded")
    public void user_should_see_message_succesfully_uploaded() {
        DriverSingleton.delay(2);
        String expected="Data Berhasil diupload!";
        String actual = uploadDocumentPage.getTxtSuccesfully();
        Assert.assertEquals(actual, expected);
        extentTest.log(LogStatus.PASS, "User should see message succesfully uploaded");
        DriverSingleton.delay(2);
    }
    @Then("User will be directed to tanda tangan digital tab")
    public void user_should_see_validation(){
        DriverSingleton.delay(2);
        Assert.assertEquals(uploadDocumentPage.getTxtUploadDataBerhasil(), "Data");
        extentTest.log(LogStatus.PASS, "User will be directed to tanda tangan digital tab");
    }
    @Then("User will be directed to upload foto before")
    public void user_will_be_directed_to_upload_foto_before(){
        DriverSingleton.delay(2);
        Assert.assertEquals(uploadDocumentPage.getTxtUploadFotoBefore(),"Upload Foto Before");
        extentTest.log(LogStatus.PASS, "User will be directed to upload foto before");
        uploadDocumentPage.clickClose();
    }
    @Then("User will be directed to upload foto after")
    public void user_will_be_directed_to_upload_foto_after(){
        DriverSingleton.delay(2);
        Assert.assertEquals(uploadDocumentPage.getTxtUploadFotoAfter(),"Upload Foto After");
        extentTest.log(LogStatus.PASS, "User will be directed to upload foto before");
        uploadDocumentPage.clickClose();
    }
    @Then("User will be directed to upload TTD")
    public void user_will_be_directed_to_upload_TTD(){
        DriverSingleton.delay(2);
        Assert.assertEquals(uploadDocumentPage.getTxtUploadTTD(),"Upload Foto TTD");
        extentTest.log(LogStatus.PASS, "User will be directed to upload foto before");
        uploadDocumentPage.clickClose();
    }
    @Then("User will be directed to upload document")
    public void user_will_be_directed_to_upload_document(){
        DriverSingleton.delay(2);
        Assert.assertTrue(uploadDocumentPage.getTxtUploadDocument().contains("Upload Document"));
        extentTest.log(LogStatus.PASS, "User will be directed to upload document");
        DriverSingleton.delay(2);
    }
    @Then("User will see validation message")
    public void user_will_see_validation_message(){
        DriverSingleton.delay(2);
        Assert.assertTrue(uploadDocumentPage.getTxtUploadError().contains("Upload error: You did not select a file to upload."));
        extentTest.log(LogStatus.PASS, "User will see validation message");
        uploadDocumentPage.clickClose();

    }
    @Then("User will see validation message required")
    public void user_will_see_validation_message_required(){
        DriverSingleton.delay(2);
        Assert.assertEquals(uploadDocumentPage.getTxtChooseFile(),"ttdd.jpg");
        extentTest.log(LogStatus.PASS, "User will see validation message required");
        DriverSingleton.delay(2);
        uploadDocumentPage.clickClose();

    }
    //Negative Test Case

}