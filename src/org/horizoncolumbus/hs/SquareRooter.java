package org.horizoncolumbus.hs;
import java.util.*;
import static java.lang.Math.sqrt;

public class SquareRooter {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        int numbers[] = new int[5];

        for(int i = 0; i < 5; i++){
            System.out.printf("Enter number %s: ", i + 1);
            numbers[i] = input.nextInt();
        }
    for(int number : numbers){
        int squarerootNumber = number;
        System.out.println("Square roots of your numbers are: " + sqrt(squarerootNumber));
    }
    }
}
