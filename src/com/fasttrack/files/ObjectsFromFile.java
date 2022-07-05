package com.fasttrack.files;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class ObjectsFromFile {

    public static void main(String[] args) throws IOException {
        List<Person> list = readPersons("files/persons.data");

        writeReport(list);
    }

    private static void writeReport(List<Person> persons) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("files/report.data"));
        for (Person person : persons) {
            writer.write(personToLine(person));
            writer.newLine();
        }
        writer.flush();
    }

    private static String personToLine(Person person) {
        return person.getName() + " has age " + person.getAge() + " with position " + person.getPosition() + ".";
    }

    public static List<Person> readPersons(String filePath) throws IOException {
        List<Person> list = new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            list.add(fromLine(line));
        }
        return list;
    }

    private static Person fromLine(String line) {
        String[] tokens = line.split(Pattern.quote("|"));

        return new Person(tokens[0], Integer.parseInt(tokens[1]), tokens[2]);
    }
}
