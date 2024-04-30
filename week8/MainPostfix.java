package week8;

import java.util.Scanner;

public class MainPostfix {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String P, Q;
        System.out.println("Enter expression (infix): ");
        Q = sc.nextLine();
        Q = Q.trim();
        Q = Q + ")";
        int total = Q.length();
        Postfix post = new Postfix(total);
        P = post.convert(Q);
        System.out.println("Postfix expression: " + P);
    }
}