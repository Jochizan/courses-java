public class Driver extends Account {
    
    public driver(String name, String document) {
        super(name, document);
    }

    void printDataDriver() {
        System.out.println("Name driver: " + name + "\nDocument driver: " + document);
    }
}
