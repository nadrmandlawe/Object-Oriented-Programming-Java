import java.util.Date;
import java.util.Iterator;

public class Program {

	public static void main(String[] args) throws Exception {
		TimelyList<String> myList = new TimelyList<String>();
Date dstart = new Date();  // נמדד ונקבע להיות זמן ההתחלה dstart 

// הלולאה הבאה מוסיפה לרשימה 11 איברים (מחרוזות) בהפרש של שניה בין כל הכנסה
for (int i = 0 ; i <= 10 ; i++){
	System.out.println("Adding item # " + i + " at time " + new Date());
	myList.add("Item "+i);
	Thread.sleep(1000);  // ככה גורמים לריצת התוכנית לעצור לשניה אחת
}
//  להיות זמן ההתחלה + 3.5 שניותd1השורה הבאה בוחרת את 
// "Item4" להכנסת המחרוזת "Item3"שזו נקודת הזמן שבין הכנסת המחרוזת 
Date d1 = new Date(dstart.getTime() + 3500); 

//  להיות זמן ההתחלה + 8.5 שניותd2השורה הבאה בוחרת את 
// "Item9" להכנסת המחרוזת "Item8"שזו נקודת הזמן שבין הכנסת המחרוזת 
Date d2 = new Date(dstart.getTime() + 8500);

System.out.println("d1 was set to " + d1);
System.out.println("d2 was set to " + d2);

System.out.println("** The entire list is **");
for (String item : myList){
	System.out.print(item+",");
} System.out.println();

System.out.println("** After rotation the entire list is **");
myList.lesovev();
for (String item : myList){
	System.out.print(item+",");
} System.out.println();

System.out.println("** after d1 and before d2 are only **");
Iterator<String> it = myList.iterator(d1,d2);
while(it.hasNext()) System.out.print(it.next()+",");


	}

}
