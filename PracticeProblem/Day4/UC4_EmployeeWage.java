public class UC4_EmployeeWage {
    public static void main(String[] args) {
        int empCheck = (int)(Math.random()*3);
        int empHrs = 0;

        switch(empCheck) {
            case 1:
                empHrs = 8;
                break;
            case 2:
                empHrs = 4;
                break;
            default:
                empHrs = 0;
        }

        int wage = empHrs * 20;

        System.out.println("Employee Wage: " + wage);
    }
}