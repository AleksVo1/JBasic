package oop.homeWork17;

import java.util.Random;

public class RandomUserGenerator {

    public static User generateRandomUser() {
        String name = randomName();
        int age = randomAge();
        String email = randomEmail(name);
        String gender = isMale(name) ? "male" : "female";

            return new User(name, age, email, gender);
    }

    public static String randomName() {

        String[] names = {"Mike", "John", "Henry", "Neal", "Bob", "Charlie", "David", "Frank", "Josh",
                "Ben", "Bennet", "Jack", "Alice", "Noy", "Emily", "Grace", "Isabella", "Marta", "Justine", "Olivia",
                "Monica", "Olga", "Masha", "Miki"};

            return names[new Random().nextInt(names.length)];

    }

    public static int randomAge() {

        return new Random().nextInt(100);
    }

    public static String randomEmail(String name) {
        String[] emails = {"@gmail.com", "@outlook.com", "@hotmail.com", "@yahoo.com"};

        return name + emails[new Random().nextInt(emails.length)];
    }

    public static boolean isMale(String name) {
        switch (name) {
            case "Mike":
            case "John":
            case "Henry":
            case "Neal":
            case "Bob":
            case "Charlie":
            case "David":
            case "Frank":
            case "Josh":
            case "Ben":
            case "Bennet":
            case "Jack":
                return true;
            default:
                return false;
        }
    }
}