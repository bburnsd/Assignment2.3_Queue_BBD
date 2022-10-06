/**
 * @author Brad Davis
 * This application class is used to use the methods of the Queue class to simulate an actual queue
 */
public class Application {

	public static void main(String[] args) {
Queue queueline = new Queue(); //instantiating the queue

queueline.enqueue("Bill");
queueline.enqueue("Alice");
queueline.enqueue("Bob");//adding bill, alice, and bob into the queue
System.out.println("\n******QUEUE******");
queueline.printQueue();                  //Shows the current people in queue
System.out.println("*****************\n");

queueline.dequeue();
System.out.println("A customer is served.");//removing from the front of the queue since the customer has been served
System.out.println("\n******QUEUE******");
queueline.printQueue();                  //Shows the current people in queue
System.out.println("*****************\n");

queueline.enqueue("Jane");
queueline.enqueue("Hamad"); 
System.out.println("Jane and Hamad arrive.");// Jane and Hamad are added to the back of the queue because they have just arrived
System.out.println("\n******QUEUE******");
queueline.printQueue();                  //Shows the current people in queue
System.out.println("*****************\n");

queueline.dequeue();
queueline.dequeue();
System.out.println("Two customers are served"); //2 more people removed from the front of the queue, since they are served
System.out.println("\n******QUEUE******");
queueline.printQueue();                  //Shows the current people in queue
System.out.println("*****************\n");

queueline.enqueue("Jim");
System.out.println("Jim arrives."); //Jim is added to the back of the queue because he just arrived
System.out.println("\n******QUEUE******");
queueline.printQueue();                  //Shows the current people in queue
System.out.println("*****************\n");

queueline.dequeue();
queueline.dequeue();
System.out.println("Two more customers are served");//2 more customers have been served, so they are removed from the front of the queue
System.out.println("\n******QUEUE******");
queueline.printQueue();                  //Shows the current people in queue
System.out.println("*****************\n");




	}

}
