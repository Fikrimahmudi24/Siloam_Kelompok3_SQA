package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.juaracoding.drivers.DriverSingleton.delay;

public class LoginPage {
    private WebDriver driver;

    public LoginPage() {
        driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    // Locator Element @FindBy
    @FindBy(xpath = "//h1[normalize-space()='Not Found']")
    WebElement txtNotFound;
    @FindBy(xpath = "//b[normalize-space()='DIKA | SILOAM']")
    WebElement txtHomeLogin;
    @FindBy(xpath = "//input[@placeholder='Username']")
    WebElement username;

    @FindBy(xpath = "//input[@placeholder='Password']")
    WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement btnLogin;

    @FindBy(xpath = "//h1[@class='page-header']")
    WebElement txtDashboard;

    @FindBy(xpath = "//div[@class='info']")
    WebElement txtProfileName;

    @FindBy(xpath = "//span[@class='d-none d-md-inline']")
    WebElement profile;

    @FindBy(xpath = "//a[@class='dropdown-item']")
    WebElement btnLogout;

    public String getTxtNotFound(){
        delay(3);
        return txtNotFound.getText();
    }
    public String getTxtHomeLogin(){
        delay(3);
        return txtHomeLogin.getText();
    }
    public String getTxtFillOut(){
        delay(2);
        String output = "";
        String required = username.getAttribute("required");
        if (required.equals("true")){
            output += "Please fill out this field.";
        }
        System.out.println(output);
        return output;
    }
    public void enterUsername(String username){
        this.username.sendKeys(username);
    }
    public void enterPassword(String password){
        this.password.sendKeys(password);
    }
    public void clickBtnLogin(){
        this.btnLogin.click();
    }
    public void clickProfile(){
        profile.click();
    }
    public void clickBtnLogout(){
        btnLogout.click();
    }
    public void validLogin(){
        username.sendKeys("admindika");
        password.sendKeys("d1k4@passw0rd");
        btnLogin.click();
    }
    public String getTxtHome(){
        delay(3);
        return txtDashboard.getText();
    }
    public String getTxtProfile(){
        delay(3);
        return txtProfileName.getText();
    }
}
