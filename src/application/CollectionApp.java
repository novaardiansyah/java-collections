package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class CollectionApp {
  public static void main(String[] args) {
    System.out.println(""); // ? Newline

    Collection<String> names = new ArrayList<>();

    // ? Add elements
    names.add("Jonh");
    names.addAll(Arrays.asList("Eko", "Kurniawan", "Rizki", "Rizal"));

    // ? Remove elements
    names.remove("Eko");
    names.removeAll(Arrays.asList("Rizal", "Rizki"));

    // ? Check if element is in the collection
    System.out.println("Eko is in the collection: " + names.contains("Eko"));

    // ? Loop through elements
    for (var name : names) {
      System.out.println(name);
    }
  }
}
