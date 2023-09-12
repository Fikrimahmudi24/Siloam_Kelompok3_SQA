package com.juaracoding;

import com.juaracoding.drivers.DriverSingleton;
import com.juaracoding.pages.InputDataPage;
import com.juaracoding.pages.LoginPage;
import com.juaracoding.pages.UploadDocumentPage;
import com.juaracoding.pages.ViewAdminPage;
import com.juaracoding.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestViewAdmin {
    static WebDriver driver;
    static ExtentTest extentTest;
    static ViewAdminPage viewAdminPage = new ViewAdminPage();
    static LoginPage loginPage = new LoginPage();
    public TestViewAdmin() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @When("User click menu view and export admin")
    public void user_click_menu_view_and_export_admin() {
        driver.get(Constants.URL);
        loginPage.validLoginAdmin();
        viewAdminPage.clickViewExport();
        extentTest.log(LogStatus.PASS, "User click menu view and export");
    }
    @And("User click start date for check the calender")
    public void user_click_start_date_for_check_the_calender() {
        viewAdminPage.clickStartDate();
        extentTest.log(LogStatus.PASS, "User click start date for check the calender");
    }

    @And("User input start date admin")
    public void user_input_start_date_admin() {
        viewAdminPage.inputStartDate("2023-08-01");
        extentTest.log(LogStatus.PASS, "User input start date");
    }
    @Then("User should see the calender admin")
    public void user_should_see_the_calender_admin() {
        DriverSingleton.delay(2);
        viewAdminPage.getTxtCalenderStartDate();
        Assert.assertTrue(viewAdminPage.getTxtCalenderStartDate().contains("September 2023"));
        extentTest.log(LogStatus.PASS, "User should see the calender");
        DriverSingleton.delay(2);
    }

    @And("User input letter in start date admin")
    public void user_input_letter_in_start_date_admin() {
        viewAdminPage.inputStartDate("negatif@");
        DriverSingleton.delay(2);
        extentTest.log(LogStatus.PASS, "User input letter in start date");
    }
    @And("User input invalid number start date admin")
    public void user_input_invalid_number_start_date_admin() {
        viewAdminPage.inputStartDate("1111@11@11");
        DriverSingleton.delay(2);
        extentTest.log(LogStatus.PASS, "User input invalid number start date");
    }
    @When("User click menu view and export without url admin")
    public void user_click_menu_view_and_export_without_url() {
        viewAdminPage.clickViewExport();
        extentTest.log(LogStatus.PASS, "User click menu view and export without url");
    }
    @Then("User should see text in view export page admin")
    public void user_should_see_text_in_view_export_page_admin() {
        viewAdminPage.getTxtViewExport();
        Assert.assertTrue(viewAdminPage.getTxtViewExport().contains("View & Export"));
        extentTest.log(LogStatus.PASS, "User should see text in view export page");
    }
    @Then("User should see text in the valid start date")
    public void user_should_see_text_in_the_valid_start_date() {
        viewAdminPage.getTxtStartDateValid();
        Assert.assertTrue(viewAdminPage.getTxtStartDateValid().contains("2023-08-01"));
        extentTest.log(LogStatus.PASS, "User should see text in valid start date");
    }
    @Then("User should see text in start date admin")
    public void user_should_see_text_in_start_date_admin() {
        viewAdminPage.getTxtStartDate();
        Assert.assertTrue(viewAdminPage.getTxtStartDate().contains("Start date"));
        extentTest.log(LogStatus.PASS, "User should see text in start date");
    }
    @Then("User should see text in start date for number admin")
    public void user_should_see_text_in_start_date_for_number_admin() {
        DriverSingleton.delay(2);
        viewAdminPage.getTxtStartDate();
        Assert.assertEquals(viewAdminPage.getTxtStartDateNumber(),"2023-09-11");
        System.out.println(viewAdminPage.getTxtStartDateNumber());
        extentTest.log(LogStatus.PASS, "User should see text in start date");
    }

    @And("User input end date admin")
    public void user_input_end_date_admin() {
        viewAdminPage.inputEndDate("2023-08-31");
        extentTest.log(LogStatus.PASS, "User input end date");
    }

    @And("User input letter in end date admin")
    public void user_input_letter_in_end_date_admin() {
        viewAdminPage.inputEndDate("kelompok@");
        extentTest.log(LogStatus.PASS, "User input letter in end date");
    }

    @And("User input invalid number end date admin")
    public void user_input_invalid_number_end_date_admin() {
        DriverSingleton.delay(3);
        viewAdminPage.inputEndDate("1111@11@11");
        extentTest.log(LogStatus.PASS, "User input invalid number end date");
        DriverSingleton.delay(3);
    }

    @And("User click button filter admin")
    public void user_click_button_filter_admin() {
        viewAdminPage.clickFilter();
        extentTest.log(LogStatus.PASS, "User click button filter");
    }

    @And("User click button export")
    public void user_click_button_export() {
        viewAdminPage.clickExport();
        extentTest.log(LogStatus.PASS, "User click button export");
    }

    @And("User click button download")
    public void user_click_button_download() {
        viewAdminPage.clickDownload();
        extentTest.log(LogStatus.PASS, "User click button download");
    }
    @And("User click link foto faskes awal")
    public void user_click_link_foto_faskes_awal() {
        viewAdminPage.clickFaskesAwal();
        extentTest.log(LogStatus.PASS, "User click link foto faskes awal");
    }
    @And("User click link foto faskes tujuan")
    public void user_click_link_foto_faskes_tujuan() {
        viewAdminPage.clickFaskesTujuan();
        extentTest.log(LogStatus.PASS, "User click link foto faskes tujuan");
    }
    @And("User click link pdf agreement")
    public void user_click_link_pdf_agreement() {
        viewAdminPage.clickAgreement();
        extentTest.log(LogStatus.PASS, "User click link pdf agreement");
    }
    @Then("User should see validation agreement pdf")
    public void user_should_see_validation_agreement_pdf() {
        viewAdminPage.getTxtAgreementPDF();
        extentTest.log(LogStatus.PASS, "User should see validation agreement pdf");
    }
    @Then("User should see text in the valid end date")
    public void user_should_see_text_in_valid_end_date() {
        DriverSingleton.delay(2);
        viewAdminPage.getTxtEndDate();
        Assert.assertEquals(viewAdminPage.getTxtEndDate(),"2023-08-31");
        System.out.println(viewAdminPage.getTxtEndDate());
        extentTest.log(LogStatus.PASS, "User should see text in start date");
    }
    @Then("User should see text in end date admin")
    public void user_should_see_text_in_end_date_admin() {
        DriverSingleton.delay(2);
        viewAdminPage.getTxtEndDateLetter();
        Assert.assertEquals(viewAdminPage.getTxtEndDateLetter(),"End date");
        System.out.println(viewAdminPage.getTxtEndDateLetter());
        extentTest.log(LogStatus.PASS, "User should see text in end date");
        DriverSingleton.delay(2);
    }
    @Then("User should see text in end date for number admin")
    public void user_should_see_text_in_end_date_for_number_admin() {
        DriverSingleton.delay(2);
        Assert.assertEquals(viewAdminPage.getTxtEndDateNumber(),"2023-09-11");
        System.out.println(viewAdminPage.getTxtEndDateNumber());
        extentTest.log(LogStatus.PASS, "User should see text in end date for number");
    }
    @Then("User should see data after click button filter")
    public void user_should_see_data_after_click_button_filter() {
        DriverSingleton.delay(2);
        Assert.assertEquals(viewAdminPage.getTxtFilter(),"2023-08-30 12:52:56");
        System.out.println(viewAdminPage.getTxtFilter());
        extentTest.log(LogStatus.PASS, "User should see text in end date for number");
    }
    @Then("User should see warning message in start date field")
    public void user_should_see_warning_message() {
        DriverSingleton.delay(2);
        Assert.assertEquals(viewAdminPage.getTxtWarningStartDate(),"Please fill out this field.");
        System.out.println(viewAdminPage.getTxtWarningStartDate());
        extentTest.log(LogStatus.PASS, "User should see text in end date for number");
    }
    @Then("User should see warning message in end date field")
    public void user_should_see_warning_message_in_end_date_field() {
        DriverSingleton.delay(2);
        Assert.assertEquals(viewAdminPage.getTxtWarningEndDate(),"Please fill out this field.");
        System.out.println(viewAdminPage.getTxtWarningEndDate());
        extentTest.log(LogStatus.PASS, "User should see text in end date for number");
        loginPage.validLogout();
    }

}