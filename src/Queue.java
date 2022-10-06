/**
 * @author Brad Davis
 * This queue class uses the LinkedList class to create a queue that adds to the back of the queue and removes from the front of the queue
 * @param <T>
 */
public class Queue<T> {
protected LinkedList<String> queue;

/**
 * This method instantiates the LinkedList so that we can add and remove the customers from the queue from
 */
public Queue() {
	queue = new LinkedList<String>();
}//end Constructor

/**
 * This method has the user input a string that is stored into a node that is then added on to the back of a queue
 * @param newEntry  This will be the name of the customer to be stored in each node
 */
public void enqueue(String newEntry) {
	Node<String> customer = new Node<String>();
	customer.setData(newEntry);
	if(queue.isEmpty()) {
		queue.head = customer;
	}
	else {
		this.queue.tail.setNextNode(customer);
	}
	this.queue.tail=customer;
}//end enqueue

/**
 * This method sets the front of the queue to null, then makes the front of the queue equal the next node
 * @return  the current front of the queue
 */
public String dequeue() {
	Node<String> front = this.queue.getList();
	this.queue.head.setData(null);
	this.queue.head = this.queue.head.nextNode;
	if(queue.head == null) {
		queue.tail=null;
	}
	return front.data;
}//end dequeue

/**
 * This method uses the LinkedList method that returns the head of the LinkedList, in this case we are returning the head of the queue
 * @return  The front of the queue
 */
public String getFront() {
	return this.queue.getList().data;
}//end getFront

/**
 * This method prints out the string in each node to show each customer in the queue
 */
public void printQueue() {
	Node<String> tempnode = queue.head;
	while(tempnode != null) {
		System.out.println(tempnode.data);
		tempnode = tempnode.nextNode;
	}
}//end printQueue
}//end Queue
