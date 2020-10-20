public class UberX extends Car {
    
    String brand;
    String model;

    public UberX(String license, Account driver) {
        super(license, driver);
        this.brand = brand;
        this.model = model;
    }

    @Override
    void printDataCar() {
        super.printDataCar();
        System.out.println("Modelo: " + model + "\nBrand: " + brand);
    }
}
