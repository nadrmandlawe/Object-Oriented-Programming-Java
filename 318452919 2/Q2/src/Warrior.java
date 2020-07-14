public class Warrior extends Person implements Shooter{

	private String rank;
	public static int ctr;

	public Warrior(int id, String name) {
		super(id, name);
		rank = "Turai";
		ctr ++;
	}

	public Warrior(int id, String name, String rank) {
		super(id, name);
		this.rank = rank;
		ctr ++;
	}

	@Override
	public void shoot(Person other) throws Exception {
		if(getLive() <= 0) {
			throw new Exception("Dead warrior " + toString() +" cant shoot"); 
		} else {

			other.decLifeVal(1);
			if(other.getLive() == 0) {
				System.out.println(toString() + " just killed " + other.toString());

			}
		}


	}

	@Override
	public String toString() {
		return rank + " " +super.toString();
	}

}