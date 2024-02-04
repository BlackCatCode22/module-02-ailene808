public class MethodsCompareSumInts {
    public static void main(String[] args)

    {
                //The below code is for the comparison of two integers
                int a = 5;  //Establishes a value of 5 for the integer of a
                int b = 10; //Establishes a value of 10 for the integer of b

                System.out.println(Integer.compare(a, b)); // The compare() method compare 2 integer values and returns a value of zero if (a==b) if (a<b) value will be less than zero

                int c = 5; //Establishes a value of 10 for the integer of c
                int d = 5; //Establishes a value of 10 for the integer of d

                System.out.println(Integer.compare(c, d)); // This line prints the comparison of the 2 integer values of c and d

                int e = 10;
                int f = 15;
                int g = 20;
                int sum = e + f + g;

                System.out.println(sum);

                  }
}