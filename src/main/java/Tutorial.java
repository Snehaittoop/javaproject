import java.util.Scanner;

public class Tutorial {
    String name;
    String designation;
    int salary;

    public static void main(String[] args) {
       Tutorial obj=new Tutorial();
       Scanner input=new Scanner(System.in);

       System.out.println("enter name");
       obj.name=input.next();
       System.out.println("enter designation");
       obj.designation=input.next();
       System.out.println("enter salary");
       obj.salary=input.nextInt();








    }
}
