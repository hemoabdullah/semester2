package jobsheet6;

import java.util.Random;
import java.util.Scanner;
import java.text.DecimalFormat;

import net.datafaker.Faker;

    public class MainStudent {
        static Scanner s = new Scanner(System.in);
    
        public static void main(String[] args) {
            Random r = new Random();
            Faker faker = new Faker();
            SearchStudent data = new SearchStudent();
            DecimalFormat df = new DecimalFormat("#.##");
    
            System.out.print("Enter the amount of student: ");
            int amount = s.nextInt();
            data.listStd = new Students[amount];
    
            for (int i = 0; i < data.listStd.length; i++) {
                Students student = new Students(r.nextInt(1000, 3000), faker.name().fullName(), r.nextInt(17, 20),
                        Double.parseDouble(df.format(r.nextDouble(2.0, 4.0))));
                data.add(student);
            }
    
            System.out.println("+--------------------------------------------------------+");
            System.out.printf("| %-5s | %-30s | %-5s | %-5s |%n", "NIM", "Name", "Age", "GPA");
            System.out.println("+--------------------------------------------------------+");
            data.display();
            System.out.println("+--------------------------------------------------------+");
            // System.out.println("Enter the NIM you want to search: ");
            // int search = data.listStd[r.nextInt(data.listStd.length)].nim;
            // System.out.println(search);
            System.out.println("Enter the name you want to search: ");
            String search2 = data.listStd[r.nextInt(data.listStd.length)].name;
            System.out.println(search2);
            System.out.println("Sequential Search");
            int pos = data.findSeqSearch(search2);
            data.showPosition(search2, pos);
            data.showData(search2, pos);
        }
    }
