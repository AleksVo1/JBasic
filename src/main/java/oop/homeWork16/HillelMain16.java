package oop.homeWork16;

import com.codeborne.selenide.Configuration;
import oop.homeWork14.ConfigProvider;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;

public class HillelMain16 {

    public static void main(String[] args) {

        Configuration.baseUrl = ConfigProvider.DESIGN_URL;
            open("/");

        HillelDesignPage16 hillelDesignPage16 = new HillelDesignPage16();

            hillelDesignPage16.goToCategory("програмування");
            hillelDesignPage16.goToCategory("тестування");
            hillelDesignPage16.goToCategory("менеджмент");
            hillelDesignPage16.goToCategory("маркетинг");
            hillelDesignPage16.goToCategory("дитячі курси");

        open("/");

            hillelDesignPage16.getCourses();
            hillelDesignPage16.getOpportunities();

                System.out.println("Список курсів: " + hillelDesignPage16.getCourses());

                System.out.println(hillelDesignPage16.getOpportunities());

        closeWebDriver();

//        Configuration.baseUrl = ConfigProvider.TESTING_URL;
//            open("/");
//
//        HillelTestingPage16 hillelTestingPage16 = new HillelTestingPage16();
//
//            hillelTestingPage16.goToCategory("програмування");
//            hillelTestingPage16.goToCategory("менеджмент");
//            hillelTestingPage16.goToCategory("маркетинг");
//            hillelTestingPage16.goToCategory("дизайн");
//            hillelTestingPage16.goToCategory("дитячі курси");
//
//        open("/");
//
//            hillelTestingPage16.getCourses();
//            hillelTestingPage16.getAdditionalCourses();
//            hillelTestingPage16.getOpportunities();
//
//
//                System.out.println("Список курсів: " + hillelTestingPage16.getCourses());
//
//                System.out.println("Список додаткових курсів: " + hillelTestingPage16.getAdditionalCourses());
//
//                System.out.println(hillelTestingPage16.getOpportunities());
//
//        closeWebDriver();
//
//        Configuration.baseUrl = ConfigProvider.PROGRAMMING_URL;
//            open("/");
//
//        HillelProgrammingPage16 hillelProgrammingPage16 = new HillelProgrammingPage16();
//
//            hillelProgrammingPage16.goToCategory("тестування");
//            hillelProgrammingPage16.goToCategory("менеджмент");
//            hillelProgrammingPage16.goToCategory("маркетинг");
//            hillelProgrammingPage16.goToCategory("дизайн");
//            hillelProgrammingPage16.goToCategory("дитячі курси");
//
//        open("/");
//
//            hillelProgrammingPage16.getCourses();
//            hillelProgrammingPage16.getAdditionalCourses();
//            hillelProgrammingPage16.getOpportunities();
//
//
//                System.out.println("Список курсів: " + hillelProgrammingPage16.getCourses());
//
//                System.out.println("Список додаткових курсів: " + hillelProgrammingPage16.getAdditionalCourses());
//
//                System.out.println(hillelProgrammingPage16.getOpportunities());
//
//
//        closeWebDriver();
    }
}
