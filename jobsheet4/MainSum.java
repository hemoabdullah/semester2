package jobsheet4;

import java.util.Scanner;
public class MainSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================================");
        System.out.println("Program for Calculating Total Profits");
        System.out.print("Input the number of Companies : ");
        int numCompanies=sc.nextInt();
        
        Sum[] companySums = new Sum[numCompanies];

        System.out.println("================================================");
        for (int i = 0; i < numCompanies; i++) {
            System.out.println("Input name of company "+(i+1));
            System.out.print("Input the number of months for company "+(i+1)+" : ");
            int toElement = sc.nextInt();
            companySums[i] = new Sum(toElement);
            
            System.out.println("Input profit for company "+(i+1)+" : ");
            for(int j=0; j < toElement; j++){
            System.out.print("Input the profit of the month to - "+(j+1)+" = ");
            companySums[i].profit[j] = sc.nextDouble();
            }
        }
        System.out.println("================================================");
        System.out.println("Total profit for each company:");

        for(int i = 0; i < numCompanies; i++){
            System.out.println("Company "+(i+1)+" :");
            System.out.println("Total profit using Brute Force : "+ companySums[i].totalBF(companySums[i].profit));
            System.out.println("Total using Divide Conquer : "+ companySums[i].totalDC(companySums[i].profit, 0, companySums[i].elemen-1));
        }
        
    }
}