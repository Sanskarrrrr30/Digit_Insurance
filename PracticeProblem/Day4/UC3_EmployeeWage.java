public class UC3_EmployeeWage {
    public static void main(String[] args) {
        int empCheck = (int)(Math.random()*3);
        int empHrs = 0;

        if(empCheck == 1)
            empHrs = 8;
        else if(empCheck == 2)
            empHrs = 4;
        else
            empHrs = 0;

        int wage = empHrs * 20;

        System.out.println("Employee Wage: " + wage);
    }
}