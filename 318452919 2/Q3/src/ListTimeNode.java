import java.util.Date;

public class ListTimeNode<T> extends ListNode<T> {

	private java.util.Date date;

	public ListTimeNode(T d, ListNode<T> n) {
		super(d, n);
		// TODO Auto-generated constructor stub
		date = new Date();
	}

}