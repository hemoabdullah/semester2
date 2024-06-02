package jobsheet3;
public class employeemain {
    public static void main(String[] args) {
        int n = 5;
        employee[] employees = new employee[n];
        employees[0] = new employee("Hammam", 40, new int[]{1400, 1500, 1600}, 300, 200);
        employees[1] = new employee("imam", 30, new int[]{1100, 1200, 1300}, 180, 120);
        employees[2] = new employee("faiz", 45, new int[]{800, 900, 1000}, 150, 90);
        employees[3] = new employee("ahmed", 50, new int[]{500, 600, 700}, 140, 100);
        employees[4] = new employee("aqila", 35, new int[]{200, 300, 400}, 120, 50);

        double totalSalarySum = 0;
        int maxAllowance = 0;
        employee maxAllowanceEmployee = null;
        for (employee emp : employees) {
            if (emp.age > 35) {
                totalSalarySum += emp.totalSalary();
            }
            if (emp.age >= 35 && emp.age <= 50) {
                int totalAllowance = emp.livingAllowance + emp.transportationAllowance;
                if (totalAllowance > maxAllowance) {
                    maxAllowance = totalAllowance;
                    maxAllowanceEmployee = emp;
         }
         }
         }
        double averageTotalSalary = totalSalarySum / n;
        System.out.println("Average total salary of employees above 35: " + averageTotalSalary);

        if (maxAllowanceEmployee != null) {
            System.out.println("Employee with the biggest allowance (35-50 years old): ");
            maxAllowanceEmployee.printData();
        }
        }
        }
        