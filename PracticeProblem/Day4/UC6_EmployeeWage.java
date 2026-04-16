public class UC6_EmployeeWage {
    public static void main(String[] args) {
        int totalHrs = 0;
        int totalDays = 0;

        while(totalHrs <= 100 && totalDays < 20) {
            totalDays++;

            int empCheck = (int)(Math.random()*3);
            int empHrs = 0;

            switch(empCheck) {
                case 1: empHrs = 8; break;
                case 2: empHrs = 4; break;
                default: empHrs = 0;
            }

            totalHrs += empHrs;
        }

        int totalWage = totalHrs * 20;

        System.out.println("Total Days: " + totalDays);
        System.out.println("Total Hours: " + totalHrs);
        System.out.println("Total Wage: " + totalWage);
    }
}