package NumberProgram;

import java.util.Scanner;

public class PassingDivision {
    public static void main(String[] args)
    {
        // TODO code application logic here
        int math, english, science, art, computer, total, percent;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks out of 100");
        System.out.print("Enter marks of math=");
        math = sc.nextInt();
        System.out.print("Enter marks of english=");
        english = sc.nextInt();
        System.out.print("Enter marks of science=");
        science = sc.nextInt();
        System.out.print("Enter marks of art=");
        art = sc.nextInt();
        System.out.print("Enter marks of computer=");
        computer = sc.nextInt();
        total = math + english + science + art + computer;
        System.out.println("Total marks out of 500=" + total);
        percent = total / 5;
        System.out.println("Percent of marks=" + percent);
        if (percent < 33)
        {
            System.out.println("Fail");
        }
        else if ((percent >= 33) && (percent < 45))
        {
            System.out.println("Third Division");
        }
        else if ((percent >= 45) && (percent < 60))
        {
            System.out.println("Second Division");
        }
        else
        {
            System.out.println("First Division");
        }
    }
}

