public class ListNode<T> {

	private T value;
	private ListNode<T> nextNode;
	
	public ListNode(T d,ListNode<T> n){
		value=d; nextNode=n;
	}
	
	public T getValue(){ return value;}
	public void setValue(T val){ value = val; }
	public ListNode<T> getNext(){ return nextNode;	}
	public void setNext(ListNode<T> next){ nextNode = next;}
}
