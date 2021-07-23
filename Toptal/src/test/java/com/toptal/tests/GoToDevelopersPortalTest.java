package com.toptal.tests;

import com.toptal.webpages.DevelopersPortalPage;
import com.toptal.webpages.HomePage;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class GoToDevelopersPortalTest {
    WebDriver driver;

    @Before
    public void setup(){
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void goToDevelopersPortal(){
        HomePage homePage = new HomePage(driver);
        homePage.clickViewDevelopers();

        DevelopersPortalPage devPage = new DevelopersPortalPage(driver);
        Assert.assertTrue(devPage.isPageOpened());
    }

    @After
    public void close(){
        driver.close();
    }
}
