class Main3{
	public static void main(String[] args){
		Fun<Integer> ob1 = new Fun<Integer>(20);
		Fun<Double> ob2 = new Fun<Double>(-20.0);
	
		System.out.println(ob1.absEqual(ob2));
	}
}
