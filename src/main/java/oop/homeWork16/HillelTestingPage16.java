package oop.homeWork16;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import java.util.ArrayList;
import java.util.List;

import static com.codeborne.selenide.Selenide.*;

public class HillelTestingPage16 extends HillelAbstractPage {
    private final ElementsCollection courses = $$x("//*[@id=\"categories\"]/div[2]/div/ul/li/div/div[1]/ul");
    private final SelenideElement courseItem = $("p.profession-bar_title");
    private final ElementsCollection additionalCourses =
            $$x("//*[@id=\"categories\"]/div[2]/div/ul/li/div/div[2]/ul");
    private final ElementsCollection categories = $$(".categories__list");
    private final SelenideElement categoryItem = $(".categories__list-item a");
    private final ElementsCollection opportunities = $$(".opportunities_list");
    private final SelenideElement opportunityItem = $(".opportunity-item_title");

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
    public String goToCategory(String category) {
        if (category.equals("тестування")){

            return "тестування";
        }
        return super.goToCategory(category);
    }
}
