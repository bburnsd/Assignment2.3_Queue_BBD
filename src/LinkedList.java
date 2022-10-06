/**
 * @author njohnson3
 *
 */
public class LinkedList<T> {
	
	Node<T> head;
	int length;
	Node<T> tail;
	public LinkedList()
	{
		head=null;
		length=0;
		tail=head;
	}
	public boolean isEmpty()
	{
		if (head==null) { return true;}
		else return false;
	}
	public Node<T> getList()
	{
		return head;
	}
	public void addNode(Node<T> aNode)
	{
		if (isEmpty() ) {
			head = aNode;
			tail=head;
			return;
		}
		tail.nextNode=aNode;
		tail=tail.nextNode;
		tail.nextNode=null;
		length++;
		
	}
}