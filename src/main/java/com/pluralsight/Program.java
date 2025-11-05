package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Person> people = getPeople();
//        getAverageAge(people);
//        printPeople(people);
        System.out.println(getAges(people));
        System.out.println(getPeopleByLastName(people, "Ryan"));
        System.out.println(getAverageAge(people));

    }

    private static List<Integer> getAges(List<Person> people) {
        List<Integer> ages = new ArrayList<>();
        for (Person person : people) {
            ages.add(person.getAge());
        }
        return ages;
    }

    private static double getAverageAge(List<Person> people) {
        // Step 1: Get the total of all ages using reduce
        int totalAge = people.stream()
                .map(Person::getAge)          // turn each Person into their age
                .reduce(0, (sum, age) -> sum + age); // add up all ages

        // Step 2: Divide by number of people to get the average
        if (people.isEmpty()) {
            return 0;  // avoid dividing by zero
        }
        return (double) totalAge / people.size();

        //the old way
        //        int totalAge = 0;
////        for (Person person : people) {
////            // totalAge = totalAge + person.getAge();
////            totalAge += person.getAge();
////        }
////        double averageAge = (double) totalAge / people.size();
//        return averageAge;

    }


    private static void printPeople(List<Person> people) {
        people.stream()
                .forEach(System.out::println);

        //        for (Person person : people) {
//            System.out.println(person);
//        }
    }

    private static List<Person> getPeopleByLastName(List<Person> people, String lastName) {
        List<Person> matchingPeople = new ArrayList<>();
        people.stream().filter(person -> person.getLastName().equals(lastName)).forEach(System.out::println);
//        for (Person person : people) {
//            if (person.getLastName().equals(lastName)) {
//                matchingPeople.add(person);
//            }
//        }
        return matchingPeople;
    }


    private static List<Person> getPeople() {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Matt", "Ryan", 40));
        people.add(new Person("Jalon", "walker", 21));
        people.add(new Person("Deangelo", "Hall", 40));
        people.add(new Person("Julio", "Jones", 40));
        people.add(new Person("Mike", "Vick", 25));
        people.add(new Person("Divine", "Deablo", 25));
        people.add(new Person("Bijan", "Robison", 22));
        people.add(new Person("Mike", "Penix", 22));
        people.add(new Person("Tyler", "Algier", 40));
        people.add(new Person("Bobby", "Ryan", 40));
        return people;
    }

}
