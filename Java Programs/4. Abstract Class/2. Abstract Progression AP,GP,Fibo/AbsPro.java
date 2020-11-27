public abstract class AbsPro{
	protected long current;
	public AbsPro(long start){
		current = start;
	}
	public AbsPro(){
		this(0);
	}
	public long nextItem(){
		long ans = current;
		work();
		return ans;
	}
	protected abstract void work();
	public void printSeries(int n){
		for(int i=0 ; i<n ; i++){
			System.out.print(" " + nextItem());
		}
	}
}
