package jobsheet6;

public class Students {
    int nim, age;
    String name;
    double gpa;

    Students(int nim, String name, int age, double gpa) {
        this.nim = nim;
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    public void display() {
        System.out.printf("| %-5s | %-30s | %-5s | %-5s |%n", nim, name, age, gpa);
    }
}