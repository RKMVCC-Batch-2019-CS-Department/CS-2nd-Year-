public class ArithPro extends AbsPro{
	protected long gap;
	public ArithPro(long start, long space){
		super(start);
		gap = space;
	}
	public ArithPro(long space){
		this(0, space);
	}
	public ArithPro(){
		this(0,1);
	}
	
	protected void work(){
		current += gap;
	}
}
