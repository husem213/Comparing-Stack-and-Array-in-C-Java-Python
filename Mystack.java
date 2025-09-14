import java.util.Scanner;
import java.util.Stack;

public class StringReverser {
    
    public static String readString() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word or sentence: ");
        String input = scanner.nextLine();
        return input;
    }
    
    public static Stack<Character> pushLettersToStack(String input) {
        Stack<Character> stack = new Stack<>();
        for (char c : input.toCharArray()) {
            stack.push(c);
        }
        return stack;
    }
    
    public static Stack<Character> reverseStack(Stack<Character> s) {
        Stack<Character> reversed = new Stack<>();
        while (!s.isEmpty()) {
            reversed.push(s.pop());
        }
        return reversed;
    }
    
    public static String stackToString(Stack<Character> s) {
        StringBuilder result = new StringBuilder();
        while (!s.isEmpty()) {
            result.append(s.pop());
        }
        return result.toString();
    }
    
    public static void main(String[] args) {
        String input = readString();
        Stack<Character> stInput = pushLettersToStack(input);
        String reversed = stackToString(reverseStack(stInput));
        System.out.println("Reversed: " + reversed);
    }
}