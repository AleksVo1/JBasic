package oop.homeWork15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class HillelTestingPage {

    @FindBy(xpath = "//*[@id=\"categories\"]/div[2]/div/ul/li/div/div[1]/ul")
    private WebElement courses;

    @FindBy(css = "p.profession-bar_title")
    private WebElement courseItem;

    @FindBy(xpath = "//*[@id=\"categories\"]/div[2]/div/ul/li/div/div[2]/ul")
    private WebElement additionalCourse;

    @FindBy(css = ".categories__list")
    private WebElement categories;

    @FindBy(css = ".categories__list-item a")
    private WebElement categoryItem;

    @FindBy(css = ".opportunities_list")
    private WebElement opportunities;

    @FindBy(css = ".opportunity-item_title")
    private WebElement opportunityItem;

    @FindBy(xpath = "//*[@id=\"categories\"]/div/ul/li[1]/a")
    private WebElement categoryProgramming;

    @FindBy(xpath = "//*[@id=\"categories\"]/div/ul/li[3]/a")
    private WebElement categoryManagement;

    @FindBy(xpath = "//*[@id=\"categories\"]/div/ul/li[4]/a")
    private WebElement categoryMarketing;

    @FindBy(xpath = "//*[@id=\"categories\"]/div/ul/li[5]/a")
    private WebElement categoryDesign;

    @FindBy(xpath = "//*[@id=\"categories\"]/div/ul/li[6]/a")
    private WebElement categoryKids;


    public List<String> getCourses(){
        List<String> coursesNames = new ArrayList<>();
        List<WebElement> items = courses.findElements(By.cssSelector(".profession-bar_title"));

        for (WebElement itemCourse: items) {
            coursesNames.add(itemCourse.getText());

        }
        return coursesNames;

    }

    public List<String> getAdditionalCourses(){
        List<String> additionalCoursesNames = new ArrayList<>();
        List<WebElement> additionalItems = additionalCourse.findElements(By.cssSelector(".profession-bar_title"));

        for (WebElement itemAdditionalCourse : additionalItems) {
            additionalCoursesNames.add(itemAdditionalCourse.getText());

        }
        return additionalCoursesNames;

    }

    public List<String> getOpportunities(){
        List<String> opportunitiesNames = new ArrayList<>();
        List<WebElement> opportunityItems = opportunities.findElements(By.cssSelector(".opportunity-item_title"));

        for (WebElement itemOpportunity : opportunityItems) {
            opportunitiesNames.add(itemOpportunity.getText());

        }
        return opportunitiesNames;

    }

    public void goToCategory (String category){

        switch (category.toLowerCase()){

            case "програмування":
                categoryProgramming.click();
                break;

            case "менеджмент":
                categoryManagement.click();
                break;

            case "маркетинг":
                categoryMarketing.click();
                break;

            case "дизайн":
                categoryDesign.click();
                break;

            case "дитячі курси":
                categoryKids.click();
                break;

            default:
                System.out.println("Немає такої категорії");
        }
    }
}
