import java.util.Date;
import java.util.Iterator;

public class TimelyList<T> extends List<T> implements TimelyIterable<T>{

	public void add(T insertItem){
		head=new ListTimeNode(insertItem, head);
	}

	public void lesovev() throws Exception {
		ListNode t1 =  head;
		ListNode t2 =  head.getNext();
		head = t2;

		if(size < 2) {
			throw new Exception("Can not lesovev a list with fewer then 2 items."); 
		} else {
			while(t2.getNext() != null) {
				t2 = t2.getNext();
			}
			t2.setNext(t1);
		}
	}


	@Override
	public Iterator<T> iterator(Date from, Date to) {
		// TODO Auto-generated method stub
		TimeListIterator iterator = new TimeListIterator(from, to, head);
		return iterator;
	}

	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return null;
	}



}