package collection;

import java.util.Iterator;
import java.util.List;

public class IterableApp {
  public static void main(String[] args) {
    System.out.println(""); // ? Newline

    /**
     * ! Iterable :
     * can automatically be looped with an iterator
     */
    Iterable<String> names = List.of("John", "Jane", "Mary");

    for (var name : names) {
      System.out.println(name);
    }

    /**
     * ! Iterator :
     * can be used to loop through an iterable
     */

    Iterator<String> iterator = names.iterator();
    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }
  }
}
