
/**
 * @author njohnson3
 *
 */
class Node<T> {
	T data;
	Node<T> nextNode;
	public Node()
	{
		nextNode=null;
		data=null;
	}
	public void setData(T data) {
		this.data=data;
	}
	public Node<T> getNode() {
		return this;
	}
	public void setNextNode(Node<T> nextNode)
	{
		this.nextNode=nextNode;
	}
	
	
}
