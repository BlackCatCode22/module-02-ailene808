public class ReversedString {
    public static void main(String[] args) {

        // This line creates a string phrase
        String phrase = "This class is fun but hard at the same time. I like the professor's music in his videos.";

        // This line prints the above phrase
        System.out.println(phrase);

        // This line establishes a value for the variable result
        String result = "";

        // This creates a for loop establishing a value for i as the entire length of the phrase above and using an index of the phrase above starting with 0
        for(int i = phrase.length()-1; i>=0; i--)
            result+=phrase.charAt(i);

        // This line prints the result
        System.out.println(result);

    }
}