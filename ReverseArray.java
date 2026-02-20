import java.util.Scanner;

public class ReverseArray {

    static String reverse(String s) {

        char[] arr = s.toCharArray(); // string → array

        int start = 0;
        int end = arr.length - 1;

        // reverse array
        while (start < end) {
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        return new String(arr);
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter string: ");
            String text = sc.nextLine();
            
            System.out.println("Reversed: " + reverse(text));
        }
    }
}
