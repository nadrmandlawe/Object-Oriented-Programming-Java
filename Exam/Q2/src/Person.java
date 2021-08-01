public class Person{
    private  int id;
    private String name;
    private int alive;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
        this.alive = 100;
    }
    
    

    public int getId() {
		return id;
	}



	public String getName() {
		return name;
	}



	public int getLive() {
		return alive;
	}



	@Override
    public String toString() {
        String str = id+ "(" + alive + ")" + name;
        return str;
    }

    public void decLifeVal(int a) throws Exception{
    	if(a < 0) {
    		throw new Exception("decLifeVal must get a positive parameter"); 
    	} else {
    		alive = alive - a;
    		if(alive <= 0) {
    			System.out.println(toString() + " just died !!!");
    			alive = 0;
    		}
    	}
    }
    
    public boolean equals(Person other) {
    	if(!(other instanceof Person)) {
    		return false;
    	}
    	if(other.getId() == id) {
    		return true;
    	}
    	
    	return false;
    }
    
    
    
}