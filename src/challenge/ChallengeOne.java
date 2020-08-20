package challenge;

public class ChallengeOne {
    public static String reverseCharacters(String input) {
        String[] sentence = input.split("\\s");
        String reverseString = "";
        for (String word : sentence) {
            StringBuilder string = new StringBuilder(word);
            string.reverse();
            reverseString = reverseString + string.toString() + " ";
        }
        return reverseString.trim();
    }

    public static void main(String[] args) {
        System.out.println((reverseCharacters("the cat is fat")).equals("eht tac si taf"));
        System.out.println((reverseCharacters("band camp is great!")).equals("dnab pmac si !taerg"));
    }
}
