public class Payment {
    Integer id;

    public Payment(Integer id) {
        this.id = id;
    }

    void printDataPayment() {
        System.out.println("Id:" + id);
    }

    public Card(Integer id, String number, String cvv, STring date) {
        super(id);
        this.number = number;
        this.cvv = cvv;
        this.date = date;   
    }

    public Cash(Integer id) {
        super(id);
    }

    public payPal(Integer id, String email) {
        super(id);
        this.email = email;
    }
}
