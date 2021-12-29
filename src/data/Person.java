package data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Person {
  private String name;
  private List<String> hobbies;

  public Person(String name) {
    this.name = name;
    this.hobbies = new ArrayList<>();
  }

  public void addHobby(String hobby) {
    hobbies.add(hobby);
  }

  public List<String> getHobbies() {
    /**
     * ! Mutable List
     * will be a problem because it can be manipulated without objects
     */

    // return hobbies;

    /**
     * ! Immutable List
     * we will convert mutable list to immutable list
     * to avoid list manipulation without object
     */

    return Collections.unmodifiableList(hobbies);
  }

  public String getName() {
    return this.name;
  }
}
