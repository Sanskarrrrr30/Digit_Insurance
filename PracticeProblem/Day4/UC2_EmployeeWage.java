public class UC2_EmployeeWage {
    public static void main(String[] args) {
        int isPresent = (int)(Math.random()*2);
        int empHrs = 0;

        if(isPresent == 1)
            empHrs = 8;
        else
            empHrs = 0;

        int wage = empHrs * 20;

        System.out.println("Employee Wage: " + wage);
    }
}