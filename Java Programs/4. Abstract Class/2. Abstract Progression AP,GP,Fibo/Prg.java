public class Prg{
	public static void main(String[] args){
		AbsPro a1 = new ArithPro(1,2);
		a1.printSeries(10);
		System.out.println();
		AbsPro g1 = new GeoPro(1,3);
		g1.printSeries(10);
		System.out.println();
		AbsPro f1 = new FiboPro();
		f1.printSeries(10);
		System.out.println();
	}
}
