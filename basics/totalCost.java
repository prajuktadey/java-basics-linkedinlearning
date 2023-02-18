import java.util.Scanner;
public class totalCost 
{
    public static void calculateTotalMealPrice(double listedMealPrice, double tipRate, double taxRate)
    {
        double tip = tipRate * listedMealPrice;
        double tax = taxRate * listedMealPrice;
        double result = listedMealPrice + tip + tax;

        System.out.println("The result is: "+ result);
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

        calculateTotalMealPrice(mealprice, tip, tax);

    }
}
