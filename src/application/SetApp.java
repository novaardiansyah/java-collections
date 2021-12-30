package application;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetApp {
  public static void main(String[] args) {
    System.out.println(""); // ? Newline

    /**
     * ! HashSet :
     * is a collection that contains no duplicate elements.
     * but the data in it is not sorted
     */
    // Set<String> names = new HashSet<>();

    /**
     * ! LinkedHashSet :
     * is a collection that contains no duplicate elements.
     * but the data in it is sorted
     */
    Set<String> names = new LinkedHashSet<>();

    names.add("John");
    names.add("Mary");
    names.add("John"); // ? duplicate will be ignored
    names.add("Linda");

    for (var name : names) {
      System.out.println(name);
    }
  }
}
