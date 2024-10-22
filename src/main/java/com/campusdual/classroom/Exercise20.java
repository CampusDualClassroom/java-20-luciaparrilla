package com.campusdual.classroom;

import java.util.ArrayList;
import java.util.List;

public class Exercise20 {

    public static List<Person> getPeopleList() {
        List<Person> people = new ArrayList<>();
        people.add(new Person ("John", "Smith"));
        people.add(new Teacher("María", "Montessori", "Educación"));
        people.add(new PoliceOfficer("Jake", "Peralta", "B-99"));
        people.add(new Doctor("Gregory", "House", "Nefrología e infectología"));
        return people;
    }

    public static void showPeopleDetails(List<Person> stringList) {
        if (stringList == null || stringList.isEmpty()) {
            System.out.println("There's no one to show.");
        } else {
            for (Person person : stringList) {
                person.getDetails();
            }
        }
    }

    public static void main(String[] args) {
        List<Person> stringList = getPeopleList();
        showPeopleDetails(stringList);
    }
}
