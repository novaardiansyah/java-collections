package application;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListApp {
  public static void main(String[] args) {
    System.out.println(""); // ? Newline

    List<String> strings = new ArrayList<>();
    List<Integer> integers = new LinkedList<>();

    strings.addAll(List.of("John", "Jane", "Joe"));
    integers.addAll(List.of(1, 2, 3));

    strings.remove(0);
    integers.remove(1);

    System.out.println("Strings: " + strings);
    System.out.println("Integers: " + integers);
  }
}