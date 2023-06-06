package com.example;

import com.example.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest {
    private WebDriver driver;
    private LoginPage loginPage;

    @BeforeClass
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        loginPage = new LoginPage(driver);
    }

    @Test(priority = 1)
    public void testLogin() throws InterruptedException {
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
        Thread.sleep(5000);
    
     }
    @Test(priority = 2)
    public void testCase1() {
    loginPage.sendKey("Admin",loginPage.usernameField);    }

    @Test(priority = 3)
    public void testCase2() {
     loginPage.sendKey("admin123",loginPage.passwordField);
     }

     @Test(priority = 4)
     public void testCase3() {
        loginPage.clickButton(loginPage.loginButton);
    }
    @Test(priority = 5)
        public void testCase4()  {
            
    loginPage.clickButton(loginPage.adminButton);    }

    @Test(priority = 6)
    public void testCase5() {

        loginPage.selectFromDropdown(driver,loginPage.dropDown,loginPage.dropdownList,"Job Titles");    }
       
    @Test(priority = 7)
    public void testCase6() {
        loginPage.clickButton(loginPage.addbutton);    }

    @Test(priority = 8)
        public void testCase7() {
         loginPage.sendKey("Administrator",loginPage.jobTitle);
         }
    @Test(priority = 9)
         public void testCase8() {
            loginPage.clickButton(loginPage.jobDescription);
          loginPage.sendKey(" An Administrator provides office support to either an individual or team",loginPage.jobDescription);
          }
    @Test(priority = 10)
          public void testCase9() {
              loginPage.clickButton(loginPage.savebutton);    }
    @Test(priority = 11)
              public void testCase10() {
                  loginPage.clickButton(loginPage.recruimentbutton);    }
    @Test(priority = 12)
                  public void testCase11() {
                      loginPage.clickButton(loginPage.addRbutton);    }
    @Test(priority = 13)
                      public void testCase12() {
                          loginPage.sendKey("Mohammad",loginPage.firstName);  
                          loginPage.sendKey("Nouri",loginPage.lastName);  
                          loginPage.sendKey("mohammad.noori@gmail.com",loginPage.emailAddress);  
                         }
    @Test(priority = 14)
                          public void testCase13() {
                      
                              loginPage.selectFromDropdownWithSelect(driver,loginPage.vacancydropdown,loginPage.vacancydropdownlist,"Software Engineer");    }
    @Test(priority = 15)
                              public void testCase14() {
                                  loginPage.clickAndClear(loginPage.calendar);  
                                  loginPage.sendKey("2022-10-10", loginPage.calendar);
                                   }
                                   @Test(priority = 15)
                                   public void testCase15() {
                                      loginPage.clickButton(loginPage.jobDescription);
                                    loginPage.sendKey(" This is a note ",loginPage.note);
                                    }
    @Test(priority = 16)
                  public void testCase16() {
                    
                      loginPage.clickButton(loginPage.checkBox); 
                      loginPage.clickButton(loginPage.savebutton);     }

                      @Test(priority = 17)
                      public void testCase17() {
                        
                          loginPage.clickButton(loginPage.adminButton); 
                          loginPage.selectFromDropdown(driver,loginPage.dropDown,loginPage.dropdownList,"Job Titles");
                          loginPage.clickButton(loginPage.delete);  
                          loginPage.clickButton(loginPage.confirmDelete);  

                              }
            


    @AfterClass
    public void teardown() {
        driver.quit();
    }
}
