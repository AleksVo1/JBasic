package oop.homeWork17;

import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UserMain {
    public static void main(String[] args) {

        Stream.generate(RandomUserGenerator::generateRandomUser)
            .limit(20)
            .filter(user -> user.getAge() > 18)
            .sorted(Comparator.comparing(User::getName))
            .filter(user -> user.getEmail() != null)
            .collect(Collectors.groupingBy(User::getGender, Collectors.mapping(User::getName, Collectors.toSet())))
            .forEach((gender, names) -> System.out.println(gender + names));

    }
}
