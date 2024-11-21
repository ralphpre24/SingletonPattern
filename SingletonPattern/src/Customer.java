public class Customer {
    private String name;
    private int queueNumber;

    public Customer(String name) {
        this.name = name;
    }

    public void setQueueNumber(int queueNumber) {
        this.queueNumber = queueNumber;
    }

    public int getQueueNumber() {
        return queueNumber;
    }

    public String getName() {
        return name;
    }
}

