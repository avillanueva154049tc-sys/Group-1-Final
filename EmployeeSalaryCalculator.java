import java.util.Scanner;

public class EmployeeSalaryCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // 1.
        System.out.print("Employee Name: ");
        String Ename = input.nextLine();// ename = employee name

        System.out.print("Hours Worked: ");
        int Hworked = input.nextInt();// Hworked = Hours worked
        
        System.out.print("Hourly Rate: ");
        int Hrate = input.nextInt();// Hrate = Hourly rate
        
       int regHours = Hworked> 40 ? 40 : Hworked;
        int otHours = Hworked> 40 ? Hworked-40 : 0;
        
        double regSalary = regHours*Hrate;//Hours worked multiplied by Hourly rate
        double otPay = otHours*(Hrate*1.5);
        double totalSalary = regSalary + otPay;
        
        System.out.println("\n===SALARY DETAILS===");
        System.out.println("Employee: " + Ename);
        System.out.println("Regular Hours: " + Hworked);
        System.out.println("Overtime Hours: " + otHours);
        System.out.println("Regular Pay: " + regSalary);
        System.out.println("Overtime Pay: " + otPay);
        System.out.println("Total Salary: " + totalSalary);
        
    }
}
