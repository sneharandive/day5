package day5;

import java.util.Scanner;

public class UserTable {

	public static void main(String[] args) {

		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a number to print its table: ");
	        int number = scanner.nextInt();

	        System.out.println("Multiplication Table of " + number + ":");
	        for (int i = 1; i <= 10; i++) {
	            System.out.println(number + " x " + i + " = " + (number * i));
	        }
	    }

}
