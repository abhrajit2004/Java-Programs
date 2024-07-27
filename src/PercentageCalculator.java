import java.util.Scanner;

public class PercentageCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter full marks for each subject: ");
        float full_marks = sc.nextFloat();
        System.out.println("Enter marks for English: ");
        float sub1 = sc.nextFloat();
        System.out.println("Enter marks for Physics: ");
        float sub2 = sc.nextFloat();
        System.out.println("Enter marks for Chemistry: ");
        float sub3 = sc.nextFloat();
        System.out.println("Enter marks for Mathematics: ");
        float sub4 = sc.nextFloat();
        System.out.println("Enter marks for Computer Science: ");
        float sub5 = sc.nextFloat();
        float acquired_total = sub1 + sub2 + sub3 + sub4 + sub5;
        float percentage = (acquired_total/(full_marks*5))*100;
        System.out.print("The percentage will be: ");
        System.out.println(percentage);
    }
}
