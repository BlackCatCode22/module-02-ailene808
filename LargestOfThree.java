import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Establishes the value for the integers number 1-3
        int number1;
        int number2;
        int number3;
        int largest;

        //Prints asking user for  first integer
        System.out.print("Enter First Integer: ");
        number1 = input.nextInt();

        //Prints asking user for second integer
        System.out.print("Enter Second Integer: ");
        number2 = input.nextInt();

        ////Prints asking user for third integer
        System.out.print("Enter Third Integer: ");
        number3 = input.nextInt();

        //Using If statements where largest will be determined
        largest = number1;

        if(number2 > largest)
            largest = number2;

        if(number3 > largest)
            largest = number3;

        //prints the largest of the 3 integers to the user
        System.out.println("Largest of three integers is " + largest + "");


    }
}