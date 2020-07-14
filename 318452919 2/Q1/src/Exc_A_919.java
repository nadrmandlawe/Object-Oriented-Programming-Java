public class Exc_A_919 extends RuntimeException{
    private static final long serialVersionUID = 1L;
    private int numQ = 0;
    private String errMess="";
    public Exc_A_919(int numQ,String errMess, Throwable err) {
        super(errMess,err);
        this.numQ=numQ;
        this.errMess=errMess;

    }
    
	public String getMessage(){
        return "in question #"  + this.numQ + ":" +this.errMess;
    }
}