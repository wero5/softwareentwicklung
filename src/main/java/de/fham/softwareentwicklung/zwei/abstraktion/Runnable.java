package de.fham.softwareentwicklung.zwei.abstraktion;

import java.time.LocalDate;

public class Runnable {

    public static void main(String[] args) {

        Person person = new Programmierer("Chris", LocalDate.of(1989, 9, 20));

        System.out.println("Name: " + person.getName());
        System.out.println("Birthday: " + person.getBirthday());

        person = new Dozent("Max", person.getBirthday());
        System.out.println(person.getName());
        if (person instanceof Programmierer) {
            Programmierer programmierer = ((Programmierer) person);
            System.out.println("Written LoC:" + programmierer.getLinesOfCode());
        }

        if (person instanceof Dozent) {
            for (String lecture : ((Dozent) person).getLectures()) {
                System.out.println("Lectures: " + lecture);
            }
        }
    }
}
