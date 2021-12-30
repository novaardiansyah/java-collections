package application;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ImmutableSetApp {
  public static void main(String[] args) {
    System.out.println(""); // ? Newline

    Set<String> emptySet = Collections.emptySet();
    System.out.println("emptySet: " + emptySet);

    Set<String> singletonSet = Collections.singleton("Singleton");
    System.out.println("singletonSet: " + singletonSet);

    Set<String> mutable = new HashSet<>();
    mutable.add("Mutable");

    Set<String> immutable = Collections.unmodifiableSet(mutable);
    System.out.println("Immutable Set: " + immutable);

    Set<String> set = Set.of("John", "Jane", "Jack");
    System.out.println(set);

    // ! Error: immutable set cannot be modified
    // set.add("Leonard");
    // set.remove("Jane");
  }
}
