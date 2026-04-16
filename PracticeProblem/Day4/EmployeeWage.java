public class EmployeeWage {

    static final int IS_FULL_TIME = 1;
    static final int IS_PART_TIME = 2;
    static final int EMP_RATE_PER_HOUR = 20;
    static final int MAX_HOURS = 100;
    static final int MAX_DAYS = 20;

    public static void main(String[] args) {

        // UC0
        System.out.println("Welcome to Employee Wage Computation Program");

        int totalEmpHrs = 0;
        int totalWorkingDays = 0;

        // UC6 (covers UC5 also)
        while (totalEmpHrs <= MAX_HOURS && totalWorkingDays < MAX_DAYS) {
            totalWorkingDays++;

            int empHrs = 0;

            // UC1 + UC3
            int empCheck = (int) (Math.random() * 3);

            // UC4 (Switch Case)
            switch (empCheck) {
                case IS_FULL_TIME:
                    empHrs = 8;
                    break;
                case IS_PART_TIME:
                    empHrs = 4;
                    break;
                default:
                    empHrs = 0;
            }

            totalEmpHrs += empHrs;

            int dailyWage = empHrs * EMP_RATE_PER_HOUR;

            // UC2 + UC5
            System.out.println("Day " + totalWorkingDays +
                    " Hours: " + empHrs +
                    " Wage: " + dailyWage);
        }

        int totalSalary = totalEmpHrs * EMP_RATE_PER_HOUR;

        System.out.println("Total Working Days: " + totalWorkingDays);
        System.out.println("Total Hours: " + totalEmpHrs);
        System.out.println("Total Salary: " + totalSalary);
    }
}