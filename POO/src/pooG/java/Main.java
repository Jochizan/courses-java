public class Main {
    public static void main(String[] args) {
        //Car car = new Car("AMQ123", new Account("Andres Herrera", "AND123"));
        //car.setPassenger(4);
        //car.printDataCar();
        UberX uberX = new UberX("AMQ123", new Account("Andres Herrera", "AND123"), "AEA", "MANO");
        uberX.setPassenger(4);
        uberX.printDataCar();

        UberVan uberVan = new UberVan("RWG234", new Account("Joan Roca", "OANID23"), "EIE", "MENU");
        uberVan.setPassenger(6);
        uberVan.printDataCar();
        //Car car2 = new Car("QWE567", new Account("Andrea Herrera", "ANDA876"));
        //car2.passenger = 3;
        //car2.printDataCar();

    }
}
