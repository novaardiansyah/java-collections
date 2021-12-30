package application;

import java.util.EnumSet;
import java.util.Set;

public class EnumSetApp {
  public static enum Gender {
    MALE, FEMALE, NOT_MENTION;
  }

  public static void main(String[] args) {
    System.out.println(""); // ? Newline

    // Set<Gender> genders = EnumSet.allOf(Gender.class);
    Set<Gender> genders = EnumSet.of(Gender.FEMALE, Gender.MALE, Gender.FEMALE); // ? duplicate will be ignored

    for (var gender : genders) {
      System.out.println(gender);
    }

    Gender[] genders2 = Gender.values();

    for (var gender : genders2) {
      System.out.println(gender);
    }
  }
}
