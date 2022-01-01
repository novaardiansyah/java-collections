package application;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueApp {
  public static void main(String[] args) {
    System.out.println(""); // ? Newline

    Queue<String> arrayDQueue = new ArrayDeque<>(10);
    Queue<String> priorityQueue = new PriorityQueue<>();

    // ? Add elements to the queue
    arrayDQueue.add("A");
    arrayDQueue.add("C");
    arrayDQueue.add("B");

    priorityQueue.add("A");
    priorityQueue.add("C");
    priorityQueue.add("B");

    // ? Get all elements from the queue
    System.out.println("\nArrayDeque:");
    for (String next = arrayDQueue.poll(); next != null; next = arrayDQueue.poll()) {
      System.out.println(next);
    }

    System.out.println("\nPriority Queue:");
    for (String next = priorityQueue.poll(); next != null; next = priorityQueue.poll()) {
      System.out.println(next);
    }

    // ? Get size of the queue
    System.out.println("\nSize of the queue: " + priorityQueue.size());
  }
}