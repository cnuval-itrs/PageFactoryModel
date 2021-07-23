package com.toptal.webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class DevelopersPortalPage {
    private WebDriver driver;

    @FindBy(how = How.XPATH, using = "//body/main[@id='page-root']/div[2]/nav[1]/div[1]/div[1]/div[1]/a[1]")
    private WebElement heading;

    public DevelopersPortalPage (WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public boolean isPageOpened(){ return heading.getText().contains("Developer"); }

}
