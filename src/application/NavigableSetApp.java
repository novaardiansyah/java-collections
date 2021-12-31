package application;

import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class NavigableSetApp {
  public static void main(String[] args) {
    System.out.println("\nMutable NavigableSet :\n");

    NavigableSet<String> names = new TreeSet<>();
    names.addAll(Set.of("John", "Jane", "Jack", "Jill", "Jim"));

    for (String name : names) {
      System.out.println(name);
    }

    // ? retrieve data from first to "Jill"
    System.out.println("\nRetrieve data from first to \"Jill\" :\n");

    NavigableSet<String> firstJill = names.headSet("Jill", true);

    for (String name : firstJill) {
      System.out.println(name);
    }

    // ? convert mutable data to immutable
    System.out.println("\nImmutable NavigableSet :\n");

    NavigableSet<String> namesImmutable = names.descendingSet();

    for (String name : namesImmutable) {
      System.out.println(name);
    }
  }
}
