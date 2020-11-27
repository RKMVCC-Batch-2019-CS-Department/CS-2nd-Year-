public class Fun<T extends Number>{
	T num;
	
	Fun(T num){
		this.num = num;
	}
	
	boolean absEqual(Fun<?> ob){
		if(Math.abs(num.doubleValue()) == Math.abs(ob.num.doubleValue()))
			return true;
		return false;
	}
}
