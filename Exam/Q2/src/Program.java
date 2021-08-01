
public class Program {

	public static void main(final String[] args) throws Exception {
	System.out.println("***The start***");
	/* Q2.1
		final Person adm1 = new Person(1, "ADAM");
		final Person adm2 = new Person(1, "haddam harishon");
		System.out.println(adm1.equals(adm2));
	
		System.out.println(adm1+" " + adm2);
		adm1.decLifeVal(20);  System.out.println(adm1);
		adm1.decLifeVal(30);  System.out.println(adm1);
		adm1.decLifeVal(60);  System.out.println(adm1);
		adm1.decLifeVal(-30);
		System.out.println(adm1);
		*/

	/* Q2.3
		Warrior dk = new Warrior(123, "Don Kishot"); // מתחיל עם 100 חיים dk
dk.decLifeVal(98);                      //  יירד ל-2dk ערך החיים של
Warrior rc = new Warrior(666, "Robbo-cop", "Samal");//  הוא חיילrc
rc.shoot(dk);              //  יורד ל-1dk ולכן ערך החיים של dk יורה ב-rc
System.out.println(dk); // - זוהי השורה הראשונה בפלטdk מדפיסים את מצבו של
rc.shoot(dk) ; //. אחראי ל-2 שורות הפלט הבאות   dk והפעם הורג את dk יורה ב-rc
System.out.println(dk); // - זוהי השורה הרביעית בפלטdk מדפיסים את מצבו של
dk.shoot(rc); //       כבר מת ואינו יכול לירותdkשורה זו גורמת לחריגה כיון ש-
*/

/* Q2.4
Officer cmdr1 = new Officer(20,"Kodkod","Aluf");    // מפקד גדול
  Officer cmdr2 = new Officer(10,"ShuShu","Sagam");   // מפקד קטן
  for (int i = 0 ; i < 3 ; i++){     // לכל אחד מהמפקדים מוסיפים 3 חיילים
	  cmdr1.add_warriors(new Warrior(Warrior.ctr,"Hayal"));
	  cmdr2.add_warriors(new Warrior(Warrior.ctr,"Hayal"));
  }
  cmdr1.add_warriors(cmdr2); // מוסיפים את המפקד הקטן תחת פיקוד המפקד הגדול

  Warrior x = new Warrior(666,"Enemy");           // חייל אויב
  System.out.println("Before shooting x="+x);     // הדפסה לפני (100 חיים)
  cmdr1.shoot(x);             // המפקד הגדול ירה באויב – זה גרם לירי של כולם על האויב
  System.out.println("After shooting x="+x);   // הדפסה אחרי הירי (92 חיים)

  cmdr2.shoot(new Person(100,"ctzn"));        // ירי של קצין על אזרח יגרום לחריגה
*/

System.out.println("***The end***");

	}
	
}
