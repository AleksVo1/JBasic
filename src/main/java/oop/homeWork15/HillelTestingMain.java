package oop.homeWork15;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class HillelTestingMain {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverManager.chromedriver().create();

        driver.manage().window().maximize();

        driver.get(HillelTestingPageConfigProvider.TESTING_URL);

        Thread.sleep(0, 3000);

        HillelTestingPage hillelTestingPage = PageFactory.initElements(driver, HillelTestingPage.class);

            System.out.println("Список курсів: " + hillelTestingPage.getCourses());

            System.out.println("Список додаткових курсів: " + hillelTestingPage.getAdditionalCourses());

            System.out.println(hillelTestingPage.getOpportunities());

            hillelTestingPage.goToCategory("програмування");
            hillelTestingPage.goToCategory("менеджмент");
            hillelTestingPage.goToCategory("маркетинг");
            hillelTestingPage.goToCategory("дизайн");
            hillelTestingPage.goToCategory("дитячі курси");

    }
}
