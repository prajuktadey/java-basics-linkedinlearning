package basics;
import java.util.Scanner;
public class whileLoop 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        boolean isOnRepeat = true;
        while(isOnRepeat)
        {
            System.out.println("Playing current song.");
            System.out.println("Would you like to take this song off of repeat? If so, answer yes.");
            String input = sc.next();
            
            if (input.equals("Yes"))
            {
                isOnRepeat = false;
                System.out.println("Playing the next song.");
            }
        }
    }
}
