package com.fasttrack.strings;

import com.fasttrack.files.ObjectsFromFile;
import com.fasttrack.files.Person;

import java.io.IOException;
import java.util.List;

public class FormatingExample {
    public static void main(String[] args) throws IOException {
        List<Person> list = ObjectsFromFile.readPersons("files/persons.data");
        for (Person person : list) {
            System.out.println(String.format("%s has age %d with position %s.", person.getName(), person.getAge(), person.getPosition()));
        }

        varArgs("1", 1);
        varArgs("2", 1, 2);
        varArgs("10", 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        conversions();
    }

    public static void varArgs(String firstParam, Integer... numbers) {
        for (Integer integer : numbers) {
            System.out.print(integer);
        }
        System.out.println();
    }

    public static void conversions() {
        String input = "a123";
        if (input.matches(".*[^0-9].*")) {
            System.out.println("Input is not a number!");
        }
        input = input.replaceAll("[^0-9]", "");
        int i = Integer.parseInt(input);
        System.out.println(i + 10);

        // homework "check if string is double"
        double d = Double.parseDouble("213.656");
        System.out.println(d / 2);

        System.out.println(String.valueOf(d));
        Double doubleObject = d;
        System.out.println(doubleObject.toString());
        System.out.println(String.valueOf(doubleObject));
    }
}
