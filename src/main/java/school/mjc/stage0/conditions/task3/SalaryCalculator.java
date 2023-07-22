package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        double taxRate;
        if (salary <= 0) {
            System.out.println("Wrong input!");
            return;
        } else if (salary <= 10000) {
            taxRate = 0.15;
        } else if (salary <= 20000 && salary > 10000) {
            taxRate = 0.18;
        } else {
            taxRate = 0.20;
        }
    }
}
