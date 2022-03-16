import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.*;
import java.util.*;


class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    //declaration and intialization
    
    //int[] nArray = new int[9]; 
    
    int[] nArray = { 1, 3, 0, 6, 9, 2, 5, 4, 4};
    int[] zArray = new int[9];
    int[] yArray = { 1, 2, 1, 2, 1, 2, 1, 2, 1};
    final int size = 9;
    int num = 0;
    int sum = 0;
    int[] copArray = new int[9];
    
    // For reading  the element
    /*   < - commentted out for test case
    for (int i = 0; i < size; i++) {
      nArray[i] = input.nextInt();
    }
    */

    // For adding arrays
    
    for (int i = 0; i < size; i++) {
      int s = 0, digit, n = 0;

      if (nArray[i] * yArray[i] > 9) {
        n = nArray[i] * yArray[i];
  
        while(n != 0) {
          digit = n % 10;
          s = s + digit;
          n = n/10;
        }
        
        zArray[i] = n;

      } else {
        zArray[i] = nArray[i] * yArray[i];
      }
    
    }

    num = nArray[0];

    switch(num) {
        //Case statements
      case 8: System.out.println("SIN not Valid");
        System.exit(0); //to Terminate a Java Program
        break;
      case 0: System.out.println("SIN not Valid");
        System.exit(0); //to Terminate a Java Program
        break;
    }
    
    //sum of elements in array
  
    for (int i : zArray)
      sum += i;
    // print test
    System.out.println(" The sum is " + sum);
    System.out.println(zArray[3]);
    
    
    
    //SIN verification if sum % 10 == 0

    if (sum % 10 == 0) {
      System.out.println("True");
    } else {
      System.out.println("False");
    }
  }
}