import java.util.Scanner;

public class MinMaxString {

    static char minChar(String s) {
        char min = s.charAt(0);

        for (int i = 1; i < s.length(); i++)
            if (s.charAt(i) < min)
                min = s.charAt(i);

        return min;
    }

    static char maxChar(String s) {
        char max = s.charAt(0);

        for (int i = 1; i < s.length(); i++)
            if (s.charAt(i) > max)
                max = s.charAt(i);

        return max;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a string: ");
            String text = sc.nextLine();
            
            System.out.println("Smallest character: " + minChar(text));
            System.out.println("Greatest character: " + maxChar(text));
        }
    }
}
