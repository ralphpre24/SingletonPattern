public class HelpDeskStation {
    private String stationName;
    private QueueSystem queueSystem;

    public HelpDeskStation(String stationName, QueueSystem queueSystem) {
        this.stationName = stationName;
        this.queueSystem = queueSystem;
    }


    public void serveCustomer() {
        int queueNumber = queueSystem.getNextQueueNumber();
        System.out.println(stationName + " is serving customer with Queue Number: " + queueNumber);
    }


    public void resetQueue(int newQueueNumber) {
        queueSystem.resetQueue(newQueueNumber);
        System.out.println(stationName + " has reset the queue to: " + newQueueNumber);
    }
}

