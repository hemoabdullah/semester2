package jobsheet4;

import java.util.Scanner;
public class MainScore {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter amount of student: ");
        int amount = scan.nextInt();
        score[] scores = new score[amount];

        for (int i = 0; i < scores.length; i++) {
            System.out.print("Input Name : ");
            String name = scan.next();
            System.out.print(" Input Score assignment : ");
            double scoreAssgnment = scan.nextDouble();
            System.out.print("Input score quiz : ");
            double scoreQuiz = scan.nextDouble();
            System.out.print("Input score mid : ");
            double scoreMid = scan.nextDouble();
            System.out.print("Input score final : ");
            double scoreFinal = scan.nextDouble();
            scores[i] = new score(name, scoreAssgnment, scoreQuiz, scoreMid, scoreFinal);


        }
        double totalScore = 0; 
        for (int i = 0; i < scores.length; i++) {
            totalScore += scores[i].calculateTotalScore();
        }
        double avgScore = totalScore/amount;
        int row =  amount + 2;
        String[] nameColumn = new String[row];
        String[] valueColumn = new String[row];
        nameColumn[0] = "Name";
        nameColumn[row-1] = "Average";
        valueColumn[0] = "Total Value of Algorithm Courses";
        valueColumn[row-1] = String.format("%,.2f", avgScore);
        for (int i = 1; i < row-1; i++) {
            nameColumn[i] = scores[i-1].nameSdt;
            valueColumn[i] = String.format("%,.2f", scores[i-1].calculateTotalScore());
        }
        System.out.println("There are a total of the following student grades");
        System.out.println("================================================================");
        for (int i = 0; i < row; i++) {
            System.out.printf("| %-30s | %-30s |%n", nameColumn[i], valueColumn[i]);
            System.out.println("----------------------------------------------------------------");         
        }   
        System.out.println("================================================================");
        System.out.printf("Then the average total value of all students who have taken the algorithm course is %,.2f", avgScore);
}
}