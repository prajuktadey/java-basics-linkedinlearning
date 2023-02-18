package basics;
import java.util.Scanner;
public class multipleChoice 
{
    public static void main(String[] args) 
    {
        System.out.println("Welcome to the quiz!");
        System.out.println("What is the capital of India?");

        System.out.println("The options are: ");
        System.out.println("A. Delhi");
        System.out.println("B. Mumbai");
        System.out.println("C. Kolkata");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your answer:" );
        String answer = sc.next();

        if(answer.equals("Delhi"))
        {
            System.out.println("Congratulations! That is the correct answer.");
        }
        else
        {
            System.out.println("Sorry, that is the wrong answer.");
        }
    }
}
