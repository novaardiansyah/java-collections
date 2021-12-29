package application;

import java.util.List;

import data.Person;

public class MutableApp {
  public static void main(String[] args) {
    System.out.println(""); // ? Newline

    Person person = new Person("John");
    person.addHobby("Java");
    person.addHobby("C++");
    doSomething(person.getHobbies());

    for (var hobby : person.getHobbies()) {
      System.out.println(hobby);
    }
  }

  public static void doSomething(List<String> hobbies) {
    /**
     * ! Mutable List
     * will be a problem when we return a list of methods
     * the list can be manipulated without the object
     * 
     */

    // hobbies.add("PHP");
  }
}
