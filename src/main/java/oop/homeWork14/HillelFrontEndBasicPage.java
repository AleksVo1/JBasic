package oop.homeWork14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class HillelFrontEndBasicPage {

    public HillelFrontEndBasicPage() {
    }

    @FindBy(id = "coachesShowAllButton")
    private WebElement showAllButton;

    @FindBy(id = "coachesSection")
    private WebElement coachSection;

    public void clickShowAll() {
        showAllButton.click();

    }

    public List<String> getListCoaches(){
        List<String> coachesNames = new ArrayList<>();
        List<WebElement> cards = coachSection.findElements(By.cssSelector("p.coach-card_name"));
        for (WebElement card : cards) {
            coachesNames.add(card.getText());
        }
        return coachesNames;

    }
}
