public class ReversedString {
    public static void main(String[] args) {

        String phrase = "This class is fun but hard at the same time. I like the professor's music in his videos.";
        String result = "";
        for(int i = phrase.length()-1; i>=0; i--)
            result+=phrase.charAt(i);
        System.out.println(result);

    }
}