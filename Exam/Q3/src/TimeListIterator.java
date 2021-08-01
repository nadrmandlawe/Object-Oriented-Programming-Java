import java.util.Date;
import java.util.Iterator;

public class TimeListIterator<T> implements Iterator<T>{

	Date from;
	Date to;
	ListTimeNode node;
	
	public TimeListIterator(final Date from, final Date to, final ListNode<T> head) {
		super();
		this.from = from;
		this.to = to;
		this.node = (ListTimeNode) head;
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		if(node.getNext() != null) {
			return true;
		}
		return false;
	}

	@Override
	public T next() {
		// TODO Auto-generated method stub
		final T value = (T) node.getValue();
		node = (ListTimeNode) node.getNext();
		return value;
	}

}