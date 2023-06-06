package com.example;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.xml.sax.Locator;

public class LoginPage {
    private final WebDriver driver;
    private final Actions actions;
    private final WebDriverWait wait;
    
     final By usernameField = By.xpath("(//input)[2]");
     final By passwordField = By.xpath("(//input)[3]");
     final By loginButton =  By.xpath("//button[@type='submit']");  
     final By adminButton =  By.xpath("(//li[@class='oxd-main-menu-item-wrapper'])[1]");  
     final By dropDown =  By.xpath("//header/div[2]/nav[1]/ul[1]/li[2]/span[1]"); 
     final By dropdownList = By.xpath("(//a[@role='menuitem'])[1]");
     final By addbutton = By.xpath("(//button)[3]");
     final By jobTitle = By.xpath("(//input)[2]");
     final By jobDescription = By.xpath("(//textarea)[1]");
     final By savebutton = By.xpath("(//button)[4]");
     final By recruimentbutton = By.xpath("(//li[@class='oxd-main-menu-item-wrapper'])[5]");
     final By addRbutton = By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']");
     final By firstName = By.xpath("(//input)[2]");
     final By lastName = By.xpath("(//input)[4]");
     final By vacancydropdown = By.xpath("//div[@class='oxd-select-text oxd-select-text--active']");
     final By vacancydropdownlist = By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/i[1]");
     final By calendar = By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[5]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/input[1]");
     final By note = By.xpath("//textarea");
     final By checkBox = By.xpath("//span[@class='oxd-checkbox-input oxd-checkbox-input--active --label-right oxd-checkbox-input']");
     final By emailAddress = By.xpath("(//input)[5]");
     final By delete = By.xpath("(//button)[4]");
     final By confirmDelete = By.xpath("(//button)[8]");













    public LoginPage(WebDriver driver) {
        this.driver = driver;
        this.actions = new Actions(driver);
        this.wait = new WebDriverWait(driver,Duration.ofSeconds(5));
    }
    public void sendKey(String value,By element) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(element));
        driver.findElement(element).sendKeys(value);
    }

    public void clickButton(By element) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(element));
        driver.findElement(element).click();
    }
    public void clickAndClear(By element) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(element));
        driver.findElement(element).sendKeys(Keys.CONTROL + "a"); 
        driver.findElement(element).sendKeys(Keys.DELETE);
    }
    public  void selectFromDropdown(WebDriver driver, By dropdownLocator,By dropdownList, String value) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(dropdownLocator));

        WebElement dropdownElement = driver.findElement(dropdownLocator);
        dropdownElement.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(dropdownList));

        List<WebElement> list = driver.findElements(dropdownList);
        for (int i = 0; i < list.size(); i++) {
            String text = list.get(i).getText();
            if (text.equals(value)) {
                list.get(i).click();
                break;
            }
        }
        

    }
    public  void selectFromDropdownWithSelect(WebDriver driver, By dropdownLocator,By dropdownList, String value) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(dropdownLocator));
        WebElement dropdownElement = driver.findElement(dropdownList);
        dropdownElement.click();
        Select dropdown = new Select(dropdownElement);
        dropdown.selectByVisibleText(value);




    }
}
    

