package application;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImmutableApp {
  public static void main(String[] args) {
    System.out.println(""); // ? Newline

    List<String> one = Collections.singletonList("one");
    List<String> empty = Collections.emptyList();
    System.out.println("one: " + one);
    System.out.println("empty: " + empty);

    List<String> mutable = new ArrayList<>();
    mutable.add("one");
    List<String> immutable = Collections.unmodifiableList(mutable);
    System.out.println(immutable);

    List<String> elements = List.of("one", "two", "three");
    System.out.println(elements);
  }
}
