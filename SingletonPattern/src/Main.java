//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        QueueSystem queueSystem = new QueueSystem();


        HelpDeskStation station1 = new HelpDeskStation("Station 1", queueSystem);
        HelpDeskStation station2 = new HelpDeskStation("Station 2", queueSystem);
        HelpDeskStation station3 = new HelpDeskStation("Station 3", queueSystem);


        QueueMonitor queueMonitor = new QueueMonitor(queueSystem);


        Customer customer1 = new Customer("Alice");
        customer1.setQueueNumber(queueSystem.getNextQueueNumber());

        Customer customer2 = new Customer("Bob");
        customer2.setQueueNumber(queueSystem.getNextQueueNumber());

        Customer customer3 = new Customer("Charlie");
        customer3.setQueueNumber(queueSystem.getNextQueueNumber());


        queueMonitor.displayCurrentQueue();


        station1.serveCustomer();
        station2.serveCustomer();
        station3.serveCustomer();


        station2.resetQueue(100);


        queueMonitor.displayCurrentQueue();


        station1.serveCustomer();
    }
}
