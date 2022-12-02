package break_code;
import java.util.Scanner;
public class Break_Code {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num,prime=0;
        System.out.print("Enter any number: ");
        num=input.nextInt();
        for(int i=2;i<num;i++)
        {
            if(num%2==0)
            {
                prime=1;
                break;
            }
        }
        if(prime==0)
        {
            System.out.print(num+" is prime number");
        }
        else
        {
            System.out.print(num+" is not prime number");
        }
    }
    
}
