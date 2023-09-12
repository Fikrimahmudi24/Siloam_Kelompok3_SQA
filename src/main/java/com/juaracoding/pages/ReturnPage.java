package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.juaracoding.drivers.DriverSingleton.*;

public class ReturnPage {
    private WebDriver driver;

    public ReturnPage() {
        driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    // Locator Element @FindBy
    @FindBy(xpath = "//a[@href='https://dev.ptdika.com/siloam/sales/new_data']")
    WebElement menuReturn;
    @FindBy(xpath = "//h1[@class='page-header']")
    WebElement txtPageHeader;
    @FindBy(xpath = "//input[@id='tgl']")
    WebElement fieldStartDate;
    @FindBy(xpath = "//td[@class='day'][normalize-space()='1']")
    WebElement dateOne;
    @FindBy(xpath = "//input[@id='tgl2']")
    WebElement fieldEndDate;
    @FindBy(xpath = "//td[@class='day'][normalize-space()='5']")
    WebElement dateFive;
    @FindBy(xpath = "//button[@id='btn-filter']")
    WebElement btnFilter;
    @FindBy(xpath = "//tbody/tr[1]")
    WebElement dataInTable;
    @FindBy(xpath = "//tbody/tr[1]/td[2]")
    WebElement dataSearch;
    @FindBy(xpath = "//button[@id='btn-reset']")
    WebElement btnReset;
    @FindBy(xpath = "//select[@name='table_length']")
    WebElement comboBox;
    @FindBy(xpath = "//div[@id='table_info']")
    WebElement tableInfo;
    @FindBy(xpath = "//input[@type='search']")
    WebElement fieldSearch;
    @FindBy(xpath = "//i[@class='fa fa-search']")
    WebElement btnSearch;
    @FindBy(xpath = "//span[@id='btnRefresh']")
    WebElement btnSearchReset;
    @FindBy(xpath = "//tbody/tr[1]/td[7]/center[1]/a[1]/span[1]")
    WebElement btnAksi;
    @FindBy(xpath = "//a[normalize-space()='2']")
    WebElement btnPageTwoTable;
    @FindBy(xpath = "//a[normalize-space()='Next']")
    WebElement btnNextPage;
    @FindBy(xpath = "//td[@class='dataTables_empty']")
    WebElement txtEmptyData;
    @FindBy(xpath = "//td[@class='active day']")
    WebElement activeDay;

    public void clickMenuReturn(){
        menuReturn.click();
    }
    public String getTxtPageHeader(){
        delay(3);
        return txtPageHeader.getText();
    }
    public void enterValidStartDate(){
        fieldStartDate.click();
        dateOne.click();
    }
    public void enterValidEndDate(){
        fieldEndDate.click();
        dateFive.click();
    }
    public void enterStartDate(){
        fieldStartDate.click();
        dateFive.click();
    }
    public void enterEndDate(){
        fieldEndDate.click();
        dateOne.click();
    }
    public void clickBtnFilter(){
        btnFilter.click();
    }
    public String getTxtDataInTable(){
        delay(3);
        return dataInTable.getText();
    }
    public String getTxtDataSearch(){
        delay(3);
        return dataSearch.getText();
    }
    public String getTxtNoData(){
        delay(3);
        return txtEmptyData.getText();
    }
    public void clickBtnReset(){
        btnReset.click();
    }
    public void enterComboBox(){
        comboBox.click();
        comboBox.sendKeys("25"+Keys.ENTER);
        delay(2);
    }
    public String getTxtAllDataInTable(){
        delay(3);
        DriverSingleton.scrollDown();
        return tableInfo.getText();
    }
    public void clickBtnSeacrh(){
        btnSearch.click();
    }
    public void clickFieldName(){
        fieldSearch.click();
    }
    public void enterNameInSearch(String name){
        fieldSearch.sendKeys(Keys.CONTROL+"A"+Keys.DELETE);
        fieldSearch.sendKeys(name);
    }
    public void clickBtnSearchReset(){
        btnSearchReset.click();
    }
    public void clickBtnView(){
        btnAksi.click();
    }
    public void clickBtnPageTwo(){
        DriverSingleton.scrollDown();
        btnPageTwoTable.click();
        DriverSingleton.scrollUp();
    }
    public void clickBtnNextPage(){
        DriverSingleton.scrollDown();
        btnNextPage.click();
        DriverSingleton.scrollUp();
    }

}
