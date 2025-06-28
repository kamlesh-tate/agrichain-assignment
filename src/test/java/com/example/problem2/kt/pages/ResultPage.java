// ResultPage.java
package com.example.problem2.kt.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResultPage {
    @FindBy(css = ".output-value")
    private WebElement outputText;

    @FindBy(id = "backHomeBtn")
    private WebElement backHomeBtn;

    private WebDriver driver;

    public ResultPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String getOutput() {
        return outputText.getText().trim();
    }

    public void backToHome() {
        backHomeBtn.click();
    }
}
