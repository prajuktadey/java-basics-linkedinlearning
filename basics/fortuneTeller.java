package basics;
import java.util.Scanner;
public class fortuneTeller 
{
    public static void main(String[] args) 
    {
        System.out.println("Enter a number between 1 and 10: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if(number>=5)
        {
            System.out.println("Hey, you're in good luck!");
        }
        else if(number<5)
        {
            System.out.println("Come back again!");
        }
    }
}
