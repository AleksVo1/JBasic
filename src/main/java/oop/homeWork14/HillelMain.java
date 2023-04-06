package oop.homeWork14;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class HillelMain {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverManager.chromedriver().create();
            driver.manage().window().maximize();

                driver.get(HillelConfigProvider.BASE_URL);

                    Thread.sleep(5000);

        HillelHomePage hillelHomePage = PageFactory.initElements(driver, HillelHomePage.class);
            hillelHomePage.ClickToProgramming();

                Thread.sleep(5000);

        HillelProgrammingPage hillelProgrammingPage = PageFactory.initElements(driver, HillelProgrammingPage.class);
            hillelProgrammingPage.ClickToFrontEndBasic();

                Thread.sleep(3000);

        HillelFrontEndBasicPage hillelFrontEndBasicPage = PageFactory.initElements(driver,
                HillelFrontEndBasicPage.class);

                Thread.sleep(3000);

        JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0, 2500)");

            Thread.sleep(8000);

        hillelFrontEndBasicPage.clickShowAll();
            Thread.sleep(3000);

            js.executeScript("window.scrollBy(0, 4000)");
            Thread.sleep(3000);

        System.out.println("Список викладачів курсу:");

        System.out.println(hillelFrontEndBasicPage.getListCoaches());

        driver.quit();
    }
}
