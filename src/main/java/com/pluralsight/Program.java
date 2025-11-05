package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Matt","Ryan",40));
        people.add(new Person("Jalon","walker",21));
        people.add(new Person("Deangelo","Hall",40));
        people.add(new Person("Julio","Jones",40));
        people.add(new Person("Mike","Vick",25));
        people.add(new Person("Divine","Deablo",25));
        people.add(new Person("Bijan","Robison",22));
        people.add(new Person("Mike","Penix",22));
        people.add(new Person("Tyler","Algier",40));
        people.add(new Person("Bobby","Ryan",40));

        for (Person person:people)
        {
            System.out.println(person);
        }


    }

}
