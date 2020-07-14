public class Officer extends Warrior{

	private Warrior[] warriors;

	public Officer(int id, String name, String rank) {
		super(id, name, rank);

		warriors = new Warrior[10];
	}

	public int add_warriors(Warrior... args) {

		int entered = 0;
		for (Warrior insert : args) {
			boolean b = false;
			for (int i = 0; i < warriors.length; i++) {
				Warrior w = warriors[i];
				if(w == null || w.getLive() == 0) {
					warriors[i] = insert;
					b = true;
					entered ++;
					break;
				} 
			}
			if(b == false) { 
				System.out.println("Could not add new warrior" + insert.toString() + "because no room");
			}

		}

		return entered;
	}

	@Override
	public void shoot(Person other) throws Exception {
		if (! (other instanceof Warrior)) {
			throw new Exception("Officers dont shoot civilians"); 
		} else {
			super.shoot(other);
			for (int i = 0; i < warriors.length; i++) {
				if(warriors[i] != null) {
					warriors[i].shoot(other);
				}
			}
		}
	}

}