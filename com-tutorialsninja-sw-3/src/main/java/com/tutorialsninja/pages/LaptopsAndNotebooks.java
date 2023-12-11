package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;

public class LaptopsAndNotebooks extends Utility {

    By highToLow = By.id("input-sort");

    public void setHighToLow(){
        selectByIndexFromDropDown(highToLow,4);
    }
}
