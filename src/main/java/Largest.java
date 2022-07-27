import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        int x,y,z;
        Scanner input=new Scanner(System.in);
        System.out.println("enter first number");
        x= input.nextInt();
        System.out.println("enter second number");
        y= input.nextInt();
        System.out.println("enter third number");
        z=input.nextInt();
        if(x>y&x>z) {
            System.out.println(" larger value " + x);
         }
        else if(y>z){
                System.out.println(" larger value "+ y);
            }
        else {
                System.out.println("larger value "+ z);
            }


    }
}
