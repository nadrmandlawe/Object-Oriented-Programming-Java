import java.util.Date;
import java.util.Iterator;

public interface TimelyIterable<T> extends Iterable<T>{
	Iterator<T> iterator(Date from, Date to);
}