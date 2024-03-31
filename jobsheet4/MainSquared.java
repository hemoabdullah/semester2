package jobsheet4;

import java.util.Scanner;

public class MainSquared {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("=====================================================");
        System.out.print("Input the number of elements you want to count : ");
        int elemen = scan.nextInt();

        Squared[] png = new Squared[elemen];

        for (int i = 0; i < elemen; i++){
            
            System.out.print("Input the value to be squared to-"+(i+1)+" : ");
            int num = scan.nextInt();
            System.out.print("Input the square dvalue to-"+(i+1)+" : ");
            int squared = scan.nextInt();
            png[i] = new Squared(num, squared);
        }
        System.out.println("====================================================");
        System.out.println("Select the method to use : ");
        System.out.println("1. Brute Force Squared");
        System.out.println("2. Divide and Conquer Squared");
        System.out.print("Enter your choice : ");
        int choice = scan.nextInt();

        switch (choice) {
            case 1:
            System.out.println("====================================================");
            System.out.println("Results with Brute Force squared");
            for (int i = 0; i < elemen; i++) {
            System.out.println("Value "+png[i].num+" squared "+png[i].squared+"is : "+png[i].squaredBF(png[i].num, png[i].squared));
            }    
                break;
            case 2:
            System.out.println("====================================================");
            System.out.println("Results with Divide and Conquer squared");
            for (int i = 0; i < elemen; i++) {
            System.out.println("Value "+png[i].num+" squared "+png[i].squared+"  : "+png[i].squaredDC(png[i].num, png[i].squared));
            }
                break;
        
            default:
                System.out.println("Invalid choice");
        }
        
    }
}