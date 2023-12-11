package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomePage extends Utility {



    public void selectMenu(String menu) {
        WebElement menuLink = driver.findElement(By.xpath(menu));
        menuLink.click();
    }
}
