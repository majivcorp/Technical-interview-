import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.*;
import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    //declaration and intialization
    
    //int[] nArray = new int[9]; 
    
    int[] nArray = { 5, 8, 3, 3, 9, 9, 8, 3, 7};
    int[] zArray = new int[9];
    int[] yArray = { 1, 2, 1, 2, 1, 2, 1, 2, 1};
    final int size = 9;
    int num = 0;
    int sum = 0;
    
    // For reading  the element
    /*   < - commentted out for test case
    for (int i = 0; i < size; i++) {
      nArray[i] = input.nextInt();
    }
    */

    // For adding arrays
    for (int i = 0; i < size; i++) {

      if (nArray[i] * yArray[i] > 9) {
        zArray[i] = nArray[i] + yArray[i];
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
    
    
    
    //SIN verification if sum % 10 == 0

    if (sum % 10 == 0) {
      System.out.println("SIN is Valid");
    } else {
      System.out.println("SIN is not Valid");
    }
  }
}