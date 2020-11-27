class Main5{
	public static void main(String [] args){
		MyClass c1 = new MyClass(10,20);
		MyClass c2 = new MyClass(10);
		MyClass c3 = new MyClass();
		
		System.out.println("For c1: " + c1.a + c1.b);
		System.out.println("For c2: " + c2.a + c2.b);
		System.out.println("For c3: " + c3.a + c3.b);
	}
}
