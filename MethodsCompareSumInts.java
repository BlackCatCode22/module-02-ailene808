public class MethodsCompareSumInts {
    public static void main(String[] args)

    {
                //Compare exercises
                //The below code is for the comparison of two integers

                int a = 5;  //Establishes a value of 5 for the integer of a
                int b = 10; //Establishes a value of 10 for the integer of b

                boolean comparison = a == b; //This establishes the boolean value for variable comparison asking if a equals b returning a true or false value

                System.out.println(comparison);

                System.out.println(Integer.compare(a, b)); // The compare() method compare 2 integer values and returns a value of zero if (a==b) if (a<b) value will be less than zero

                int c = 5; //Establishes a value of 10 for the integer of c
                int d = 5; //Establishes a value of 10 for the integer of d

                System.out.println(Integer.compare(c, d)); // This line prints the comparison of the 2 integer values of c and d

                //Sum exercises
                int e = 10;
                int f = 15;
                int g = 20;
                int sum = e + f + g;

                System.out.println(sum);

                  }
}