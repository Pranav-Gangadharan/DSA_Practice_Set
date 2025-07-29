package solutions;

import java.util.Scanner;

public class LetterOccurrence {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String s = sc.nextLine();
    System.out.print("Enter letter to get count: ");
    char letter = sc.next().charAt(0);
    char[] ch = s.toCharArray();

    byte count = 0;

    for(char c : ch){
      if(c == letter){
        count++;
      }
    }
    System.out.println("Count of " + letter + " is " + count);
  }
}
