package solutions;

import java.util.Scanner;

public class EncodingNames {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String productName = sc.nextLine();
    char[] vowels = {'a','e','i','o','u','A','E','I','O','U'};
    char[] product = productName.toCharArray();
    char[] enc = new char[product.length];



    for (int i = 0; i < product.length; i++) {
      boolean isVowel = false;
      for(char v : vowels){
       if(product[i] == v){
         isVowel=true;
         break;
       }
      }
      if(isVowel){
        enc[i] = '*';
      }else{
        enc[i]= product[i];
      }
    }

    String encodedProduct = new String(enc);
    System.out.println(encodedProduct);

  }
}
