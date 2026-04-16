public class UC5_EmployeeWage {
    public static void main(String[] args) {
        int totalWage = 0;

        for(int day = 1; day <= 20; day++) {
            int empCheck = (int)(Math.random()*3);
            int empHrs = 0;

            switch(empCheck) {
                case 1: empHrs = 8; break;
                case 2: empHrs = 4; break;
                default: empHrs = 0;
            }

            int wage = empHrs * 20;
            totalWage += wage;
        }

        System.out.println("Total Monthly Wage: " + totalWage);
    }
}