package week8;

public class Reverse {
    public static class ReverseString {
        char[] items;
        int top, max;
    
        ReverseString(int size) {
            top = -1;
            max = size;
            items = new char[max];
        }
    
        void push(char c) {
            if (top < max - 1) {
                items[++top] = c;
            }
        }
    
        char pop() {
            if (top >= 0) {
                return items[top--];
            }
            return '\0';
        }
    
        boolean isEmpty() {
            return top == -1;
        }
        String ReverseSentence(String str) {
            int length = str.length();
            ReverseString rs = new ReverseString(length);
            for (int i = 0; i < length; i++) {
                rs.push(str.charAt(i));
            }
            String result = "";
            while (!rs.isEmpty()) {
                result = result + rs.pop();
            }
            return result;
        }
    }
    
    public static void main(String[] args) {
        String str = "Politeknik Negeri Malang";
        ReverseString rs = new ReverseString(str.length());
        String reversedSentence = rs.ReverseSentence(str);
        
        System.out.println("Result:");
        System.out.println(reversedSentence);
    }
}
