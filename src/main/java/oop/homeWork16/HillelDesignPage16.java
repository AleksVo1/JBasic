package oop.homeWork16;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static com.codeborne.selenide.Selenide.*;

public class HillelDesignPage16 extends HillelAbstractPage{
    private final ElementsCollection courses = $$x("//*[@id=\"categories\"]/div[2]/div/ul/li/div/div/ul");
    private final SelenideElement courseItem = $("p.profession-bar_title");
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
    public List<String> getAdditionalCourses() {
        return Collections.emptyList();
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
        if (category.equals("дизайн")){

            return "дизайн";
        }
        return super.goToCategory(category);
    }
}
