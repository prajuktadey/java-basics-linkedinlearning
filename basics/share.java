import java.util.Scanner;
public class share 
{
    public static double calculateTotalMealPrice(double listedMealPrice, double tipRate, double taxRate)
    {
        double tip = tipRate * listedMealPrice;
        double tax = taxRate * listedMealPrice;
        double result = listedMealPrice + tip + tax;

       return result;
    }
    public static void main(String[] args) 
    {
        System.out.println("Enter the listed meal price: ");
        Scanner sc = new Scanner(System.in);
        double mealprice = sc.nextDouble();

        System.out.println("Enter the tip rate: ");
        Scanner sc1 = new Scanner(System.in);
        double tip = sc1.nextDouble();

        System.out.println("Enter the listed tax rate: ");
        Scanner sc2 = new Scanner(System.in);
        double tax = sc2.nextDouble();

        double total = calculateTotalMealPrice(mealprice, tip, tax);
        double individualMealPrice = total/5;
        System.out.println(individualMealPrice);
    }
}
