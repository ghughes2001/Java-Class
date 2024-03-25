import java.util.*;

public class TestMain {
    public static void main(String[] args)
    {
        System.out.println("Enter weight and price for package 1: ");
        Scanner packageOne = new Scanner(System.in);
        int weightOne = packageOne.nextInt();
        double priceOne = packageOne.nextDouble();

        System.out.println("Enter weight and price for package 2: ");
        Scanner packageTwo = new Scanner(System.in);
        int weightTwo = packageTwo.nextInt();
        double priceTwo = packageTwo.nextDouble();

        CompareCost cost = new CompareCost();
        cost.calculate(priceOne, priceTwo);
    }
}
