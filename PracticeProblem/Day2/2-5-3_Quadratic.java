import java.util.*;

class Quadratic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double delta = b*b - 4*a*c;

        if(delta > 0) {
            double root1 = (-b + Math.sqrt(delta)) / (2*a);
            double root2 = (-b - Math.sqrt(delta)) / (2*a);
            System.out.println("Roots are real and different");
            System.out.println(root1 + " " + root2);
        }
        else if(delta == 0) {
            double root = -b / (2*a);
            System.out.println("Roots are real and equal");
            System.out.println(root + " " + root);
        }
        else {
            System.out.println("Roots are imaginary");
        }
    }
}