// InputPage.java
package com.example.problem2.kt.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InputPage {
    @FindBy(id = "stringInput")
    private WebElement inputBox;

    @FindBy(id = "submitBtn")
    private WebElement submitBtn;

    private WebDriver driver;

    public InputPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void enterString(String s) {
        inputBox.clear();
        inputBox.sendKeys(s);
    }

    public void clickSubmit() {
        submitBtn.click();
    }
}
