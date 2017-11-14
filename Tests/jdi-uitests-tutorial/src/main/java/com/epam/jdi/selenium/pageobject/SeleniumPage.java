package com.epam.jdi.selenium.pageobject;

import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.FindBy;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * Created by Roman_Iovlev on 5/23/2017.
 */
public class SeleniumPage {
    @FindBy(css = ".logo")
    public WebElement logo;
    @FindBy(css = ".tile-menu>li>a")
    public List<WebElement> menu;
}
