package jobsheet3;

public class employee {
    String name;
    int age;
    int[] salary = new int[3];
    int livingAllowance;
    int transportationAllowance;

    public employee(String name, int age, int[] salary, int livingAllowance, int transportationAllowance) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.livingAllowance = livingAllowance;
        this.transportationAllowance = transportationAllowance;
    }
    public double averageSalary() {
            double sum = 0;
            for (int i = 0; i < salary.length; i++) {
                sum += salary[i];
            }
            return sum / salary.length;
        }
    public double totalSalary() {
            return averageSalary() + livingAllowance + transportationAllowance;
        }
    public void printData() {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Salary: " + salary[0] + ", " + salary[1] + ", " + salary[2]);
            System.out.println("Living Allowance: " + livingAllowance);
            System.out.println("Transportation Allowance: " + transportationAllowance);
        }
    }
