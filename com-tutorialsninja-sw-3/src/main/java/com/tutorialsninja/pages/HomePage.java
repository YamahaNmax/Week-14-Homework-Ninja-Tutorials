package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomePage extends Utility {


    By desktop = By.xpath("//ul[@class='nav navbar-nav']/li[1]/a");
    By laptopsAndNotebooks = By.xpath("//ul[@class='nav navbar-nav']/li[2]/a");
    By components =By.xpath("//ul[@class='nav navbar-nav']/li[3]/a");



    public void mouseHoverToDesktop(){
        mouseHoverToElementAndClick(desktop);
    }

    public void mouseHoverToLaptopsAndNotebooks(){
        mouseHoverToElementAndClick(laptopsAndNotebooks);
    }

    public void mouseHoverToComponents(){
        mouseHoverToElementAndClick(components);
    }

    public void selectMenu(String menu) {
        WebElement menuLink = driver.findElement(By.xpath(menu));
        menuLink.click();
    }

}
