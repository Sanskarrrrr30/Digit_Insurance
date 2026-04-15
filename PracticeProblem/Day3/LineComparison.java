//UC2
import java.util.*;

class LineComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x1 = sc.nextInt(), y1 = sc.nextInt();
        int x2 = sc.nextInt(), y2 = sc.nextInt();

        int x3 = sc.nextInt(), y3 = sc.nextInt();
        int x4 = sc.nextInt(), y4 = sc.nextInt();

        double line1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        double line2 = Math.sqrt(Math.pow(x4 - x3, 2) + Math.pow(y4 - y3, 2));

        if(Double.valueOf(line1).equals(line2))
            System.out.println("Lines are Equal");
        else
            System.out.println("Lines are Not Equal");
    }
}



//UC1
// import java.util.*;

// class LineComparison {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int x1 = sc.nextInt();
//         int y1 = sc.nextInt();
//         int x2 = sc.nextInt();
//         int y2 = sc.nextInt();

//         double length = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

//         System.out.println("Length = " + length);
//     }
// }



//UC0
// class LineComparison {
//     public static void main(String[] args) {
//         System.out.println("Welcome to Line Comparison Computation Program");
//     }
// }