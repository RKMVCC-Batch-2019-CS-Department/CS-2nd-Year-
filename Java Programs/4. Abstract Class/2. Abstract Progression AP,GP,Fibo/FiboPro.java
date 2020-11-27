public class FiboPro extends AbsPro{
	protected long now, prev;
	public FiboPro(long first, long second){
		super(first);
		prev = second-first;
	}
	public FiboPro(){
		this(0,1);
	}
	protected void work(){
		long temp = current;
		current = current + prev;
		prev = temp;
	}
}
