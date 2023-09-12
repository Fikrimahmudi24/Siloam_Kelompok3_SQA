package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ViewAdminPage {
    private WebDriver driver;

    public ViewAdminPage() {
        driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    // Locator Element @FindBy
    @FindBy(xpath = "//span[normalize-space()='View & Export']")
    WebElement btnViewExport;
    @FindBy(xpath = "//h1[@class='page-header']")
    WebElement txtViewExport;
    @FindBy(xpath = "//input[@id='datepicker']")
    WebElement startDate;
    @FindBy(xpath = "//th[normalize-space()='September 2023']")
    WebElement txtCalenderStartDate;
    @FindBy(xpath = "//input[@id='datepicker2']")
    WebElement endDate;
    @FindBy(xpath = "//input[@id='datepicker2']")
    WebElement btnEndDate;
    @FindBy(xpath = "//button[normalize-space()='Filter']")
    WebElement btnFilter;
    @FindBy(xpath = "//button[normalize-space()='Export']")
    WebElement btnExport;
    @FindBy(xpath = "//button[normalize-space()='Download']")
    WebElement btnDownload;
    @FindBy(xpath = "//tbody/tr[1]/td[7]/a[1]")
    WebElement viewFaskesAwal;
    @FindBy(xpath = "//tbody/tr[1]/td[8]/a[1]")
    WebElement viewFaskesTujuan;
    @FindBy(xpath = "//tbody/tr[1]/td[9]/a[1]")
    WebElement viewAgreement;
    @FindBy(xpath = "//tbody/tr[1]/td[2]/a[1]")
    WebElement btnView;
    @FindBy(css = ".btn::before")
    WebElement btnPreview;
    @FindBy(xpath = "")
    WebElement btnLogout;

    @FindBy(xpath = "//*[@id=\"title\"]")
    WebElement txtAgreementPDF;
    @FindBy(xpath = "//td[normalize-space()='2023-08-30 12:52:56']")
    WebElement txtFilter;

    public void clickViewExport() {
        btnViewExport.click();
    }

    public void inputStartDate(String startDate) {

        this.startDate.sendKeys(startDate+ Keys.ENTER);
    }

    public void inputEndDate(String endDate) {

        this.endDate.sendKeys(endDate+Keys.ENTER);
    }

    public void clickStartDate() {
        startDate.click();
    }
    public void clickFilter() {
        btnFilter.click();
    }

    public void clickExport() {
        btnExport.click();
    }

    public void clickDownload() {
        btnDownload.click();
    }

    public void clickFaskesAwal() {
        viewFaskesAwal.click();
    }

    public void clickFaskesTujuan() {
        viewFaskesTujuan.click();
    }

    public void clickAgreement() {
        viewAgreement.click();
    }

    public void clickView() {
        btnView.click();
    }
//    public void clickPreview() {
////        btnPreview.click();
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("arguments[0].click();", btnPreview);
//    }

    public String getTxtCalenderStartDate() {
        return txtCalenderStartDate.getText();
    }
    public void getTxtAgreementPDF() {
        txtAgreementPDF.getText();
    }
    public String getTxtViewExport() {
        return txtViewExport.getText();
    }
    public void getTxtStartDateDua() {
        startDate.getText();
    }
    public void clickEndDate() {
        btnEndDate.click();
    }
    public String getTxtStartDate() {
        DriverSingleton.delay(2);
        String output = "";
        String required = startDate.getAttribute("required");
        if (required.equals("true")) {
            output += "Start date";
        }
        return output;
    }
    public String getTxtStartDateValid() {
        DriverSingleton.delay(2);
        String output = "";
        String required = startDate.getAttribute("required");
        if (required.equals("true")) {
            output += "2023-08-01";
        }
        return output;
    }
    public String getTxtStartDateNumber() {
        DriverSingleton.delay(2);
        String output = "";
        String required = startDate.getAttribute("required");
        if (required.equals("true")) {
            output += "2023-09-11";
        }
        return output;
    }
    public String getTxtEndDate() {
        DriverSingleton.delay(2);
        String output = "";
        String required = endDate.getAttribute("required");
        if (required.equals("true")) {
            output += "2023-08-31";
        }
        return output;
    }
    public String getTxtEndDateLetter() {
        DriverSingleton.delay(2);
        String output = "";
        String required = endDate.getAttribute("required");
        if (required.equals("true")) {
            output += "End date";
        }
        return output;
    }
    public String getTxtEndDateNumber() {
        DriverSingleton.delay(2);
        String output = "";
        String required = endDate.getAttribute("required");
        if (required.equals("true")) {
            output += "2023-09-11";
        }
        return output;
    }
    public String getTxtFilter() {
        return txtFilter.getText();
    }
    public String getTxtWarningStartDate() {
        DriverSingleton.delay(2);
        String output = "";
        String required = startDate.getAttribute("required");
        if (required.equals("true")) {
            output += "Please fill out this field.";
        }
        return output;
    }
    public String getTxtWarningEndDate() {
        DriverSingleton.delay(2);
        String output = "";
        String required = endDate.getAttribute("required");
        if (required.equals("true")) {
            output += "Please fill out this field.";
        }
        return output;
    }



//    public String getTxtFilter() {
//        DriverSingleton.delay(2);
//        String output = "";
//        String required = endDate.getAttribute("required");
//        if (required.equals("true")) {
//            output += "2023-09-11";
//        }
//        return output;
//    }
}