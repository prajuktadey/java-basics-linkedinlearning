package basics;
import java.util.Scanner;
public class inputoutput 
{
    public static void main(String[] args) 
    {
        System.out.println("Enter your GPA: ");
        Scanner sc = new Scanner(System.in);
        double studentGPA = sc.nextDouble();
        System.out.println("Your GPA is: " + studentGPA);
    }
}
