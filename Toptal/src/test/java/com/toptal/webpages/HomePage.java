package com.toptal.webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    private WebDriver driver;

    private static String PAGE_URL="https://www.toptal.com";

    @FindBy(how = How.LINK_TEXT, using = "Hire Top Talent")
    private WebElement hireTopTalentButton;

    @FindBy(how = How.XPATH, using = "//h3[contains(text(),'Developers')]")
    private WebElement viewDevelopers;

    @FindBy(how = How.XPATH, using = "//h3[contains(text(),'Designers')]")
    private WebElement viewDesigners;

    @FindBy(how = How.XPATH, using = "//h3[contains(text(),'Finance Experts')]")
    private WebElement viewFinanceExperts;

    @FindBy(how = How.XPATH, using = "//h3[contains(text(),'Project Managers')]")
    private WebElement viewProjectManagers;

    @FindBy(how = How.XPATH, using = "//h3[contains(text(),'Toptal® Projects')]")
    private WebElement viewToptalProjects;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        driver.get(PAGE_URL);
        PageFactory.initElements(driver,this);
    }

    public void clickOnHireTopTalentButton(){
        hireTopTalentButton.click();
    }
    public void clickViewDevelopers(){
        viewDevelopers.click();
    }
    public void clickViewDesigners() { viewDesigners.click();}
    public void clickViewFinanceExperts() { viewFinanceExperts.click();}
    public void clickViewProjectManagers() { viewProjectManagers.click();}
    public void clickViewToptalProjects() { viewToptalProjects.click();}

    public boolean isPageOpened () { return hireTopTalentButton.isDisplayed(); }


}
