public class MyClass{
	int a,b;
	
	MyClass(int a, int b){
		this.a = a;
		this.b = b;
	}
	
	MyClass(int x){
		this(x,x);
	}
	
	MyClass(){
		this(0);
	}
}
