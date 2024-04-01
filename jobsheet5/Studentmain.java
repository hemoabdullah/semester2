package jobsheet5;
import java.util.Scanner;
import java.util.Random;
import java.util.UUID;

public class Studentmain {
    static Scanner s1 = new Scanner(System.in);
    static Scanner s2 = new Scanner(System.in);

    public static void main(String[] args) {
        Random r = new Random(10);

        studentlist data = new studentlist();
        int n = 5;
        for (int i = 0; i < n; i++) {
            
            String name = UUID.randomUUID().toString();
            int year = r.nextInt(1000);
            int age = r.nextInt(1000);
            double gpa = (Math.random() * 4.1 );

            Student student = new Student(name, year, age, gpa);
            data.add(student);
        }

        System.out.println("Unsorted student list");
        data.display();

        System.out.println("Sorted Student List based on GPA using bubble sort");
        data.bubbleSort();
        data.display();

        System.out.println("Sorted Student List based on GPA using selection sort");
        data.selectionSort();
        data.display();

        System.out.println("Sorted Student List based on GPA using insertion sort");
        System.out.print("1. Ascending 2. Descending: ");
        int input = s1.nextInt();
        data.insertionSort(
            input == 1 ? true : false
        );
        data.display();

    }
}