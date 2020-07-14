public class List<T> {
	protected ListNode<T> head;
	protected int size = 0;
	
	public void add(T insertItem){
		head=new ListNode<T>(insertItem, head);
		size ++;
	}
}