public class QueueSystem {
    private static int currentQueueNumber = 1;


    public synchronized int getNextQueueNumber() {
        return currentQueueNumber++;
    }


    public synchronized void resetQueue(int newQueueNumber) {
        currentQueueNumber = newQueueNumber;
    }
}

