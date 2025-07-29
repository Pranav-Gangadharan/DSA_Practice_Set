package solutions;

import java.util.Scanner;

public class RemoveDuplicates {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String s1 = sc.nextLine();
    String s2 = " ";

    for (int i = 0; i < s1.length(); i++) {
        char ch = s1.charAt(i);
        if(!s2.contains(ch + "")) {
          s2 += ch;
        }
      }

    System.out.print("Removed Duplicates : " + s2);
  }
}
