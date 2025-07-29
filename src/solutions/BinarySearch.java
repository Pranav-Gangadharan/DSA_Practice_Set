package solutions;

import java.util.Scanner;

public class BinarySearch {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] a = {10,20,22,37,273,25,55,96,78,564,36,54,43,12};

    System.out.println("Enter Key to find");
    int key = sc.nextInt();

    int left = 0;
    int right = a.length -1;


    while(left<=right) {
      int mid = left+ (right-left) /2;
      if (key == a[mid]) {
        System.out.println("key found!");
        return;
      } else if (key < a[mid]) {
        left = mid + 1;
      } else if (key > a[mid]) {
        right = mid - 1;
      }
    }
      System.out.println("Key not found");


  }
}
