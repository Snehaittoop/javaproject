import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println(("enter x"));
        int x = input.nextInt();
        System.out.println("enter y");
        int y = input.nextInt();
        int temp=0;

        temp=x;
        x=y;
        y=temp;
        System.out.println("x is"+x);
        System.out.println("y is "+y);

    }

}
