import java.util.*;

class ArithmeticOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int op1 = a + b * c;
        int op2 = c + a / b;
        int op3 = a % b + c;
        int op4 = a * b + c;

        int max = op1;
        int min = op1;

        if (op2 > max)
            max = op2;
        if (op3 > max)
            max = op3;
        if (op4 > max)
            max = op4;

        if (op2 < min)
            min = op2;
        if (op3 < min)
            min = op3;
        if (op4 < min)
            min = op4;

        System.out.println("Results:");
        System.out.println(op1 + " " + op2 + " " + op3 + " " + op4);
        System.out.println("Max = " + max);
        System.out.println("Min = " + min);
    }
}