package oop.homeWork14;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HillelProgrammingPage {
    public HillelProgrammingPage() {
    }

    @FindBy(xpath = "//*[@id=\"categories\"]/div[3]/div/ul/li[1]/div/div[1]/ul/li[1]/a")
    private WebElement frontEndBasic;

    void ClickToFrontEndBasic(){
        frontEndBasic.click();
    }

}
