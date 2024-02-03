import java.util.Scanner; // This using the Scanner package

public class MethodsMadness {
    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);  // Creating a Scanner object

        System.out.println("Enter age"); //Asking user for age

        int age = myObj.nextInt(); //user input of numerical value of age

        System.out.println("User's Age is: " + age);  // Output user input
    }
}



