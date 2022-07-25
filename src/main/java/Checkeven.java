import java.util.Scanner;

public class Checkeven {

    public static void main(String[] args) {
            Scanner input=new Scanner(System.in);
            System.out.println("enter number");
            int num = input.nextInt();
            if(num%2 ==0) {
                System.out.println(num + "even");
            }
            else{
                System.out.println(num+"odd");
            }

    }
}
