public class TestMain {
    public static void main(String[] args)
    {
        Product objOne = new Product("Sweater", 90);
        ElectronicsProducts objTwo = new ElectronicsProducts("Laptop", 1000, 2, 65.0);
        Product objThree = new Product("Knitted Polo", 180);
        ElectronicsProducts objFour = new ElectronicsProducts("Iphone", 2000, 3, 35.0);

        System.out.println("First Set: ");
        objOne.getPriceRange();
        objTwo.getPriceRange();
        objTwo.getWarrantyPeriod();
        objTwo.getPowerConsumption();

        System.out.println("Second Set: ");
        objThree.getPriceRange();
        objFour.getPriceRange();
        objFour.getWarrantyPeriod();
        objFour.getPowerConsumption();
    }
}