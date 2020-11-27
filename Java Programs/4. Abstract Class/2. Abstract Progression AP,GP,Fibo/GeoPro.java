public class GeoPro extends AbsPro{
	protected long mul;
	public GeoPro(long start, long space){
		super(start);
		mul = space;
	}
	public GeoPro(long space){
		this(1, space);
	}
	public GeoPro(){
		this(1,2);
	}
	
	protected void work(){
		current *= mul;
	}
}
