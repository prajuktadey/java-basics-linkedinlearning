package basics;
import java.util.Scanner;
public class functionBasics 
{
    public static void announceDeveloperTeaTiime()
    {
        System.out.println("Waiting for developer tea time...");
        System.out.println("Type in a random word and press Enter to start developer tea time!");
        Scanner sc = new Scanner(System.in);
        sc.next(); //randon input
        System.out.println("It's developer tea time!");

    }
    public static void main(String[] args) 
    {
        announceDeveloperTeaTiime();
    }
}
