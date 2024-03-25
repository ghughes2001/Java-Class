public class ElectronicsProducts extends Product {
    int warrantyPeriod;
    double powerConsumption;

    public ElectronicsProducts(String name, double price, int WARRANTYPERIOD, double POWERCONSUMPTION)
    {
        super(name, price);
        this.warrantyPeriod = WARRANTYPERIOD;
        this.powerConsumption = POWERCONSUMPTION;
    }
    void getWarrantyPeriod()
    {
        System.out.println(warrantyPeriod);
    }
    void getPowerConsumption()
    {
        System.out.println(powerConsumption);
    }
}