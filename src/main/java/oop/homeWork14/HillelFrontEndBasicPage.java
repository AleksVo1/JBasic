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
    private List<WebElement> coaches;

    public void clickShowAll() {
        showAllButton.click();

    }

    public List<String> getListCoaches(){
        List<String> coachesNames = new ArrayList<>();
        for (WebElement coach : coaches) {
            WebElement card = coach.findElement(By.xpath
                    ("/html/body/div[1]/main/section[6]/div/div/ul/li[1]/a/div/div[2]/p[1]"));

                        coachesNames.add(card.getText());
        }
        return coachesNames;

    }
}
