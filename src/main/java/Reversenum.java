import java.sql.SQLOutput;

public class Reversenum {
    public static void main(String[] args) {
        int num =1234, rev=0;
        System.out.println("number"+num);
        while(num !=0){
            int dig = num%10;
            rev=rev*10+dig;
            num /=10;
        }
        System.out.println("reversed num" +rev
        );
    }



}
