import java.util.Scanner;

public class MixedStringsArray {

    static String swapWords(String sentence) {

        String[] words = sentence.split(" "); // array of words

        for (int i = 0; i < words.length; i++) {

            String w = words[i];

            if (w.length() > 1) {
                char[] chars = w.toCharArray(); // word → char array

                // swap first and last
                char temp = chars[0];
                chars[0] = chars[chars.length - 1];
                chars[chars.length - 1] = temp;

                words[i] = new String(chars);
            }
        }

        return String.join(" ", words);
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter sentence: ");
            String text = sc.nextLine();
            
            System.out.println("Output: " + swapWords(text));
        }
    }
}
