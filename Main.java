import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.*;
import java.util.*;


class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    //declaration and intialization
    
    int[] nArray = new int[9]; 
    
    //int[] nArray = { 1, 3, 0, 6, 9, 2, 5, 4, 4}; // intial test case
    int[] zArray = new int[9];
    int[] yArray = { 1, 2, 1, 2, 1, 2, 1, 2, 1};
    final int size = 9;
    int num = 0;
    int sum = 0;
    
    // For reading  the element
    for (int i = 0; i < size; i++) {
      nArray[i] = input.nextInt();
    }
    

    // For loop adds the two arrays by transversing through the loop.
    
    for (int i = 0; i < size; i++) {
      int s = 0, digit = 0, n = 0;

      // if the sum we get is a 2 digit we add the digits together
      if (nArray[i] * yArray[i] > 9) {
        zArray[i] = nArray[i] * yArray[i];
        
        n = zArray[i];
        //the while loop iterates till the sum of the digit is derived
        while(n != 0) {
          digit = n % 10;
          s = s + digit;
          n = n/10;
        }
        
        zArray[i] = s;
      
        System.out.println(s); //print out test, 
        //to test if we are getting the correct digit from the while loop above

      } else {
        zArray[i] = nArray[i] * yArray[i]; 
      }
    
    }

    /* Method to test the validitiy of thee sin */
    num = nArray[0];

    //The first digit of a SIN is 8 or 0, which indicates 
    //that it is not a canadaian province of registration.
    //The program will terminate after printing the "SIN not Valid"
    switch(num) {
        //Case statements
      case 8: System.out.println("SIN not Valid");
        System.exit(0); //to Terminate a Java Program
        break;
      case 0: System.out.println("SIN not Valid");
        System.exit(0); //to Terminate a Java Program
        break;
      case 9: System.out.println("Immigrants & other temp SIN's");
        break;
    }

    /* Method to sum of elements in array*/
    for (int i : zArray)
      sum += i;
    // print test
    System.out.println(" The sum is " + sum);
    System.out.println(zArray[3]);
    
    
    /* Method for SIN verification if sum % 10 == 0 */
    if (sum % 10 == 0) {
      System.out.println("True");
    } else {
      System.out.println("False");
    }
  }
}