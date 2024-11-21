public class QueueMonitor {
    private QueueSystem queueSystem;

    public QueueMonitor(QueueSystem queueSystem) {
        this.queueSystem = queueSystem;
    }


    public void displayCurrentQueue() {
        System.out.println("Current Queue Number: " + queueSystem.getNextQueueNumber());
    }
}

