import java.util.*;	
	
class Main{
	public static void main(String[] args){
		MyClass<Integer> obj1 = new MyClass<>(10);
		MyClass<Double> obj2  = new MyClass<>(20.2);
		
		obj1.showType();
		obj2.showType();
	}
}
		


