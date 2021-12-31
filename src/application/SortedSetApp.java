package application;

import java.util.SortedSet;
import java.util.TreeSet;

import data.Person;
import data.PersonComparator;

public class SortedSetApp {
  public static void main(String[] args) {
    System.out.println(""); // ? Newline

    SortedSet<Person> people = new TreeSet<>(new PersonComparator());
    people.add(new Person("John"));
    people.add(new Person("Jane"));
    people.add(new Person("Jack"));

    for (Person person : people) {
      System.out.println(person.getName());
    }

  }
}
