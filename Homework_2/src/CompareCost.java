import java.lang.*;

class CompareCost {
    void calculate(double priceOne, double priceTwo)
    {
        if (Double.compare(priceOne, priceTwo) > 0) {
            System.out.println("Package two has a better price!");
        }
        else if (Double.compare(priceOne, priceTwo) < 0) {
            System.out.println("Package one has a better price!");
        }
        else {
            System.out.println("Both packages are the same price!");
        }
    }
}
