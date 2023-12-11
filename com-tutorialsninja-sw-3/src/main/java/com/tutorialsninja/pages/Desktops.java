package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;

public class Desktops extends Utility {

    By positionZtoA = By.id("input-sort");
    By positionAtoZ = By.id("input-sort");

    public void sortByPositionZtoA() {
        selectByIndexFromDropDown(positionZtoA, 2);
    }

    public void sortByPositionAtoZ() {
        selectByIndexFromDropDown(positionAtoZ, 1);
    }
}
