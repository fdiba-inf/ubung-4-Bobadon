package exercise4;

import java.util.Scanner;

public class MinIndex {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("How many numbers are you going to enter?");
    int size = input.nextInt();
    double[] numbers = new double[size];
    System.out.println("Enter those numbers: ");
    for (int index = 0; index < numbers.length; index++) {
      numbers[index] = input.nextDouble();
    }
    int min = 0;
    for (int index = 1; index < numbers.length; index++) {
        if (numbers[index] < numbers[min]) {
          min = index;
          }
    }
    System.out.println("Min index: " + min);
  }
}  