package exercise4;

import java.util.Arrays;
import java.util.Scanner;

public class MaxElement {

 public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many numbers are you going to enter?");
        int aSize = input.nextInt();
        double[] numbers = new double[aSize];
        System.out.println("Enter those numbers: ");
        double max = numbers[0];
        for (int index = 0; index < numbers.length; index++) {
            numbers[index] = input.nextDouble();
            if (numbers[index] > max) {
              max = numbers[index];
            }
        }
            System.out.println("Max number: " + max);
        }   
    
  }

