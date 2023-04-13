package oop.homeWork16;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import java.util.ArrayList;
import java.util.List;

import static com.codeborne.selenide.Selenide.*;

public class HillelProgrammingPage16 extends HillelAbstractPage{
    private final ElementsCollection courses = $$x("//*[@id=\"categories\"]/div[2]/div/ul/li/div/div[1]/ul");
    private final SelenideElement courseItem = $("p.profession-bar_title");
    private final ElementsCollection additionalCourses =
            $$x("//*[@id=\"categories\"]/div[2]/div/ul/li/div/div[2]/ul");
    private final ElementsCollection categories = $$(".categories__list");
    private final SelenideElement categoryItem = $(".categories__list-item a");
    private final ElementsCollection opportunities = $$(".opportunities_list");
    private final SelenideElement opportunityItem = $(".opportunity-item_title");
    private final SelenideElement categoryTesting = $x("//*[@id=\"categories\"]/div/ul/li[2]/a");
    private final SelenideElement categoryManagement = $x("//*[@id=\"categories\"]/div/ul/li[3]/a");
    private final SelenideElement categoryMarketing = $x("//*[@id=\"categories\"]/div/ul/li[4]/a");
    private final SelenideElement categoryDesign = $x("//*[@id=\"categories\"]/div/ul/li[5]/a");
    private final SelenideElement categoryKids = $x("//*[@id=\"categories\"]/div/ul/li[6]/a");

    @Override
    public List<String> getCourses(){
        List<String> coursesNames = new ArrayList<>();
        List<SelenideElement> items = $$(".profession-bar_title");

        for (SelenideElement itemCourse: items) {
            coursesNames.add(itemCourse.getText());

        }
        return coursesNames;

    }

    @Override
    public List<String> getAdditionalCourses(){
        List<String> additionalCoursesNames = new ArrayList<>();
        List<SelenideElement> additionalItems = $$(".profession-bar_title");

        for (SelenideElement itemAdditionalCourse : additionalItems) {
            additionalCoursesNames.add(itemAdditionalCourse.getText());

        }
        return additionalCoursesNames;

    }

    @Override
    public List<String> getOpportunities(){
        List<String> opportunitiesNames = new ArrayList<>();
        List<SelenideElement> opportunityItems = $$(".opportunity-item_title");

        for (SelenideElement itemOpportunity : opportunityItems) {
            opportunitiesNames.add(itemOpportunity.getText());

        }
        return opportunitiesNames;

    }

    @Override
    public String goToCategory (String category){

        try {

            switch (category) {

                case "тестування":
                    categoryTesting.click();
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
                    throw new IllegalArgumentException("Invalid category " + category);
            }
            return category;
        }

        catch (Exception e){
            System.err.println("Invalid category " + e.getMessage());

            return  null;
        }
    }
}
