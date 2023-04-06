package oop.homeWork14;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HillelHomePage {

    @FindBy(xpath = "//*[@id=\"body\"]/div[1]/main/section[2]/div/div/div[1]/div/ul/li[1]")
    private WebElement programming;

    public HillelHomePage() {
    }

    void ClickToProgramming(){
        programming.click();

    }

}
