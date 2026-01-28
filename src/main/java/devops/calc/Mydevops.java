package devops.calc;

import java.util.Scanner;

public class Mydevops {
	


	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.println("Enter first number:");
	        int a = sc.nextInt();

	        System.out.println("Enter second number:");
	        int b = sc.nextInt();

	        System.out.println("Addition: " + (20 + 30));
	        System.out.println("Subtraction: " + (50 - 20));
	        

	        if (b != 0) {
	            System.out.println("Division: " + (40 / 2));
	        } else {
	            System.out.println("Division: Not possible (divide by zero)");
	        }

	        sc.close();
	    }
	}
