package week8;
public class Postfix {

    int top, n;
    char[] stack;

    Postfix(int size) {
        top = -1;
        n = size;
        stack = new char[n];
        push('(');
    }

    void push(char c) {
        top++;
        stack[top] = c;
    }

    char pop() {
        char item = stack[top];
        top--;
        return item;
    }

    boolean IsOperand(char c) {
        if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9') || (c == ' ' || c == '.'))
            return true;
        else
            return false;
    }

    boolean IsOperator(char c) {
        if (c == '+' || c == '-' || c == '*' || c == '/' || c == '^' || c == '%')
            return true;
        else
            return false;
    }

    int degree(char c) {
        switch (c) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
            case '%':
                return 2;
            case '^':
                return 3;
            default:
                return 0;
        }
    }

    String convert(String q) {
        String p = "";
        char c;
        for (int i = 0; i < n; i++) {
            c = q.charAt(i);
            if (IsOperand(c)) {
                p = p + c;
            } else if (IsOperator(c)) {
                while (degree(stack[top]) > degree(c)) {
                    p = p + pop();
                }
                push(c);
            } else if (c == '(') {
                push(c);
            } else if (c == ')') {
                while (stack[top] != '(') {
                    p = p + pop();
                }
                pop();
            }
        }
        return p;
    }
}