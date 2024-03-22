import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        for(int i=0; i<T; i++) {
            System.out.println(solve(scanner.next()));
        }

        scanner.close();
    }

    public static String solve(String str){
        Stack<Character> stack= new Stack<>();
        for(int i=0; i<str.length(); i++) {
            char c = str.charAt(i);
            if (c == '(') {
                stack.push(c);
            }
            else if (stack.empty()) {
                return "NO";
            }
            else {
                stack.pop();
            }
        }
        if(stack.empty()) {
            return "YES";
        }
        else{
            return "NO";
        }
    }
}

