package solutions;

import java.util.Scanner;

public class CountingWords {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String sentence = sc.nextLine();

    String[] words = sentence.split(" ");

    int wordCount = words.length;
    System.out.println("Word Count: " + wordCount);
  }
}
