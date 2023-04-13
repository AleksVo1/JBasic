package oop.homeWork16;

import com.codeborne.selenide.SelenideElement;

import java.util.List;

import static com.codeborne.selenide.Selenide.$x;

public abstract class HillelAbstractPage {

    public abstract List<String> getCourses();

    public abstract List<String> getAdditionalCourses();


    public abstract List<String> getOpportunities();

    private final SelenideElement categoryProgramming = $x("//*[@id=\"categories\"]/div/ul/li[1]/a");
    private final SelenideElement categoryTesting = $x("//*[@id=\"categories\"]/div/ul/li[2]/a");
    private final SelenideElement categoryManagement = $x("//*[@id=\"categories\"]/div/ul/li[3]/a");
    private final SelenideElement categoryMarketing = $x("//*[@id=\"categories\"]/div/ul/li[4]/a");
    private final SelenideElement categoryDesign = $x("//*[@id=\"categories\"]/div/ul/li[5]/a");
    private final SelenideElement categoryKids = $x("//*[@id=\"categories\"]/div/ul/li[6]/a");



    public String goToCategory (String category){
        try {
            switch (category) {

                case "програмування":
                    categoryProgramming.click();
                    break;

                case "менеджмент":
                    categoryManagement.click();
                    break;

                case "маркетинг":
                    categoryMarketing.click();
                    break;

                case "тестування":
                    categoryTesting.click();
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
        catch (Exception e) {
            System.err.println("Error " + e.getMessage());

            return null;
        }
    }

}
