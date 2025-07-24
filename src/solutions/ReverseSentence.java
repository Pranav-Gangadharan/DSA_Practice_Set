package solutions;

import java.util.Scanner;

public class ReverseSentence {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String sentence = sc.nextLine();

    String[] arr = sentence.split(" ");

    StringBuilder sb = new StringBuilder();

    // Reverse each word individually and append
    for (String word : arr) {
      sb.append(new StringBuilder(word).reverse()).append(" ");
    }

    // Print the final string without trailing space
    System.out.println(sb.toString().trim());

    sc.close();
  }
}
