public class BoxWeight extends Box{
	int d;
	
	BoxWeight(int a, int b, int c, int d){
		super(a,b,c);
		this.d = d;
	}
	
	void Result(){
		System.out.println("Total= " + a*b*c*d );
	}
}
