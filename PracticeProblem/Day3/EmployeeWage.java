import java.util.*;

class EmployeeWage {
    static final int IS_FULL_TIME = 1;
    static final int IS_PART_TIME = 2;
    static final int EMP_RATE_PER_HOUR = 20;
    static final int NUM_OF_WORKING_DAYS = 20;
    static final int MAX_HRS_IN_MONTH = 100;

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");

        int totalEmpHrs = 0;
        int totalWorkingDays = 0;

        while (totalEmpHrs <= MAX_HRS_IN_MONTH && totalWorkingDays < NUM_OF_WORKING_DAYS) {
            totalWorkingDays++;

            int empCheck = (int) (Math.random() * 3);
            int empHrs = 0;
            String empType = "";

            switch (empCheck) {
                case IS_FULL_TIME:
                    empHrs = 8;
                    empType = "Full Time";
                    break;

                case IS_PART_TIME:
                    empHrs = 4;
                    empType = "Part Time";
                    break;

                default:
                    empHrs = 0;
                    empType = "Absent";
            }

            totalEmpHrs += empHrs;
            int dailyWage = empHrs * EMP_RATE_PER_HOUR;

            System.out.println("Day " + totalWorkingDays + " : " + empType + " | Wage = " + dailyWage);
        }

        int totalSalary = totalEmpHrs * EMP_RATE_PER_HOUR;

        System.out.println("\nTotal Working Days: " + totalWorkingDays);
        System.out.println("Total Hours: " + totalEmpHrs);
        System.out.println("Total Salary: " + totalSalary);
    }
}