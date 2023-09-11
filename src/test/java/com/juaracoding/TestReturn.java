package com.juaracoding;

import com.juaracoding.drivers.DriverSingleton;
import com.juaracoding.pages.LoginPage;
import com.juaracoding.pages.ReturnPage;
import com.juaracoding.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import static com.juaracoding.drivers.DriverSingleton.delay;

public class TestReturn {
    static WebDriver driver;
    static ExtentTest extentTest;
    static ReturnPage returnPage = new ReturnPage();
    static LoginPage loginPage = new LoginPage();
    public TestReturn(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }
    @When("User click menu return")
    public void User_click_menu_return(){
        loginPage.validLoginSales();
        returnPage.clickMenuReturn();
        extentTest.log(LogStatus.PASS, "User click menu return");
    }
    @Then("User should see text title page return")
    public void Use_should_see_text_title_page_return(){
        Assert.assertEquals(returnPage.getTxtPageHeader(), "Form Return");
        extentTest.log(LogStatus.PASS, "User should see text title page return");
        delay(3);
    }
    @When("User enter valid start date")
    public void User_enter_valid_start_date(){
        returnPage.enterValidStartDate();
        extentTest.log(LogStatus.PASS, "User enter valid start date");
    }
    @And("User enter valid end date")
    public void User_enter_valid_end_date(){
        returnPage.enterValidEndDate();
        extentTest.log(LogStatus.PASS, "User enter valid end date");
    }
    @And("User click button filter")
    public void User_click_button_filter(){
        returnPage.clickBtnFilter();
        extentTest.log(LogStatus.PASS, "User click button filter");
    }
    @Then("User should see data in table")
    public void User_should_see_data_in_table(){
        Assert.assertTrue(returnPage.getTxtDataInTable().contains("1"));
        extentTest.log(LogStatus.PASS, "User should see data in table");
        delay(2);
        DriverSingleton.scrollUp();
        returnPage.clickBtnSearchReset();
        delay(1);
    }
    @When("User enter start date")
    public void Use_enter_start_date(){
        returnPage.enterStartDate();
        extentTest.log(LogStatus.PASS, "User enter start date");
    }
    @And("User enter end date earlier than the start date")
    public void User_enter_end_date_earlier_than_the_start_date(){
        returnPage.enterEndDate();
        extentTest.log(LogStatus.PASS, "User enter end date");
    }
    @Then("User should see no data in table")
    public void User_should_see_no_data_in_table(){
        Assert.assertEquals(returnPage.getTxtNoData(), "No data available in table");
        extentTest.log(LogStatus.PASS, "User should see no data in table");
    }
    @And("User click button reset")
    public void User_click_button_reset(){
        returnPage.clickBtnReset();
        extentTest.log(LogStatus.PASS, "User click button reset");
    }
    @And("User click combo box")
    public void User_click_combo_box(){
        returnPage.enterComboBox();
        extentTest.log(LogStatus.PASS, "User click combo box");
    }
    @Then("User should see all data in table")
    public void User_should_see_all_data_in_table(){
        Assert.assertTrue(returnPage.getTxtAllDataInTable().contains("25"));
        extentTest.log(LogStatus.PASS, "User should see all data in table");
        DriverSingleton.scrollUp();
    }
    @When("User click field search")
    public void User_click_field_search(){
        returnPage.clickFieldName();
        extentTest.log(LogStatus.PASS, "User click field search");
    }
    @And("User enter name in field search")
    public void User_enter_name_in_field_search(){
        returnPage.enterNameInSearch("Putri");
        extentTest.log(LogStatus.PASS, "User enter name in field search");
    }
    @And("User click button search")
    public void User_click_button_search(){
        returnPage.clickBtnSeacrh();
        extentTest.log(LogStatus.PASS, "User click button search");
    }
    @Then("User should see the searched data")
    public void User_should_see_the_searched_data(){
        Assert.assertEquals(returnPage.getTxtDataSearch(),"PUTRI TRG");
        extentTest.log(LogStatus.PASS, "User should see the searched data");
    }
    @And("User enter invalid name in field search")
    public void User_enter_invalid_name_in_field_search(){
        returnPage.enterNameInSearch("Jono");
        extentTest.log(LogStatus.PASS, "User enter invalid name in field search");
    }
    @And("User click button reset search")
    public void User_click_button_reset_search(){
        returnPage.clickBtnSearchReset();
        extentTest.log(LogStatus.PASS, "User click button reset search");
    }
    @And("User click button view")
    public void User_click_button_view(){
        returnPage.clickBtnView();
        extentTest.log(LogStatus.PASS, "User click button view");
    }
    @Then("User direct to menu upload document")
    public void User_direct_to_menu_upload_document(){
        Assert.assertEquals(returnPage.getTxtPageHeader(), "Form Input");
        extentTest.log(LogStatus.PASS, "User direct to menu upload document");
        returnPage.clickMenuReturn();
    }
    @And("User click page number two")
    public void User_click_page_number_two(){
        returnPage.clickBtnPageTwo();
        extentTest.log(LogStatus.PASS, "User click page number two");
    }
    @And("User click next page")
    public void User_click_next_page(){
        returnPage.clickBtnNextPage();
        extentTest.log(LogStatus.PASS, "User click next page");
    }
}
